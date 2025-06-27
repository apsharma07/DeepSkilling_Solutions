DECLARE
  CURSOR txn_cursor IS
    SELECT c.CustomerID, c.Name, t.TransactionID, t.TransactionDate, t.Amount, t.TransactionType
    FROM Customers c
    JOIN Accounts a ON c.CustomerID = a.CustomerID
    JOIN Transactions t ON a.AccountID = t.AccountID
    WHERE TO_CHAR(t.TransactionDate, 'MMYYYY') = TO_CHAR(SYSDATE, 'MMYYYY')
    ORDER BY c.CustomerID, t.TransactionDate;

  v_row txn_cursor%ROWTYPE;
  v_current_customer_id Customers.CustomerID%TYPE := -1;
BEGIN
  DBMS_OUTPUT.PUT_LINE('Monthly Bank Statement');

  OPEN txn_cursor;
  LOOP
    FETCH txn_cursor INTO v_row;
    EXIT WHEN txn_cursor%NOTFOUND;
    IF v_current_customer_id != v_row.CustomerID THEN
      DBMS_OUTPUT.PUT_LINE('Customer ID: ' || v_row.CustomerID || ', Name: ' || v_row.Name);
      DBMS_OUTPUT.PUT_LINE('Transactions:');
      v_current_customer_id := v_row.CustomerID;
    END IF;
    DBMS_OUTPUT.PUT_LINE('  [' || TO_CHAR(v_row.TransactionDate, 'DD-Mon') || '] ' ||
                         v_row.TransactionType || ' - $' || v_row.Amount);

  END LOOP;
  CLOSE txn_cursor;
END;
/
