CREATE OR REPLACE PACKAGE EmployeeManagement AS
  PROCEDURE HireEmployee(p_EmpID NUMBER, p_Name VARCHAR2, p_Position VARCHAR2, p_Salary NUMBER, p_Dept VARCHAR2, p_HireDate DATE);
  PROCEDURE UpdateEmployee(p_EmpID NUMBER, p_Name VARCHAR2, p_Position VARCHAR2, p_Salary NUMBER, p_Dept VARCHAR2);
  FUNCTION GetAnnualSalary(p_EmpID NUMBER) RETURN NUMBER;
END EmployeeManagement;
/

--Package Body

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

  PROCEDURE HireEmployee(p_EmpID NUMBER, p_Name VARCHAR2, p_Position VARCHAR2, p_Salary NUMBER, p_Dept VARCHAR2, p_HireDate DATE) IS
  BEGIN
    INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
    VALUES (p_EmpID, p_Name, p_Position, p_Salary, p_Dept, p_HireDate);
    COMMIT;
  END;

  PROCEDURE UpdateEmployee(p_EmpID NUMBER, p_Name VARCHAR2, p_Position VARCHAR2, p_Salary NUMBER, p_Dept VARCHAR2) IS
  BEGIN
    UPDATE Employees
    SET Name = p_Name,
        Position = p_Position,
        Salary = p_Salary,
        Department = p_Dept
    WHERE EmployeeID = p_EmpID;
    COMMIT;
  END;

  FUNCTION GetAnnualSalary(p_EmpID NUMBER) RETURN NUMBER IS
    v_Salary NUMBER;
  BEGIN
    SELECT Salary INTO v_Salary FROM Employees WHERE EmployeeID = p_EmpID;
    RETURN v_Salary * 12;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      RETURN NULL;
  END;

END EmployeeManagement;
/
