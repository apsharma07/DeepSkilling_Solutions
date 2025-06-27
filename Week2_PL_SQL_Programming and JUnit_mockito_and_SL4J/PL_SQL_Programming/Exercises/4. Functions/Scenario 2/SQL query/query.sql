CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    p_LoanAmount IN NUMBER,
    p_InterestRate IN NUMBER,  
    p_DurationYears IN NUMBER  
) RETURN NUMBER
IS
    v_RatePerMonth NUMBER;
    v_NumPayments NUMBER;
    v_EMI NUMBER;
BEGIN
    v_RatePerMonth := p_InterestRate / (12 * 100); -- Convert % to monthly decimal
    v_NumPayments := p_DurationYears * 12;

    v_EMI := (p_LoanAmount * v_RatePerMonth * POWER(1 + v_RatePerMonth, v_NumPayments)) /
             (POWER(1 + v_RatePerMonth, v_NumPayments) - 1);

    RETURN ROUND(v_EMI, 2);
EXCEPTION
    WHEN ZERO_DIVIDE THEN
        RETURN 0;
    WHEN OTHERS THEN
        RETURN NULL;
END;
/
