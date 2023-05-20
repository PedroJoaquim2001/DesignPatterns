# DesignPatterns
Api feita utilizando estilos de programação aprendidas em design patterns

para rodar esta api é nescessario rodar esses comandos sql no postgre Sql

INSERT INTO tb_user(user_id, acess_level, created_date, email, username, password) 
	VALUES('5d515354-4c3f-433d-9cbe-d9b35f5159f3', 'UNLIMITED', now(), 'maria@outlook.com', 'Maria', '$2a$10$CUxNlytY2BRxPWJg6ZEdmO9dJrMoPEhI20dX1vsPPVkpra9NynM6O');
INSERT INTO tb_user(user_id, acess_level, created_date, email, username, password) 
	VALUES('b09cae43-c653-461e-8685-bc04548e94cd', 'LIMITED', now(), 'joao@outlook.com', 'Joao', '$2a$10$4BJyzgRseLRowAdI5y53/.hAdUr1C9d5TD.KtjhveXcn7Q4n0d9qq');

INSERT INTO tb_role(role_id, role_name)
	values('10fbbd13-f2c7-44cf-8564-88020640a56e', 'ROLE_ADMIN');
INSERT INTO tb_role(role_id, role_name)
	values('10c8d0a3-240a-4a6b-86f5-84aa1891bbbe', 'ROLE_USER');

INSERT INTO tb_users_roles(user_id, role_id)
	values('5d515354-4c3f-433d-9cbe-d9b35f5159f3', '10fbbd13-f2c7-44cf-8564-88020640a56e');
INSERT INTO tb_users_roles(user_id, role_id)
	values('b09cae43-c653-461e-8685-bc04548e94cd', '10c8d0a3-240a-4a6b-86f5-84aa1891bbbe');
  
  
os comandos a seguir são para verifcar as tabelas
  
SELECT * FROM tb_user;
SELECT * FROM tb_users_roles;
SELECT * FROM tb_role; 
