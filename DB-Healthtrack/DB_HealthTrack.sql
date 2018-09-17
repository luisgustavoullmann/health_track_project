CREATE TABLE t_dieta (
    cd_dieta            NUMBER(6) NOT NULL,
    nm_alimento         VARCHAR2(30) NOT NULL,
    qtd_caloria         NUMBER(7,2) NOT NULL,
    ds_tipo             VARCHAR2(30) NOT NULL,
    qtd_padraocaloria   NUMBER(7,2) NOT NULL,
    dt_data             DATE NOT NULL
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
    cd_exercicio     NUMBER(6) NOT NULL,
    nm_tipo          NVARCHAR2(30) NOT NULL,
    dt_data          DATE NOT NULL,
    nr_km            NUMBER(8,2) NOT NULL,
    qt_tempo         TIMESTAMP(9) WITH LOCAL TIME ZONE NOT NULL,
    nr_padraokm      NUMBER(8,2) NOT NULL,
    qt_padraotempo   TIMESTAMP(9) WITH LOCAL TIME ZONE NOT NULL
);

ALTER TABLE t_exercicio ADD CONSTRAINT pk_ht_exer PRIMARY KEY ( cd_exercicio );

CREATE TABLE t_prearterial (
    cd_pres_art   NUMBER(6) NOT NULL,
    nr_dado       NUMBER(4,2) NOT NULL,
    dt_data       DATE NOT NULL,
    ds_padrao     NUMBER(4,2) NOT NULL
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

CREATE TABLE t_user_end (
    t_user_cd_user   NUMBER(6)
        CONSTRAINT nnc_t_usend_t_user_cd_user NOT NULL,
    t_end_cd_end     NUMBER(6)
        CONSTRAINT nnc_t_usend_t_end_cd_end NOT NULL
);

ALTER TABLE t_user_end ADD CONSTRAINT pk_ht_user_ed PRIMARY KEY ( t_user_cd_user,
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

ALTER TABLE t_user_end
    ADD CONSTRAINT fk_t_ue_end FOREIGN KEY ( t_end_cd_end )
        REFERENCES t_end ( cd_end );

ALTER TABLE t_user_end
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
