BEGIN
  FOR cust IN (SELECT customer_id FROM customers WHERE balance > 10000) LOOP
    UPDATE customers
    SET isVIP = 'TRUE'
    WHERE customer_id = cust.customer_id;
  END LOOP;
  COMMIT;
END;
