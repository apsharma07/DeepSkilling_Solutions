ALTER TABLE Customers ADD IsVIP VARCHAR(10) DEFAULT 'NO'; 
BEGIN
  FOR c IN (SELECT CustomerID, Balance FROM Customers) LOOP
    IF c.Balance > 10000 THEN
      UPDATE Customers
      SET IsVIP = 'Y'
      WHERE CustomerID = c.CustomerID;
    ELSE
      UPDATE Customers
      SET IsVIP = 'N'
      WHERE CustomerID = c.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/
