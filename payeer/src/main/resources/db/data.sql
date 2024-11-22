SET FOREIGN_KEY_CHECKS = 0;


INSERT INTO wallet (balance, id, account_number) VALUES
(300.00, 200, '123456789'),
(5000.00, 201, '012345678'),
(6000.00, 305, '012545678');



INSERT INTO customer (id, wallet_id) VALUES
(2, 201),
(3, 305);
