CREATE OR REPLACE PACKAGE AccountOperations AS
  PROCEDURE OpenAccount(p_AccountID NUMBER, p_CustomerID NUMBER, p_Type VARCHAR2, p_Balance NUMBER);
  PROCEDURE CloseAccount(p_AccountID NUMBER);
  FUNCTION GetTotalBalance(p_CustomerID NUMBER) RETURN NUMBER;
END AccountOperations;
/


--Package Body

CREATE OR REPLACE PACKAGE BODY AccountOperations AS

  PROCEDURE OpenAccount(p_AccountID NUMBER, p_CustomerID NUMBER, p_Type VARCHAR2, p_Balance NUMBER) IS
  BEGIN
    INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
    VALUES (p_AccountID, p_CustomerID, p_Type, p_Balance, SYSDATE);
    COMMIT;
  END;

  PROCEDURE CloseAccount(p_AccountID NUMBER) IS
  BEGIN
    DELETE FROM Accounts WHERE AccountID = p_AccountID;
    COMMIT;
  END;

  FUNCTION GetTotalBalance(p_CustomerID NUMBER) RETURN NUMBER IS
    v_Total NUMBER;
  BEGIN
    SELECT SUM(Balance) INTO v_Total FROM Accounts WHERE CustomerID = p_CustomerID;
    RETURN NVL(v_Total, 0);
  END;

END AccountOperations;
/
