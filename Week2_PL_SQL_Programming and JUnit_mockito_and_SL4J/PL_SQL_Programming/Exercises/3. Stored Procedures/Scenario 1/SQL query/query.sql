CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE Accounts
  SET Balance = Balance + (Balance * 0.01),
      LastModified = SYSDATE
  WHERE AccountType = 'Savings';

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Interest applied to all Savings accounts.');
END;
/
