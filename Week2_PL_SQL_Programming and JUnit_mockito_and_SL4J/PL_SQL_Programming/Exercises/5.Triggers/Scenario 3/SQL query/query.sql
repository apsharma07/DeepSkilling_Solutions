CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
  v_Balance NUMBER;
BEGIN
  SELECT Balance INTO v_Balance FROM Accounts WHERE AccountID = :NEW.AccountID;
  IF UPPER(:NEW.TransactionType) = 'WITHDRAWAL' AND :NEW.Amount > v_Balance THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds for withdrawal.');
  END IF;
  IF UPPER(:NEW.TransactionType) = 'DEPOSIT' AND :NEW.Amount <= 0 THEN
    RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be positive.');
  END IF;
END;
/
