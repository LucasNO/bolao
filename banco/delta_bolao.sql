CREATE TABLE `role` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `senha` VARCHAR(255) NOT NULL,
  `role` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_usuario_role_idx` (`role` ASC),
  CONSTRAINT `fk_usuario_role`
    FOREIGN KEY (`role`)
    REFERENCES `bolao`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE TABLE `selecoes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `bandeira` VARCHAR(255) NULL,
  `numero_participacoes` INT NULL,
  `titulos` INT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `partidas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `selecao1` INT NOT NULL,
  `placar1` INT NULL,
  `placar2` INT NULL,
  `selecao2` INT NOT NULL,
  `ativo` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_partidas_selecao1_idx` (`selecao1` ASC),
  INDEX `fk_partidas_selecao2_idx` (`selecao2` ASC),
  CONSTRAINT `fk_partidas_selecao1`
    FOREIGN KEY (`selecao1`)
    REFERENCES `bolao`.`selecoes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_partidas_selecao2`
    FOREIGN KEY (`selecao2`)
    REFERENCES `bolao`.`selecoes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `palpites` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` INT NOT NULL,
  `partida` INT NOT NULL,
  `placar1` INT NOT NULL,
  `placar2` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_palpites_usuario_idx` (`usuario` ASC),
  INDEX `fk_palpites_partida_idx` (`partida` ASC),
  CONSTRAINT `fk_palpites_usuario`
    FOREIGN KEY (`usuario`)
    REFERENCES `bolao`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_palpites_partida`
    FOREIGN KEY (`partida`)
    REFERENCES `bolao`.`partidas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE TABLE `configuracao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `pontos_acerto placar` INT NOT NULL,
  `pontos_acerto_vencedor` INT NOT NULL,
  `valor_inscricao` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id`));
  

CREATE TABLE `pontuacao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` INT NOT NULL,
  `pontos` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_pontuacao_usuario_idx` (`usuario` ASC),
  CONSTRAINT `fk_pontuacao_usuario`
    FOREIGN KEY (`usuario`)
    REFERENCES `bolao`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
ALTER TABLE `bolao`.`usuario` 
ADD COLUMN `pago` TINYINT(1) NOT NULL AFTER `role`;


INSERT INTO `bolao`.`role` (`descricao`) VALUES ('admin');

INSERT INTO `bolao`.`role` (`descricao`) VALUES ('usuario');





