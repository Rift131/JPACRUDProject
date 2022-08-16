-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema equipmentservicedb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `equipmentservicedb` ;

-- -----------------------------------------------------
-- Schema equipmentservicedb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `equipmentservicedb` DEFAULT CHARACTER SET utf8 ;
USE `equipmentservicedb` ;

-- -----------------------------------------------------
-- Table `equipment_service_references`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `equipment_service_references` ;

CREATE TABLE IF NOT EXISTS `equipment_service_references` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `equipment_name` VARCHAR(100) NOT NULL,
  `equipment_manufacturer` VARCHAR(45) NOT NULL,
  `equipment_model` VARCHAR(45) NOT NULL,
  `equipment_serial_number` VARCHAR(45) NULL,
  `engine_manufacturer` VARCHAR(45) NULL,
  `engine_model` VARCHAR(45) NULL,
  `engine_serial_number` VARCHAR(45) NULL,
  `engine_oil_manufacturer` VARCHAR(45) NULL,
  `engine_oil_type` VARCHAR(45) NULL,
  `engine_oil_viscosity_grade` VARCHAR(45) NULL,
  `engine_oil_filter_manufacturer` VARCHAR(45) NULL,
  `engine_oil_filer_part_number` VARCHAR(45) NULL,
  `engine_air_filter_manufacturer` VARCHAR(45) NULL,
  `engine_air_filter_part_number` VARCHAR(45) NULL,
  `egnine_fuel_specifications` VARCHAR(45) NULL,
  `engine_fuel_filter_manufacturer` VARCHAR(45) NULL,
  `engine_fuel_filter_part_number` VARCHAR(45) NULL,
  `engine_fuel_oil` TINYINT(1) NULL,
  `engine_fuel_oil_manufacturer` VARCHAR(45) NULL,
  `engine_fuel_oil_name` VARCHAR(45) NULL,
  `engine_fuel_oil_serial_number` VARCHAR(45) NULL,
  `equipment_consumable_name` VARCHAR(45) NULL,
  `equipment_consumable_manufacturer` VARCHAR(45) NULL,
  `equipment_consumable_part_number` VARCHAR(45) NULL,
  `equipment_consumable_name_2` VARCHAR(45) NULL,
  `equipment_consumable_manufacturer_2` VARCHAR(45) NULL,
  `equipment_consumable_part_number_2` VARCHAR(45) NULL,
  `equipment_consumable_name_3` VARCHAR(45) NULL,
  `equipment_consumable_manufacturer_3` VARCHAR(45) NULL,
  `equipment_consumable_part_number_3` VARCHAR(45) NULL,
  `equipment_notes` LONGTEXT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS eqpsrvcuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'eqpsrvcuser'@'localhost' IDENTIFIED BY 'eqpsrvcuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'eqpsrvcuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `equipment_service_references`
-- -----------------------------------------------------
START TRANSACTION;
USE `equipmentservicedb`;
INSERT INTO `equipment_service_references` (`id`, `equipment_name`, `equipment_manufacturer`, `equipment_model`, `equipment_serial_number`, `engine_manufacturer`, `engine_model`, `engine_serial_number`, `engine_oil_manufacturer`, `engine_oil_type`, `engine_oil_viscosity_grade`, `engine_oil_filter_manufacturer`, `engine_oil_filer_part_number`, `engine_air_filter_manufacturer`, `engine_air_filter_part_number`, `egnine_fuel_specifications`, `engine_fuel_filter_manufacturer`, `engine_fuel_filter_part_number`, `engine_fuel_oil`, `engine_fuel_oil_manufacturer`, `engine_fuel_oil_name`, `engine_fuel_oil_serial_number`, `equipment_consumable_name`, `equipment_consumable_manufacturer`, `equipment_consumable_part_number`, `equipment_consumable_name_2`, `equipment_consumable_manufacturer_2`, `equipment_consumable_part_number_2`, `equipment_consumable_name_3`, `equipment_consumable_manufacturer_3`, `equipment_consumable_part_number_3`, `equipment_notes`) VALUES (1, 'Chainsaw', 'Stihl', 'MS171', '12345679', 'Kohler', 'KPH34-221', 'K34-18976', 'Fuel-Oill Only', NULL, NULL, NULL, NULL, 'BreatheBetter', 'BB124-45612', 'E85', 'Stihl', 'FF34-2', NULL, 'Stihl', 'Hp Ultra', '0781-313-8002', 'Bar', 'Stihl', 'BR32-4125', 'Bar Oil', 'Stihl', 'OZ56-212', 'Bar Nut', 'HardlyWear', 'HW45-789', 'This chainsaw is needed for JUnit tests. Please do not alter or delete.');
INSERT INTO `equipment_service_references` (`id`, `equipment_name`, `equipment_manufacturer`, `equipment_model`, `equipment_serial_number`, `engine_manufacturer`, `engine_model`, `engine_serial_number`, `engine_oil_manufacturer`, `engine_oil_type`, `engine_oil_viscosity_grade`, `engine_oil_filter_manufacturer`, `engine_oil_filer_part_number`, `engine_air_filter_manufacturer`, `engine_air_filter_part_number`, `egnine_fuel_specifications`, `engine_fuel_filter_manufacturer`, `engine_fuel_filter_part_number`, `engine_fuel_oil`, `engine_fuel_oil_manufacturer`, `engine_fuel_oil_name`, `engine_fuel_oil_serial_number`, `equipment_consumable_name`, `equipment_consumable_manufacturer`, `equipment_consumable_part_number`, `equipment_consumable_name_2`, `equipment_consumable_manufacturer_2`, `equipment_consumable_part_number_2`, `equipment_consumable_name_3`, `equipment_consumable_manufacturer_3`, `equipment_consumable_part_number_3`, `equipment_notes`) VALUES (2, 'Chainsaw', 'Stihl', 'MS461', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `equipment_service_references` (`id`, `equipment_name`, `equipment_manufacturer`, `equipment_model`, `equipment_serial_number`, `engine_manufacturer`, `engine_model`, `engine_serial_number`, `engine_oil_manufacturer`, `engine_oil_type`, `engine_oil_viscosity_grade`, `engine_oil_filter_manufacturer`, `engine_oil_filer_part_number`, `engine_air_filter_manufacturer`, `engine_air_filter_part_number`, `egnine_fuel_specifications`, `engine_fuel_filter_manufacturer`, `engine_fuel_filter_part_number`, `engine_fuel_oil`, `engine_fuel_oil_manufacturer`, `engine_fuel_oil_name`, `engine_fuel_oil_serial_number`, `equipment_consumable_name`, `equipment_consumable_manufacturer`, `equipment_consumable_part_number`, `equipment_consumable_name_2`, `equipment_consumable_manufacturer_2`, `equipment_consumable_part_number_2`, `equipment_consumable_name_3`, `equipment_consumable_manufacturer_3`, `equipment_consumable_part_number_3`, `equipment_notes`) VALUES (3, 'Logsplitter', 'Swishers', 'LSRB67522', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `equipment_service_references` (`id`, `equipment_name`, `equipment_manufacturer`, `equipment_model`, `equipment_serial_number`, `engine_manufacturer`, `engine_model`, `engine_serial_number`, `engine_oil_manufacturer`, `engine_oil_type`, `engine_oil_viscosity_grade`, `engine_oil_filter_manufacturer`, `engine_oil_filer_part_number`, `engine_air_filter_manufacturer`, `engine_air_filter_part_number`, `egnine_fuel_specifications`, `engine_fuel_filter_manufacturer`, `engine_fuel_filter_part_number`, `engine_fuel_oil`, `engine_fuel_oil_manufacturer`, `engine_fuel_oil_name`, `engine_fuel_oil_serial_number`, `equipment_consumable_name`, `equipment_consumable_manufacturer`, `equipment_consumable_part_number`, `equipment_consumable_name_2`, `equipment_consumable_manufacturer_2`, `equipment_consumable_part_number_2`, `equipment_consumable_name_3`, `equipment_consumable_manufacturer_3`, `equipment_consumable_part_number_3`, `equipment_notes`) VALUES (4, 'Lawnmower', 'BadBoy', 'Maverick', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `equipment_service_references` (`id`, `equipment_name`, `equipment_manufacturer`, `equipment_model`, `equipment_serial_number`, `engine_manufacturer`, `engine_model`, `engine_serial_number`, `engine_oil_manufacturer`, `engine_oil_type`, `engine_oil_viscosity_grade`, `engine_oil_filter_manufacturer`, `engine_oil_filer_part_number`, `engine_air_filter_manufacturer`, `engine_air_filter_part_number`, `egnine_fuel_specifications`, `engine_fuel_filter_manufacturer`, `engine_fuel_filter_part_number`, `engine_fuel_oil`, `engine_fuel_oil_manufacturer`, `engine_fuel_oil_name`, `engine_fuel_oil_serial_number`, `equipment_consumable_name`, `equipment_consumable_manufacturer`, `equipment_consumable_part_number`, `equipment_consumable_name_2`, `equipment_consumable_manufacturer_2`, `equipment_consumable_part_number_2`, `equipment_consumable_name_3`, `equipment_consumable_manufacturer_3`, `equipment_consumable_part_number_3`, `equipment_notes`) VALUES (5, 'Weed Trimmer', 'Stihl', 'FS 90 R', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Trim line', 'Stihl', '000 930 2340', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `equipment_service_references` (`id`, `equipment_name`, `equipment_manufacturer`, `equipment_model`, `equipment_serial_number`, `engine_manufacturer`, `engine_model`, `engine_serial_number`, `engine_oil_manufacturer`, `engine_oil_type`, `engine_oil_viscosity_grade`, `engine_oil_filter_manufacturer`, `engine_oil_filer_part_number`, `engine_air_filter_manufacturer`, `engine_air_filter_part_number`, `egnine_fuel_specifications`, `engine_fuel_filter_manufacturer`, `engine_fuel_filter_part_number`, `engine_fuel_oil`, `engine_fuel_oil_manufacturer`, `engine_fuel_oil_name`, `engine_fuel_oil_serial_number`, `equipment_consumable_name`, `equipment_consumable_manufacturer`, `equipment_consumable_part_number`, `equipment_consumable_name_2`, `equipment_consumable_manufacturer_2`, `equipment_consumable_part_number_2`, `equipment_consumable_name_3`, `equipment_consumable_manufacturer_3`, `equipment_consumable_part_number_3`, `equipment_notes`) VALUES (6, 'Wood Stove', 'Lopi', 'Leyden', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

COMMIT;

