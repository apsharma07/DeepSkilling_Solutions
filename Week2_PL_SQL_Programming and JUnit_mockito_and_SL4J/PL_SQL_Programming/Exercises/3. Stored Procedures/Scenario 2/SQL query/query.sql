CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_Department VARCHAR2,
  p_BonusPercent NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_BonusPercent / 100)
  WHERE Department = p_Department;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Bonus applied to employees in department: ' || p_Department);
END;
/
