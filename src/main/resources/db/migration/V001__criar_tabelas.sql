
CREATE SEQUENCE pedido.s_cliente
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1;
		
CREATE SEQUENCE pedido.s_grupo
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1;
	
CREATE SEQUENCE pedido.s_produto
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1;
	

CREATE TABLE pedido.t_cliente (
	id_cliente bigint NOT NULL DEFAULT nextval('pedido.s_cliente'::regclass),
	nome varchar(150) NULL,
	cnpj varchar(14) NULL,
	cpf varchar(11) NULL,
	endereco varchar(200) NULL,
	numero varchar(10) NULL,
	complemento varchar(100) NULL,
	email varchar(200) NULL,
	celular varchar(11) NULL,
	data_cadastro timestamptz NULL,
	CONSTRAINT t_cliente_pkey PRIMARY KEY (id_cliente)
);
		
CREATE TABLE pedido.t_grupo (
	id_grupo bigint NOT NULL DEFAULT nextval('pedido.s_grupo'::regclass),
	nome varchar(150) NULL,
	data_cadastro timestamptz NULL,
	id_usuario_cad bigint,
	data_desativacao timestamptz NULL,
	id_usuario_desativa bigint,
	CONSTRAINT t_grupo_pkey PRIMARY KEY (id_grupo)
);


CREATE TABLE pedido.t_produto (
	id_produto bigint NOT NULL DEFAULT nextval('pedido.s_produto'::regclass),
	cod_produto bigint NOT NULL,
	nome varchar(150) NULL,
	nome_apresentacao varchar(150) NULL,
	unidade_medida  varchar(3) NULL,
	id_grupo bigint NOT NULL,
	valor NUMERIC(5,2) NOT NULL,
	data_cadastro timestamptz NULL,
	id_usuario_cad bigint,
	data_desativacao timestamptz NULL,
	id_usuario_desativacao bigint,
	CONSTRAINT t_produto_pkey PRIMARY KEY (id_produto)
);



