CREATE OR REPLACE PROCEDURE TransferFunds(
  p_source_account_id IN NUMBER,
  p_dest_account_id IN NUMBER,
  p_amount IN NUMBER
) IS
  v_source_balance NUMBER;
BEGIN
  -- Get source account balance
  SELECT balance INTO v_source_balance
  FROM accounts
  WHERE account_id = p_source_account_id
  FOR UPDATE;

  -- Check if sufficient balance
  IF v_source_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
  END IF;

  -- Deduct from source
  UPDATE accounts
  SET balance = balance - p_amount
  WHERE account_id = p_source_account_id;

  -- Add to destination
  UPDATE accounts
  SET balance = balance + p_amount
  WHERE account_id = p_dest_account_id;

  COMMIT;
END;
