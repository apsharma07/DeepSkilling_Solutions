DECLARE
  CURSOR acc_cursor IS
    SELECT AccountID, Balance FROM Accounts;
  v_acc acc_cursor%ROWTYPE;
  v_fee CONSTANT NUMBER := 500;
BEGIN
  OPEN acc_cursor;
  LOOP
    FETCH acc_cursor INTO v_acc;
    EXIT WHEN acc_cursor%NOTFOUND;
    IF v_acc.Balance >= v_fee THEN
      UPDATE Accounts
      SET Balance = Balance - v_fee,
          LastModified = SYSDATE
      WHERE AccountID = v_acc.AccountID;
      DBMS_OUTPUT.PUT_LINE('Annual fee applied to AccountID: ' || v_acc.AccountID);
    ELSE
      DBMS_OUTPUT.PUT_LINE('Skipped AccountID: ' || v_acc.AccountID || ' due to low balance.');
    END IF;
  END LOOP;
  CLOSE acc_cursor;

  COMMIT;
END;
/
