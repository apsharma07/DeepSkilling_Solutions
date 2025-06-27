CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_EmployeeID IN NUMBER,
    p_Percent IN NUMBER
) AS
    v_Salary NUMBER;
BEGIN
    SELECT Salary INTO v_Salary FROM Employees WHERE EmployeeID = p_EmployeeID;
    UPDATE Employees
    SET Salary = Salary + (Salary * p_Percent / 100)
    WHERE EmployeeID = p_EmployeeID;

    COMMIT;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error: Employee with ID ' || p_EmployeeID || ' not found.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
END;
/
