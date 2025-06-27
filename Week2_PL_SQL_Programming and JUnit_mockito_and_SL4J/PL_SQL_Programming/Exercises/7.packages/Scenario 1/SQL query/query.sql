CREATE OR REPLACE PACKAGE CustomerManagement AS
  PROCEDURE AddCustomer(p_CustomerID NUMBER, p_Name VARCHAR2, p_DOB DATE, p_Balance NUMBER);
  PROCEDURE UpdateCustomer(p_CustomerID NUMBER, p_Name VARCHAR2, p_DOB DATE, p_Balance NUMBER);
  FUNCTION GetCustomerBalance(p_CustomerID NUMBER) RETURN NUMBER;
END CustomerManagement;
/


--package Body

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

  PROCEDURE AddCustomer(p_CustomerID NUMBER, p_Name VARCHAR2, p_DOB DATE, p_Balance NUMBER) IS
  BEGIN
    INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
    VALUES (p_CustomerID, p_Name, p_DOB, p_Balance, SYSDATE);
    COMMIT;
  EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
      DBMS_OUTPUT.PUT_LINE('Customer already exists.');
  END;

  PROCEDURE UpdateCustomer(p_CustomerID NUMBER, p_Name VARCHAR2, p_DOB DATE, p_Balance NUMBER) IS
  BEGIN
    UPDATE Customers
    SET Name = p_Name,
        DOB = p_DOB,
        Balance = p_Balance,
        LastModified = SYSDATE
    WHERE CustomerID = p_CustomerID;
    COMMIT;
  END;

  FUNCTION GetCustomerBalance(p_CustomerID NUMBER) RETURN NUMBER IS
    v_Balance NUMBER;
  BEGIN
    SELECT Balance INTO v_Balance FROM Customers WHERE CustomerID = p_CustomerID;
    RETURN v_Balance;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      RETURN NULL;
  END;

END CustomerManagement;
/
