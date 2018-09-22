CREATE TABLE t_dieta (
    cd_dieta            NUMBER(6) NOT NULL,
    nm_alimento         NVARCHAR2(30) NOT NULL,
    qtd_caloria         NUMBER(7,2) NOT NULL,
    ds_tipo             NVARCHAR2(30) NOT NULL,
    qtd_padraocaloria   NUMBER(7,2) NOT NULL,
    dt_data             DATE NOT NULL
);

ALTER TABLE t_dieta ADD CONSTRAINT pk_t_dieta PRIMARY KEY ( cd_dieta );

CREATE TABLE t_endereco (
    cd_endereco     NUMBER(6) NOT NULL,
    ds_logradouro   NVARCHAR2(20) NOT NULL,
    nm_logradouro   NVARCHAR2(255) NOT NULL,
    nr_cep          NVARCHAR2(10) NOT NULL,
    nm_bairro       NVARCHAR2(255) NOT NULL,
    nm_cidade       NVARCHAR2(255) NOT NULL,
    nm_estado       NVARCHAR2(255) NOT NULL,
    nm_pais         NVARCHAR2(255) NOT NULL,
    nr_endereco     NUMBER(6) NOT NULL
);

ALTER TABLE t_endereco ADD CONSTRAINT pk_t_end PRIMARY KEY ( cd_endereco );

CREATE TABLE t_exercicio (
    cd_exercicio      NUMBER(6) NOT NULL,
    nm_tipo           NVARCHAR2(30) NOT NULL,
    dt_data           DATE NOT NULL,
    nr_km             NUMBER(8,2) NOT NULL,
    qtd_tempo         TIMESTAMP(9) WITH LOCAL TIME ZONE NOT NULL,
    nr_padraokm       NUMBER(8,2) NOT NULL,
    qtd_padraotempo   TIMESTAMP(9) WITH LOCAL TIME ZONE NOT NULL
);

ALTER TABLE t_exercicio ADD CONSTRAINT pk_t_ex PRIMARY KEY ( cd_exercicio );

CREATE TABLE t_peso (
    cd_peso     NUMBER(6) NOT NULL,
    nr_peso     NUMBER(6,2) NOT NULL,
    nr_altura   NUMBER(8,2) NOT NULL,
    dt_data     DATE NOT NULL
);

ALTER TABLE t_peso ADD CONSTRAINT pk_t_peso PRIMARY KEY ( cd_peso );

CREATE TABLE t_prearterial (
    cd_pres_art   NUMBER(6) NOT NULL,
    nr_dado       NUMBER(4,2) NOT NULL,
    dt_data       DATE NOT NULL,
    ds_padrao     NUMBER(4,2) NOT NULL
);

ALTER TABLE t_prearterial ADD CONSTRAINT pk_t_prearterial PRIMARY KEY ( cd_pres_art );

CREATE TABLE t_user (
    cd_user         NUMBER(6) NOT NULL,
    nm_usuario      NVARCHAR2(255) NOT NULL,
    nm_email        NVARCHAR2(255) NOT NULL,
    nr_idade        NUMBER(3) NOT NULL,
    nr_telefone     NUMBER(20) NOT NULL,
    nr_cpf          NVARCHAR2(30) NOT NULL,
    ds_sexo         NVARCHAR2(12) NOT NULL,
    dt_nascimento   DATE NOT NULL,
    dt_cadastro     DATE NOT NULL,
    nr_password     NVARCHAR2(255) NOT NULL
);

ALTER TABLE t_user ADD CONSTRAINT pk_t_user PRIMARY KEY ( cd_user );

CREATE TABLE t_user_art (
    t_user_cd_user              NUMBER(6) NOT NULL,
    t_prearterial_cd_pres_art   NUMBER(6) NOT NULL
);

ALTER TABLE t_user_art ADD CONSTRAINT pk_ht_usart PRIMARY KEY ( t_user_cd_user,
t_prearterial_cd_pres_art );

CREATE TABLE t_user_dieta (
    t_user_cd_user     NUMBER(6) NOT NULL,
    t_dieta_cd_dieta   NUMBER(6) NOT NULL
);

ALTER TABLE t_user_dieta ADD CONSTRAINT pk_ht_usdi PRIMARY KEY ( t_user_cd_user,
t_dieta_cd_dieta );

CREATE TABLE t_user_end (
    t_user_cd_user           NUMBER(6) NOT NULL,
    t_endereco_cd_endereco   NUMBER(6) NOT NULL
);

ALTER TABLE t_user_end ADD CONSTRAINT pk_ht_used PRIMARY KEY ( t_user_cd_user,
t_endereco_cd_endereco );

CREATE TABLE t_user_ex (
    t_user_cd_user             NUMBER(6) NOT NULL,
    t_exercicio_cd_exercicio   NUMBER(6) NOT NULL
);

ALTER TABLE t_user_ex ADD CONSTRAINT pk_ht_usex PRIMARY KEY ( t_exercicio_cd_exercicio,
t_user_cd_user );

CREATE TABLE t_user_peso (
    t_peso_cd_peso   NUMBER(6) NOT NULL,
    t_user_cd_user   NUMBER(6) NOT NULL
);

ALTER TABLE t_user_peso ADD CONSTRAINT pk_ht_uspe PRIMARY KEY ( t_peso_cd_peso,
t_user_cd_user );

ALTER TABLE t_user_art
    ADD CONSTRAINT fk_usart_art FOREIGN KEY ( t_prearterial_cd_pres_art )
        REFERENCES t_prearterial ( cd_pres_art );

ALTER TABLE t_user_art
    ADD CONSTRAINT fk_usart_us FOREIGN KEY ( t_user_cd_user )
        REFERENCES t_user ( cd_user );

ALTER TABLE t_user_dieta
    ADD CONSTRAINT fk_usdi_di FOREIGN KEY ( t_dieta_cd_dieta )
        REFERENCES t_dieta ( cd_dieta );

ALTER TABLE t_user_dieta
    ADD CONSTRAINT fk_usdi_us FOREIGN KEY ( t_user_cd_user )
        REFERENCES t_user ( cd_user );

ALTER TABLE t_user_end
    ADD CONSTRAINT fk_used_end FOREIGN KEY ( t_endereco_cd_endereco )
        REFERENCES t_endereco ( cd_endereco );

ALTER TABLE t_user_end
    ADD CONSTRAINT fk_used_us FOREIGN KEY ( t_user_cd_user )
        REFERENCES t_user ( cd_user );

ALTER TABLE t_user_ex
    ADD CONSTRAINT fk_usex_ex FOREIGN KEY ( t_exercicio_cd_exercicio )
        REFERENCES t_exercicio ( cd_exercicio );

ALTER TABLE t_user_ex
    ADD CONSTRAINT fk_usex_us FOREIGN KEY ( t_user_cd_user )
        REFERENCES t_user ( cd_user );

ALTER TABLE t_user_peso
    ADD CONSTRAINT fk_uspe_pe FOREIGN KEY ( t_peso_cd_peso )
        REFERENCES t_peso ( cd_peso );

ALTER TABLE t_user_peso
    ADD CONSTRAINT fk_uspe_us FOREIGN KEY ( t_user_cd_user )
        REFERENCES t_user ( cd_user );

--	Consultar os dados de um determinado usuário (filtrar a partir do seu código);
SELECT * FROM t_user WHERE cd_user = ?;
--	Consultar todos os dados de todos os registros de peso de um determinado usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código);
SELECT * FROM t_peso WHERE cd_user = ? ORDER BY dt_data ASC;
--	Consultar todos os dados de um único registro de peso de um determinado usuário (filtrar a partir do código do usuário e do código de peso);
SELECT nr_peso FROM t_peso WHERE cd_user = ? AND cd_peso = ? ORDER BY dt_data ASC;
--	Consultar todos os dados de todos os registros de pressão arterial de um determinado usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código);
SELECT * FROM t_prearterial WHERE cd_user = ? ORDER BY dt_data ASC;
--	Consultar todos os dados de um único registro de pressão arterial de um determinado usuário (filtrar a partir do código do usuário e do código de pressão);
SELECT * FROM t_prearterial WHERE cd_user = ? AND cd_pres_art = ? ORDER BY dt_data ASC;
--	Consultar todos os dados de todos os registros de atividade física de um determinado usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código);
SELECT * FROM t_exercicio WHERE cd_user = ? ORDER BY dt_data ASC;
--	Consultar todos os dados de um único registro de atividade física de um determinado usuário (filtrar a partir do código do usuário e do código de atividade);
SELECT * FROM t_exercicio WHERE cd_user = ? AND cd_exercicio = ? ORDER BY dt_data ASC;
--	Consultar todos os dados de todos os registros de alimentos ingeridos de um determinado usuário, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu código);
SELECT * FROM t_dieta WHERE cd_user = ? ORDER BY dt_data ASC;
--	Consultar todos os dados de um único registro de alimento ingerido de um determinado usuário (filtrar a partir do código do usuário e do código de alimento);
SELECT * FROM t_dieta WHERE cd_user = ? AND cd_dieta = ? ORDER BY dt_data ASC;
--	Consultar os dados básicos de um determinado usuário, o último peso registrado e a última pressão arterial registrada (filtrar a partir do código de usuário – consulta necessária para o dashboard, dica: veja consulta com junções).
-- INNER JOIN COMO DUAS OU MAIS TABELAS e peso é um atributo de Usuário, não fiz como entity.
SELECT * 
FROM t_user U INNER JOIN
t_prearterial P
USING (cd_user)
INNER JOIN t_peso PS
USING (cd_peso)
ORDER BY PS.nr_peso ASC AND PS.dt_data ASC;