-- -----------------------------------------------------
-- Table `fingermanagement`.`persistent_logins`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `fingermanagement`.`persistent_login_admin` ;

CREATE TABLE IF NOT EXISTS `fingermanagement`.`persistent_login_admin` (
`username` VARCHAR(150) NOT NULL,
`series` VARCHAR(64) NOT NULL,
`token` VARCHAR(64) NOT NULL,
`last_used` TIMESTAMP NOT NULL,
PRIMARY KEY (`series`))
ENGINE = InnoDB;