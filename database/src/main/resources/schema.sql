-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema fingermanagement
-- -----------------------------------------------------
-- DROP SCHEMA IF EXISTS `fingermanagement` ;

-- -----------------------------------------------------
-- Schema fingermanagement
-- -----------------------------------------------------
-- CREATE SCHEMA IF NOT EXISTS `fingermanagement` DEFAULT CHARACTER SET utf8mb4 ;
-- USE `fingermanagement` ;

-- -----------------------------------------------------
-- Table `fingermanagement`.`account`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `fingermanagement`.`account` ;

CREATE TABLE IF NOT EXISTS `fingermanagement`.`account` (
  `account_id` INT NOT NULL AUTO_INCREMENT, -- mã account
  `username` VARCHAR(45) NOT NULL UNIQUE, -- tên đăng nhập
  `email` VARCHAR(45) NOT NULL, -- email đăng nhập
  `password` VARCHAR(60) NOT NULL, -- Mật khẩu
  `role` VARCHAR(45) NOT NULL, -- Loại : Admin - Quản lý cấp cao,Customer - khách hàng ,Staff - nhân viên quản trị
  `code` VARCHAR(45) NOT NULL, -- Mã active tài khoản
  `status` BIT NOT NULL, -- Trạng thái tài khoản
  `start_date` DATE NOT NULL, -- Ngày bắt đầu hoạt động
  `end_date` DATE NOT NULL, -- Ngày kết thúc trạng thái active.
  `update_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- Ngày giờ cuối cùng update
  `update_user` VARCHAR(300) NULL, -- Hiển thị người update cuối cùng
  `update_program` VARCHAR(300) NULL, -- Hiển thị chức năng gọi : Insert hay Update
  PRIMARY KEY (`account_id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table dùng để backup data. Lưu trữ tất cả data của customer
-- Table `fingermanagement`.`managementgym`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `fingermanagement`.`managementgym` ;

CREATE TABLE IF NOT EXISTS `fingermanagement`.`managementgym` (
  `managementgym_id` INT NOT NULL AUTO_INCREMENT, -- Mã khách hàng của phòng gym.
  `account_id` INT NOT NULL, -- Mã phòng gym
  `name` VARCHAR(45) NOT NULL, -- Tên khách hàng
  `fullname` VARCHAR(45) NOT NULL, -- Tên đầy đù
  `age` VARCHAR(4) NOT NULL, -- Tuổi
  `picture` VARCHAR(45) NOT NULL, -- Hình đại diện
  `phonenumber` VARCHAR(45) NOT NULL, -- Số điện thoại
  `codefinger` VARCHAR(45) NOT NULL UNIQUE,   -- Mã vân tay
  `start_date` DATE NOT NULL, -- Ngày bắt đầu tập
  `end_date` DATE NOT NULL, -- Ngày kết thúc tập.
  `update_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_user` VARCHAR(300) NULL,
  `update_program` VARCHAR(300) NULL,
  PRIMARY KEY (`managementgym_id`),
  INDEX `fk_managementgym_account_idx` (`account_id` ASC),
  CONSTRAINT `managementgym_account`
    FOREIGN KEY (`account_id`)
    REFERENCES `fingermanagement`.`account` (`account_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
