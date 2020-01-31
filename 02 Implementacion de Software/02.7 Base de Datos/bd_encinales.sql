-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bd_encinales
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bd_encinales
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_encinales` DEFAULT CHARACTER SET utf8 ;
USE `bd_encinales` ;

-- -----------------------------------------------------
-- Table `bd_encinales`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`Producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `Clave` VARCHAR(45) NULL,
  `NombreProducto` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(45) NOT NULL,
  `Imagen` LONGBLOB NULL,
  `PrecioUnitario` DOUBLE NULL,
  PRIMARY KEY (`idProducto`),
  UNIQUE INDEX `Clave_UNIQUE` (`Clave` ASC) ,
  UNIQUE INDEX `idProducto_UNIQUE` (`idProducto` ASC) ,
  UNIQUE INDEX `NombreProducto_UNIQUE` (`NombreProducto` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`Produccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`Produccion` (
  `idProduccion` INT NOT NULL AUTO_INCREMENT,
  `Cantidad` DOUBLE NULL,
  `UnidadMedida` VARCHAR(45) NULL,
  `ElementoCosto` VARCHAR(45) NULL,
  `Personal` INT NULL,
  `PrecioUnit` DOUBLE NULL,
  `PrecioCantidad` DOUBLE NULL,
  `Producto_idProducto` INT NOT NULL,
  PRIMARY KEY (`idProduccion`),
  INDEX `fk_Produccion_Producto_idx` (`Producto_idProducto` ASC) ,
  UNIQUE INDEX `idProduccion_UNIQUE` (`idProduccion` ASC) ,
  CONSTRAINT `fk_Produccion_Producto`
    FOREIGN KEY (`Producto_idProducto`)
    REFERENCES `bd_encinales`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`DP_Produccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`DP_Produccion` (
  `idDeterminacionPrecio` INT NOT NULL AUTO_INCREMENT,
  `CostoUnitOperativo` DOUBLE NULL,
  `CostoTotalVenta` DOUBLE NULL,
  `Utilidad` DOUBLE NULL,
  `PrecioSinIVA` DOUBLE NULL,
  `PrecioConIVA` DOUBLE NULL,
  PRIMARY KEY (`idDeterminacionPrecio`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`ConsumoElectrico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`ConsumoElectrico` (
  `idConsumoElectrico` INT NOT NULL AUTO_INCREMENT,
  `NombreEquipos` VARCHAR(45) NOT NULL,
  `ConsumoKW/Eq` DOUBLE NULL,
  `NumEquipo` INT NULL,
  `HorasEquipo` DOUBLE NULL,
  `KW/Hora` DOUBLE NULL,
  `WATTS/Dia` DOUBLE NULL,
  `KW/Dia` DOUBLE NULL,
  `DiasPorMes` INT NULL,
  `KW/Mes` DOUBLE NULL,
  `Producto_idProducto` INT NOT NULL,
  PRIMARY KEY (`idConsumoElectrico`),
  INDEX `fk_ConsumoElectrico_Producto1_idx` (`Producto_idProducto` ASC) ,
  UNIQUE INDEX `NombreEquipos_UNIQUE` (`NombreEquipos` ASC) ,
  UNIQUE INDEX `idConsumoElectrico_UNIQUE` (`idConsumoElectrico` ASC) ,
  CONSTRAINT `fk_ConsumoElectrico_Producto1`
    FOREIGN KEY (`Producto_idProducto`)
    REFERENCES `bd_encinales`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`DP_ConsumoElectrico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`DP_ConsumoElectrico` (
  `idDeterPrecioConsumo` INT NOT NULL AUTO_INCREMENT,
  `TotalKW/Hora` DOUBLE NULL,
  `PrecioKW/Hora` DOUBLE NULL,
  `Subtotal` DOUBLE NULL,
  `TotalIVA` DOUBLE NULL,
  PRIMARY KEY (`idDeterPrecioConsumo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`ReporteCostes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`ReporteCostes` (
  `idReporteCostes` INT NOT NULL AUTO_INCREMENT,
  `Especificaciones` VARCHAR(45) NULL,
  `Diametro` DOUBLE NULL,
  `PesoMaterial` DOUBLE NULL,
  `UnidadEmpaque` DOUBLE NULL,
  `UnidadUtilización_m2` DOUBLE NULL,
  `UnidadUtilizacion_kg` DOUBLE NULL,
  `Merma` DOUBLE NULL,
  `C_MatPrimPlaca` DOUBLE NULL,
  `C_MatPrimRecocido` DOUBLE NULL,
  `C_MatPrimPintura` DOUBLE NULL,
  `C_MatPrimTotal` DOUBLE NULL,
  `TProdReq` DOUBLE NULL,
  `TPintado` DOUBLE NULL,
  `TProdAmarre` DOUBLE NULL,
  `C_OpTroquelado` DOUBLE NULL,
  `C_OpPintado` DOUBLE NULL,
  `C_OpAmarre` DOUBLE NULL,
  `C_OpTotal` DOUBLE NULL,
  `ConsEnerKW/h` DOUBLE NULL,
  `ConsEnerPesos` DOUBLE NULL,
  `CostoAdmin` DOUBLE NULL,
  `CostoFleteEmbarq` DOUBLE NULL,
  `CostoTotalOp` DOUBLE NULL,
  `Utilidad` DOUBLE NULL,
  `IVA` DOUBLE NULL,
  `PrecioSugerido` DOUBLE NULL,
  `Producto_idProducto` INT NOT NULL,
  PRIMARY KEY (`idReporteCostes`),
  INDEX `fk_ReporteCostes_Producto1_idx` (`Producto_idProducto` ASC) ,
  CONSTRAINT `fk_ReporteCostes_Producto1`
    FOREIGN KEY (`Producto_idProducto`)
    REFERENCES `bd_encinales`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`Constantes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`Constantes` (
  `idConstantes` INT NOT NULL AUTO_INCREMENT,
  `CostoTotalOp` DOUBLE NULL,
  `CostoUnitOp` DOUBLE NULL,
  `Utilidad` DOUBLE NULL,
  `IVA` DOUBLE NULL,
  `PrecioKW/Mes` DOUBLE NULL,
  PRIMARY KEY (`idConstantes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`Usuarios` (
  `idUsuarios` INT NOT NULL AUTO_INCREMENT,
  `Usuario` VARCHAR(45) NOT NULL,
  `NomCompleto` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuarios`),
  UNIQUE INDEX `idUsuarios_UNIQUE` (`idUsuarios` ASC) ,
  UNIQUE INDEX `Usuario_UNIQUE` (`Usuario` ASC) ,
  UNIQUE INDEX `NomCompleto_UNIQUE` (`NomCompleto` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`Facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`Facturas` (
  `idFacturas` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Archivo` LONGBLOB NULL,
  `Formato` VARCHAR(45) NULL,
  `Fecha` DATE NULL,
  PRIMARY KEY (`idFacturas`),
  UNIQUE INDEX `idFacturas_UNIQUE` (`idFacturas` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`Competencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`Competencia` (
  `idCompetencia` INT NOT NULL AUTO_INCREMENT,
  `Clave` VARCHAR(45) NOT NULL,
  `NombreProducto` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(45) NULL,
  `PrecioUnitario` VARCHAR(45) NULL,
  `Producto_idProducto` INT NOT NULL,
  PRIMARY KEY (`idCompetencia`),
  UNIQUE INDEX `idCompetencia_UNIQUE` (`idCompetencia` ASC) ,
  UNIQUE INDEX `Clave_UNIQUE` (`Clave` ASC) ,
  INDEX `fk_Competencia_Producto1_idx` (`Producto_idProducto` ASC) ,
  CONSTRAINT `fk_Competencia_Producto1`
    FOREIGN KEY (`Producto_idProducto`)
    REFERENCES `bd_encinales`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`MateriaPrima`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`MateriaPrima` (
  `idMateriaPrima` INT NOT NULL AUTO_INCREMENT,
  `Clave` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(45) NULL,
  `Cantidad` DOUBLE NULL,
  `UnidadMedida` VARCHAR(45) NULL,
  `PrecioUnitario` DOUBLE NULL,
  `PrecioTotal` DOUBLE NULL,
  `FechaCompra` DATE NULL,
  PRIMARY KEY (`idMateriaPrima`),
  UNIQUE INDEX `idMateriaPrima_UNIQUE` (`idMateriaPrima` ASC) ,
  UNIQUE INDEX `Clave_UNIQUE` (`Clave` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`MateriaPrima_Facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`MateriaPrima_Facturas` (
  `MateriaPrima_idMateriaPrima` INT NOT NULL,
  `Facturas_idFacturas` INT NOT NULL,
  PRIMARY KEY (`MateriaPrima_idMateriaPrima`, `Facturas_idFacturas`),
  INDEX `fk_MateriaPrima_has_Facturas_Facturas1_idx` (`Facturas_idFacturas` ASC) ,
  INDEX `fk_MateriaPrima_has_Facturas_MateriaPrima1_idx` (`MateriaPrima_idMateriaPrima` ASC) ,
  CONSTRAINT `fk_MateriaPrima_has_Facturas_MateriaPrima1`
    FOREIGN KEY (`MateriaPrima_idMateriaPrima`)
    REFERENCES `bd_encinales`.`MateriaPrima` (`idMateriaPrima`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MateriaPrima_has_Facturas_Facturas1`
    FOREIGN KEY (`Facturas_idFacturas`)
    REFERENCES `bd_encinales`.`Facturas` (`idFacturas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`CE_DPCE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`CE_DPCE` (
  `ConsumoElectrico_idConsumoElectrico` INT NOT NULL,
  `DP_ConsumoElectrico_idDeterPrecioConsumo` INT NOT NULL,
  PRIMARY KEY (`ConsumoElectrico_idConsumoElectrico`, `DP_ConsumoElectrico_idDeterPrecioConsumo`),
  INDEX `fk_ConsumoElectrico_has_DP_ConsumoElectrico_DP_ConsumoElect_idx` (`DP_ConsumoElectrico_idDeterPrecioConsumo` ASC) ,
  INDEX `fk_ConsumoElectrico_has_DP_ConsumoElectrico_ConsumoElectric_idx` (`ConsumoElectrico_idConsumoElectrico` ASC) ,
  CONSTRAINT `fk_ConsumoElectrico_has_DP_ConsumoElectrico_ConsumoElectrico1`
    FOREIGN KEY (`ConsumoElectrico_idConsumoElectrico`)
    REFERENCES `bd_encinales`.`ConsumoElectrico` (`idConsumoElectrico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ConsumoElectrico_has_DP_ConsumoElectrico_DP_ConsumoElectri1`
    FOREIGN KEY (`DP_ConsumoElectrico_idDeterPrecioConsumo`)
    REFERENCES `bd_encinales`.`DP_ConsumoElectrico` (`idDeterPrecioConsumo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_encinales`.`P_DPP`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_encinales`.`P_DPP` (
  `Produccion_idProduccion` INT NOT NULL,
  `DP_Produccion_idDeterminacionPrecio` INT NOT NULL,
  PRIMARY KEY (`Produccion_idProduccion`, `DP_Produccion_idDeterminacionPrecio`),
  INDEX `fk_Produccion_has_DP_Produccion_DP_Produccion1_idx` (`DP_Produccion_idDeterminacionPrecio` ASC) ,
  INDEX `fk_Produccion_has_DP_Produccion_Produccion1_idx` (`Produccion_idProduccion` ASC) ,
  CONSTRAINT `fk_Produccion_has_DP_Produccion_Produccion1`
    FOREIGN KEY (`Produccion_idProduccion`)
    REFERENCES `bd_encinales`.`Produccion` (`idProduccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produccion_has_DP_Produccion_DP_Produccion1`
    FOREIGN KEY (`DP_Produccion_idDeterminacionPrecio`)
    REFERENCES `bd_encinales`.`DP_Produccion` (`idDeterminacionPrecio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;