INSERT INTO `account` (`account_id`, `username`,`email`, `password`, `role`, `code`, `status`, `start_date`, `end_date`,`update_date`,`update_user`,`update_program`)
VALUES
	(1, 'NVCUONG01','NVCUONG01@gmail.com', '$2a$11$jOsRXChcxwZCShq/ob1FB.QvFwmAHFaL5v8EsZv806oJPk/Vl98ne', 'Administrator', 'xxxx-xxxx-xxxx-xxxx', 1,'2017-06-05','2017-09-30',NULL , NULL, NULL),
	(2, 'NVCUONG02','NVCUONG02@gmail.com', '$2a$10$nIrCmJgppsqYAHi7gk7IjONmt6RLY8EMegi4DMywnrkpqHGqvBvZ6', 'Staff', 'xxxx-xxxx-xxxx-xxxx', 1, '2017-06-05','2017-09-30',NULL , NULL, NULL),
	(3, 'NVCUONG03','NVCUONG03@gmail.com', '$2a$10$nIrCmJgppsqYAHi7gk7IjONmt6RLY8EMegi4DMywnrkpqHGqvBvZ6', 'Customer', 'xxxx-xxxx-xxxx-xxxx', 1, '2017-06-05','2017-09-30',NULL , NULL, NULL),
	(4, 'NVCUONG04','NVCUONG04@gmail.com', '$2a$10$nIrCmJgppsqYAHi7gk7IjONmt6RLY8EMegi4DMywnrkpqHGqvBvZ6', 'Customer', 'xxxx-xxxx-xxxx-xxxx', 1, '2017-06-05','2017-09-30',NULL , NULL, NULL),
	(5, 'NVCUONG05','NVCUONG05@gmail.com', '$2a$10$nIrCmJgppsqYAHi7gk7IjONmt6RLY8EMegi4DMywnrkpqHGqvBvZ6', 'Customer', 'xxxx-xxxx-xxxx-xxxx', 1, '2017-06-05','2017-09-30',NULL , NULL, NULL),
	(6, 'NVCUONG06','NVCUONG06@gmail.com', '$2a$10$nIrCmJgppsqYAHi7gk7IjONmt6RLY8EMegi4DMywnrkpqHGqvBvZ6', 'Customer', 'xxxx-xxxx-xxxx-xxxx', 1, '2017-06-05','2017-09-30',NULL , NULL, NULL),
	(7, 'NVCUONG07','NVCUONG07@gmail.com', '$2a$10$nIrCmJgppsqYAHi7gk7IjONmt6RLY8EMegi4DMywnrkpqHGqvBvZ6', 'Customer', 'xxxx-xxxx-xxxx-xxxx', 1, '2017-06-05','2017-09-30',NULL , NULL, NULL);


INSERT INTO `managementgym`(`managementgym_id`,`account_id`,`name`,`fullname`,`age`,`picture`,`phonenumber`,`codefinger`,`start_date`,`end_date`,`update_date`,`update_user`,`update_program`)
VALUES
(1,1,'Name Khách hàng 1','Nguyễn Văn A','20','','789234','12','2017-06-05','2017-09-30',NULL , NULL ,NULL ),
(2,2,'Name Khách hàng 2','Nguyễn Văn B','20','','321234','34','2017-06-05','2017-09-30',NULL , NULL ,NULL ),
(3,3,'Name Khách hàng 3','Nguyễn Văn C','20','','666234','56','2017-06-05','2017-09-30',NULL , NULL ,NULL ),
(4,3,'Name Khách hàng 4','Nguyễn Văn D','20','','234234','45','2017-06-05','2017-09-30',NULL , NULL ,NULL ),
(5,3,'Name Khách hàng 5','Nguyễn Văn E','20','','234234','14','2017-06-05','2017-09-30',NULL , NULL ,NULL );