BEGIN
  FOR l IN (
    SELECT l.LoanID, l.CustomerID, l.EndDate, c.Name
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || l.LoanID || ' for ' || l.Name || 
                         ' is due on ' || TO_CHAR(l.EndDate, 'YYYY-MM-DD'));
  END LOOP;
END;
/
