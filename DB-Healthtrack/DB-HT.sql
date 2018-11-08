CREATE TABLE T_DIETA (
    CD_DIETA            NUMBER(6) NOT NULL,
    NM_ALIMENTO         NVARCHAR2(30) NOT NULL,
    QTD_CALORIA         NUMBER(7,2) NOT NULL,
    DS_TIPO             NVARCHAR2(30) NOT NULL,
    QTD_PADRAOCALORIA   NUMBER(7,2) NOT NULL,
    DT_DATA             DATE DEFAULT SYSDATE NOT NULL,
    DT_HORARIO   TIMESTAMP(9) WITH LOCAL TIME ZONE NOT NULL
);

ALTER TABLE T_DIETA ADD CONSTRAINT PK_T_DIETA PRIMARY KEY ( CD_DIETA );

CREATE SEQUENCE SQ_DIETA
INCREMENT BY 1
START WITH 1
NOMAXVALUE
NOCACHE
NOCYCLE;


CREATE TABLE T_ENDERECO (
    CD_ENDERECO     NUMBER(6) NOT NULL,
    NM_LOGRADOURO   NVARCHAR2(255) NOT NULL,
    NR_CEP          NVARCHAR2(10) NOT NULL,
    NM_BAIRRO       NVARCHAR2(255) NOT NULL,
    NM_CIDADE       NVARCHAR2(255) NOT NULL,
    NM_ESTADO       NVARCHAR2(255) NOT NULL,
    NM_PAIS         NVARCHAR2(255) NOT NULL,
    NR_ENDERECO     NUMBER(6) NOT NULL
);

ALTER TABLE T_ENDERECO ADD CONSTRAINT PK_T_END PRIMARY KEY ( CD_ENDERECO );

CREATE SEQUENCE SQ_ENDERECO
INCREMENT BY 1
START WITH 1
NOMAXVALUE
NOCACHE
NOCYCLE;


CREATE TABLE T_EXERCICIO (
    CD_EXERCICIO      NUMBER(6) NOT NULL,
    NM_MOD            NVARCHAR2(30) NOT NULL,
    DT_DATA           DATE DEFAULT SYSDATE NOT NULL,
    NR_KM             NUMBER(8,2) NOT NULL,
    NR_PADRAOKM       NUMBER(8,2) NOT NULL,
    QTD_TEMPO         TIMESTAMP(9) WITH LOCAL TIME ZONE NOT NULL,
    QTD_PADRAOTEMPO   TIMESTAMP(9) WITH LOCAL TIME ZONE NOT NULL
);

ALTER TABLE T_EXERCICIO ADD CONSTRAINT PK_T_EX PRIMARY KEY ( CD_EXERCICIO );

CREATE SEQUENCE SQ_EXERCICIO
INCREMENT BY 1
START WITH 1
NOMAXVALUE
NOCACHE
NOCYCLE;

CREATE TABLE T_PESO (
    CD_PESO     NUMBER(6) NOT NULL,
    NR_PESO     NUMBER(6,2) NOT NULL,
    NR_ALTURA   NUMBER(8,2) NOT NULL,
    DT_DATA     DATE DEFAULT SYSDATE NOT NULL
);

ALTER TABLE T_PESO ADD CONSTRAINT PK_T_PESO PRIMARY KEY ( CD_PESO );

CREATE SEQUENCE SQ_PESO
INCREMENT BY 1
START WITH 1
NOMAXVALUE
NOCACHE
NOCYCLE;

CREATE TABLE T_PREARTERIAL (
    CD_PRES_ART   NUMBER(6) NOT NULL,
    NR_DADOMAX       NUMBER(4,2) NOT NULL,
    NR_DADOMIN       NUMBER(4,2) NOT NULL,
    DT_DATA       DATE DEFAULT SYSDATE NOT NULL,
    DS_PADRAOMAX     NUMBER(4,2) NOT NULL,
    DS_PADRAOMIN     NUMBER(4,2) NOT NULL
);

ALTER TABLE T_PREARTERIAL ADD CONSTRAINT PK_T_PREARTERIAL PRIMARY KEY ( CD_PRES_ART );

CREATE SEQUENCE SQ_PRESART
INCREMENT BY 1
START WITH 1
NOMAXVALUE
NOCACHE
NOCYCLE;

CREATE TABLE T_USER (
    CD_USER         NUMBER(6) NOT NULL,
    NM_USUARIO      NVARCHAR2(255) NOT NULL,
    NM_LAST         NVARCHAR2(255) NOT NULL,
    NM_EMAIL        NVARCHAR2(255) NOT NULL,
    NR_TELEFONE     NUMBER(20) NOT NULL,
    NR_CPF          NVARCHAR2(30) NOT NULL,
    DS_SEXO         NVARCHAR2(12) NOT NULL,
    DT_NASCIMENTO   DATE NOT NULL,
    DT_CADASTRO     DATE DEFAULT SYSDATE NOT NULL,
    NR_PASSWORD     NVARCHAR2(255) NOT NULL
);

ALTER TABLE T_USER ADD CONSTRAINT PK_T_USER PRIMARY KEY ( CD_USER );

CREATE SEQUENCE SQ_USER
INCREMENT BY 1
START WITH 1
NOMAXVALUE
NOCACHE
NOCYCLE;

CREATE TABLE T_USER_ART (
    T_USER_CD_USER              NUMBER(6) NOT NULL,
    T_PREARTERIAL_CD_PRES_ART   NUMBER(6) NOT NULL
);

ALTER TABLE T_USER_ART ADD CONSTRAINT PK_HT_USART PRIMARY KEY ( T_USER_CD_USER,
T_PREARTERIAL_CD_PRES_ART );

CREATE TABLE T_USER_DIETA (
    T_USER_CD_USER     NUMBER(6) NOT NULL,
    T_DIETA_CD_DIETA   NUMBER(6) NOT NULL
);

ALTER TABLE T_USER_DIETA ADD CONSTRAINT PK_HT_USDI PRIMARY KEY ( T_USER_CD_USER,
T_DIETA_CD_DIETA );

CREATE TABLE T_USER_END (
    T_USER_CD_USER           NUMBER(6) NOT NULL,
    T_ENDERECO_CD_ENDERECO   NUMBER(6) NOT NULL
);

ALTER TABLE T_USER_END ADD CONSTRAINT PK_HT_USED PRIMARY KEY ( T_USER_CD_USER,
T_ENDERECO_CD_ENDERECO );

CREATE TABLE T_USER_EX (
    T_USER_CD_USER             NUMBER(6) NOT NULL,
    T_EXERCICIO_CD_EXERCICIO   NUMBER(6) NOT NULL
);

ALTER TABLE T_USER_EX ADD CONSTRAINT PK_HT_USEX PRIMARY KEY ( T_ENDERECO_CD_EXERCICIO,
T_USER_CD_USER );

CREATE TABLE T_USER_PESO (
    T_PESO_CD_PESO   NUMBER(6) NOT NULL,
    T_USER_CD_USER   NUMBER(6) NOT NULL
);

ALTER TABLE T_USER_PESO ADD CONSTRAINT PK_HT_USPE PRIMARY KEY ( T_PESO_CD_PESO,
T_USER_CD_USER );

ALTER TABLE T_USER_ART
    ADD CONSTRAINT FK_USART_ART FOREIGN KEY ( T_PREARTERIAL_CD_PRES_ART )
        REFERENCES T_PREARTERIAL ( CD_PRES_ART );

ALTER TABLE T_USER_ART
    ADD CONSTRAINT FK_USART_US FOREIGN KEY ( T_USER_CD_USER )
        REFERENCES T_USER ( CD_USER );

ALTER TABLE T_USER_DIETA
    ADD CONSTRAINT FK_USDI_DI FOREIGN KEY ( T_DIETA_CD_DIETA )
        REFERENCES T_DIETA ( CD_DIETA );

ALTER TABLE T_USER_DIETA
    ADD CONSTRAINT FK_USDI_US FOREIGN KEY ( T_USER_CD_USER )
        REFERENCES T_USER ( CD_USER );

ALTER TABLE T_USER_END
    ADD CONSTRAINT FK_USED_END FOREIGN KEY ( T_ENDERECO_CD_ENDERECO )
        REFERENCES T_ENDERECO ( CD_ENDERECO );

ALTER TABLE T_USER_END
    ADD CONSTRAINT FK_USED_US FOREIGN KEY ( T_USER_CD_USER )
        REFERENCES T_USER ( CD_USER );

ALTER TABLE T_USER_EX
    ADD CONSTRAINT FK_USEX_EX FOREIGN KEY ( T_EXERCICIO_CD_EXERCICIO )
        REFERENCES T_EXERCICIO ( CD_EXERCICIO );

ALTER TABLE T_USER_EX
    ADD CONSTRAINT FK_USEX_US FOREIGN KEY ( T_USER_CD_USER )
        REFERENCES T_USER ( CD_USER );

ALTER TABLE T_USER_PESO
    ADD CONSTRAINT FK_USPE_PE FOREIGN KEY ( T_PESO_CD_PESO )
        REFERENCES T_PESO ( CD_PESO );

ALTER TABLE T_USER_PESO
    ADD CONSTRAINT FK_USPE_US FOREIGN KEY ( T_USER_CD_USER )
        REFERENCES T_USER ( CD_USER );

--	Consultar os dados de um determinado usu�rio (filtrar a partir do seu c�digo);
SELECT * FROM T_USER WHERE CD_USER = ?;
--	Consultar todos os dados de todos os registros de peso de um determinado usu�rio, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu c�digo);
SELECT * FROM T_PESO WHERE CD_USER = ? ORDER BY DT_DATA ASC;
--	Consultar todos os dados de um �nico registro de peso de um determinado usu�rio (filtrar a partir do c�digo do usu�rio e do c�digo de peso);
SELECT NR_PESO FROM T_PESO WHERE CD_USER = ? AND CD_PESO = ? ORDER BY DT_DATA ASC;
--	Consultar todos os dados de todos os registros de press�o arterial de um determinado usu�rio, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu c�digo);
SELECT * FROM T_PREARTERIAL WHERE CD_USER = ? ORDER BY DT_DATA ASC;
--	Consultar todos os dados de um �nico registro de press�o arterial de um determinado usu�rio (filtrar a partir do c�digo do usu�rio e do c�digo de press�o);
SELECT * FROM T_PREARTERIAL WHERE CD_USER = ? AND CD_PRE_ART = ? ORDER BY DT_DATA ASC;
--	Consultar todos os dados de todos os registros de atividade f�sica de um determinado usu�rio, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu c�digo);
SELECT * FROM T_EXERCICIO WHERE CD_USER = ? ORDER BY DT_DATA ASC;
--	Consultar todos os dados de um �nico registro de atividade f�sica de um determinado usu�rio (filtrar a partir do c�digo do usu�rio e do c�digo de atividade);
SELECT * FROM T_EXERCICIO WHERE CD_USER = ? AND CD_EXERCICIO = ? ORDER BY DT_DATA ASC;
--	Consultar todos os dados de todos os registros de alimentos ingeridos de um determinado usu�rio, ordenando-os dos registros mais recentes para os mais antigos (filtrar a partir do seu c�digo);
SELECT * FROM T_DIETA WHERE CD_USER = ? ORDER BY DT_DATA ASC;
--	Consultar todos os dados de um �nico registro de alimento ingerido de um determinado usu�rio (filtrar a partir do c�digo do usu�rio e do c�digo de alimento);
SELECT * FROM T_DIETA WHERE CD_USER = ? AND CD_DIETA = ? ORDER BY DT_DATA ASC;
--	Consultar os dados b�sicos de um determinado usu�rio, o �ltimo peso registrado e a �ltima press�o arterial registrada (filtrar a partir do c�digo de usu�rio � consulta necess�ria para o dashboard, dica: veja consulta com jun��es).
-- INNER JOIN COMO DUAS OU MAIS TABELAS e peso � um atributo de Usu�rio, n�o fiz como entity.
SELECT * 
FROM T_USER U INNER JOIN
T_PREARTERIAL P
USING (CD_USER)
INNER JOIN T_PESO PS
USING (CD_PESO)
ORDER BY PS.NR_PESO ASC AND PS.DT_DATA ASC;