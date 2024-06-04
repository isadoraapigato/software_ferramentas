-- MySQL Script generated by MySQL Workbench
-- Mon Jun  3 21:27:46 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema emprestimo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema emprestimo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `emprestimo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `emprestimo` ;

-- -----------------------------------------------------
-- Table `emprestimo`.`amigos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `emprestimo`.`amigos` (
  `idamigos` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL DEFAULT NULL,
  `telefone` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idamigos`))
ENGINE = InnoDB
AUTO_INCREMENT = 23
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `emprestimo`.`ferramentas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `emprestimo`.`ferramentas` (
  `idferramentas` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `marca` VARCHAR(45) NULL,
  `custo` DOUBLE NULL,
  PRIMARY KEY (`idferramentas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `emprestimo`.`emprestimos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `emprestimo`.`emprestimos` (
  `amigoid` INT NOT NULL,
  `data_emprestimo` DATE NULL DEFAULT NULL,
  `ferramentaid` INT NOT NULL,
  `data_devolucao` DATE NULL,
  PRIMARY KEY (`amigoid`, `ferramentaid`),
  INDEX `ferramentaid_idx` (`ferramentaid` ASC) VISIBLE,
  CONSTRAINT `amigoid`
    FOREIGN KEY (`amigoid`)
    REFERENCES `emprestimo`.`amigos` (`idamigos`),
  CONSTRAINT `ferramentaid`
    FOREIGN KEY (`ferramentaid`)
    REFERENCES `emprestimo`.`ferramentas` (`idferramentas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;