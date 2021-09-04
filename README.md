# SpringSecurityStudentLogin
JDK 1.8
Spring Tools Suite 4
PostgreSQL
JPA
Spring Boot

Makes changes in database to see results
****************************************

***Use Bcryptencoder for making password

select * from users;

INSERT INTO user_roles (user_id, role_id) VALUES (3, 4); 

select * from roles;

select * from user_roles;

delete from user_roles where user_id=6 and role_id=2;

INSERT INTO users (username, password, enabled) VALUES ('nilesh', '$2a$10$OlpVGGz1EXm.LQ/OcvmBQOFdAe3FQNYhOOXrKD6y9fhxOr2aBKwHu', '1');

INSERT INTO user_roles (user_id, role_id) VALUES (4, 4); 

stephanie@1122

INSERT INTO users (username, password, enabled) VALUES ('stephanie', '$2a$12$G.SasXPSW5aRnUJZnWzqo.d0m.TD35gvNbwCNnKMef260YZq9I8Zi', '1');

INSERT INTO user_roles (user_id, role_id) VALUES (5, 4); 

INSERT INTO users (username, password, enabled) VALUES ('vicky', '$2a$12$905upDbqjgULeGZVhTonLuqoKTlZ.lju8l4YzuT6349dhAkeO2mpi', '1');

INSERT INTO user_roles (user_id, role_id) VALUES (6, 1); 

INSERT INTO users (username, password, enabled) VALUES ('moku', '$2a$12$GzUnx/EgVDKq2EKI6Y//ZuwJWqr6OIGHuVK3e0T5VFq9v7U8jmUym', '1');

INSERT INTO user_roles (user_id, role_id) VALUES (7, 2); 

INSERT INTO users (username, password, enabled) VALUES ('goku', '$2a$12$fvdcRtBep8R7axlcXbaE2./nle368llGGkJ3qHOQH4oiXmma9EMFe', '1');

INSERT INTO user_roles (user_id, role_id) VALUES (8, 3); 


Source changes for database as given by coder
*********************************************
INSERT INTO roles (name) VALUES ('USER');
INSERT INTO roles (name) VALUES ('CREATOR');
INSERT INTO roles (name) VALUES ('EDITOR');
INSERT INTO roles (name) VALUES ('ADMIN');

INSERT INTO users (username, password, enabled) VALUES ('nilesh', '$2a$10$OlpVGGz1EXm.LQ/OcvmBQOFdAe3FQNYhOOXrKD6y9fhxOr2aBKwHu', '1');
INSERT INTO users (username, password, enabled) VALUES ('mahesh', '$2a$10$lv8PTtiNw7injglznpYeIehWW6knfFe/RnUW16TmGKtfSWRm/V2z2', '1');
INSERT INTO users (username, password, enabled) VALUES ('suresh', '$2a$10$flDL1ovH.7JEy1lSpBuuHuqagrXA8K3j3ELXQFV/KXhQK.WSnP8a.', '1');
INSERT INTO users (username, password, enabled) VALUES ('ramesh', '$2a$10$9k8/ODt16QFCmcmXLO2.oeVR8gHUtqpw9JeoEwEx/BKKAX9BZbbHK', '1');
INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$bN7OWEvi6rTqJEYbZfDOg.FHmG.xPTDxJR1k9LzsR4O6Nt8zuIKwq', '1');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1); 
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2); 
INSERT INTO users_roles (user_id, role_id) VALUES (3, 3); 
INSERT INTO users_roles (user_id, role_id) VALUES (4, 2); 
INSERT INTO users_roles (user_id, role_id) VALUES (4, 3); 
INSERT INTO users_roles (user_id, role_id) VALUES (5, 4);




