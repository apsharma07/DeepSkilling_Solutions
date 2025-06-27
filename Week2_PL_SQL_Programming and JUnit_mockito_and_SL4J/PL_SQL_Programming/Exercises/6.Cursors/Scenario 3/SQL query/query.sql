DECLARE
  CURSOR loan_cursor IS
    SELECT LoanID, LoanAmount, InterestRate FROM Loans;

  v_loan loan_cursor%ROWTYPE;
BEGIN
  OPEN loan_cursor;
  LOOP
    FETCH loan_cursor INTO v_loan;
    EXIT WHEN loan_cursor%NOTFOUND;

    IF v_loan.LoanAmount > 50000 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE LoanID = v_loan.LoanID;

      DBMS_OUTPUT.PUT_LINE('Interest rate reduced for LoanID: ' || v_loan.LoanID);

    ELSIF v_loan.LoanAmount < 10000 THEN
      UPDATE Loans
      SET InterestRate = InterestRate + 0.5
      WHERE LoanID = v_loan.LoanID;

      DBMS_OUTPUT.PUT_LINE('Interest rate increased for LoanID: ' || v_loan.LoanID);
    END IF;
  END LOOP;
  CLOSE loan_cursor;

  COMMIT;
END;
/
