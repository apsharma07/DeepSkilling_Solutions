CREATE OR REPLACE PROCEDURE TransferFunds(
  p_FromAccountID NUMBER,
  p_ToAccountID NUMBER,
  p_Amount NUMBER
) AS
  v_Balance NUMBER;
BEGIN
  -- Get source account balance
  SELECT Balance INTO v_Balance FROM Accounts WHERE AccountID = p_FromAccountID FOR UPDATE;

  IF v_Balance < p_Amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  END IF;

  -- Deduct from source
  UPDATE Accounts
  SET Balance = Balance - p_Amount,
      LastModified = SYSDATE
  WHERE AccountID = p_FromAccountID;

  -- Add to destination
  UPDATE Accounts
  SET Balance = Balance + p_Amount,
      LastModified = SYSDATE
  WHERE AccountID = p_ToAccountID;

  COMMIT;

  DBMS_OUTPUT.PUT_LINE('Transferred ' || p_Amount || ' from Account ' || p_FromAccountID || ' to Account ' || p_ToAccountID);
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Account not found.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
    ROLLBACK;
END;
/
