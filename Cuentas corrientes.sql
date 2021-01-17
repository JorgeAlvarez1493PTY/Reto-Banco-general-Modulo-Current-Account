DELIMITER //
CREATE PROCEDURE getcurrentaccounts()
BEGIN
   select Account_Name, Account_number, Balance from taccounts1  where currentac ='Y' ;
   END //

DELIMITER ;

COMMIT;