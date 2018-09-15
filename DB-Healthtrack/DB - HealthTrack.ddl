-- Gerado por Oracle SQL Developer Data Modeler 17.4.0.355.2121
--   em:        2018-09-15 16:31:47 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE t_dieta (
    cd_dieta              NUMBER(6) NOT NULL,
    t_t_ali_cd_alimento   INTEGER NOT NULL,
    nm_alimento           VARCHAR2(30) NOT NULL,
    qtd_caloria           NUMBER(7,2) NOT NULL,
    ds_tipo               VARCHAR2(30) NOT NULL,
    qtd_padraocaloria     NUMBER(7,2) NOT NULL,
    dt_data               DATE NOT NULL
);

ALTER TABLE t_dieta ADD CONSTRAINT pk_ht_dieta PRIMARY KEY ( cd_dieta );

CREATE TABLE t_end (
    cd_end          NUMBER(6) NOT NULL,
    ds_logradouro   VARCHAR2(20) NOT NULL,
    nm_logradouro   VARCHAR2(255) NOT NULL,
    nr_cep          VARCHAR2(10) NOT NULL,
    nm_bairro       VARCHAR2(255) NOT NULL,
    nm_cidade       VARCHAR2(255) NOT NULL,
    nm_estado       VARCHAR2(255) NOT NULL,
    nr_endereco     NUMBER(6) NOT NULL
);

ALTER TABLE t_end ADD CONSTRAINT pk_ht_end PRIMARY KEY ( cd_end );

CREATE TABLE t_exercicio (
    cd_exercicio                 NUMBER(6) NOT NULL,
    t_t_exer_cd_tipo_exercicio   INTEGER NOT NULL,
    nm_tipo                      NVARCHAR2(30) NOT NULL,
    dt_data                      DATE NOT NULL,
    nr_km                        NUMBER(8,2) NOT NULL,
    qt_tempo                     TIMESTAMP(9) WITH LOCAL TIME ZONE NOT NULL,
    nr_padraokm                  NUMBER(8,2) NOT NULL,
    qt_padraotempo               TIMESTAMP(9) WITH LOCAL TIME ZONE NOT NULL
);

ALTER TABLE t_exercicio ADD CONSTRAINT pk_ht_exer PRIMARY KEY ( cd_exercicio );

CREATE TABLE t_prearterial (
    cd_pres_art                  NUMBER(6) NOT NULL,
    t_tipo_art_cd_pre_arterial   INTEGER NOT NULL,
    sg_pressao_art               INTEGER NOT NULL,
    nr_pre_arterial              FLOAT NOT NULL,
    nr_dado                      NUMBER(4,2) NOT NULL,
    dt_data                      DATE NOT NULL,
    ds_padrao                    NUMBER(4,2) NOT NULL
);

ALTER TABLE t_prearterial ADD CONSTRAINT pk_ht_preart PRIMARY KEY ( cd_pres_art );

CREATE TABLE t_user (
    cd_user         NUMBER(6) NOT NULL,
    nm_usuario      VARCHAR2(255) NOT NULL,
    nm_email        VARCHAR2(255) NOT NULL,
    nr_idade        NUMBER(3) NOT NULL,
    nr_peso         NUMBER(5,2) NOT NULL,
    nr_altura       NUMBER(3,2) NOT NULL,
    nr_telefone     VARCHAR2(20) NOT NULL,
    nr_cpf          NUMBER(30) NOT NULL,
    ds_sexo         VARCHAR2(12) NOT NULL,
    dt_nascimento   DATE NOT NULL,
    dt_cadastro     DATE NOT NULL,
    nr_password     VARCHAR2(255) NOT NULL
);

ALTER TABLE t_user ADD CONSTRAINT pk_ht_user PRIMARY KEY ( cd_user );

CREATE TABLE t_user_art (
    t_user_cd_user              NUMBER(6) NOT NULL,
    t_prearterial_cd_pres_art   NUMBER(6) NOT NULL
);

ALTER TABLE t_user_art ADD CONSTRAINT pk_ht_usar PRIMARY KEY ( t_prearterial_cd_pres_art,
t_user_cd_user );

CREATE TABLE t_user_dieta (
    t_user_cd_user     NUMBER(6) NOT NULL,
    t_dieta_cd_dieta   NUMBER(6) NOT NULL
);

ALTER TABLE t_user_dieta ADD CONSTRAINT pk_ht_usdi PRIMARY KEY ( t_user_cd_user,
t_dieta_cd_dieta );

CREATE TABLE t_user_endereco (
    t_user_cd_user   NUMBER(6)
        CONSTRAINT nnc_t_usend_t_user_cd_user NOT NULL,
    t_end_cd_end     NUMBER(6)
        CONSTRAINT nnc_t_usend_t_end_cd_end NOT NULL
);

ALTER TABLE t_user_endereco ADD CONSTRAINT pk_ht_user_ed PRIMARY KEY ( t_user_cd_user,
t_end_cd_end );

CREATE TABLE t_user_exercicio (
    t_user_cd_user             NUMBER(6) NOT NULL,
    t_exercicio_cd_exercicio   NUMBER(6) NOT NULL
);

ALTER TABLE t_user_exercicio ADD CONSTRAINT pk_ht_usex PRIMARY KEY ( t_exercicio_cd_exercicio,
t_user_cd_user );

ALTER TABLE t_user_dieta
    ADD CONSTRAINT fk_t_udieta_di FOREIGN KEY ( t_dieta_cd_dieta )
        REFERENCES t_dieta ( cd_dieta );

ALTER TABLE t_user_dieta
    ADD CONSTRAINT fk_t_udieta_us FOREIGN KEY ( t_user_cd_user )
        REFERENCES t_user ( cd_user );

ALTER TABLE t_user_endereco
    ADD CONSTRAINT fk_t_ue_end FOREIGN KEY ( t_end_cd_end )
        REFERENCES t_end ( cd_end );

ALTER TABLE t_user_endereco
    ADD CONSTRAINT fk_t_ue_user FOREIGN KEY ( t_user_cd_user )
        REFERENCES t_user ( cd_user );

ALTER TABLE t_user_exercicio
    ADD CONSTRAINT fk_t_uex_exer FOREIGN KEY ( t_exercicio_cd_exercicio )
        REFERENCES t_exercicio ( cd_exercicio );

ALTER TABLE t_user_exercicio
    ADD CONSTRAINT fk_t_uex_user FOREIGN KEY ( t_user_cd_user )
        REFERENCES t_user ( cd_user );

ALTER TABLE t_user_art
    ADD CONSTRAINT fk_t_upre_pre FOREIGN KEY ( t_prearterial_cd_pres_art )
        REFERENCES t_prearterial ( cd_pres_art );

ALTER TABLE t_user_art
    ADD CONSTRAINT fk_tupre_us FOREIGN KEY ( t_user_cd_user )
        REFERENCES t_user ( cd_user );



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             9
-- CREATE INDEX                             0
-- ALTER TABLE                             17
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
