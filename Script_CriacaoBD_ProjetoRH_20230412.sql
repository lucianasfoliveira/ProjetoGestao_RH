-- CRIACAO DAS TABELAS E RELACIONAMENTOS DO BANCO DE DADOS PARA ATENDER AO PROJETO 
-- DE GESTAO DE CURRICULUM 

-- TIPOS DE RELACIONAMENTOS ENTRE TABELAS:

-- relacionamento do tipo 1:1 (um para um) ocorrem quando uma ocorrência de 
-- de uma entidade pode se relacionar com APENAS uma ocorrência de outra entidade. 
-- No contexto do banco de dados isso significa que para um registro em uma 
-- tabela pode existir apenas um registro relacionado em outra.

-- Relacionamentos do tipo 1:N (um para muitos) ocorrem quando uma ocorrência 
-- de uma entidade pode se relacionar com várias ocorrências de outra entidade. 
-- No contexto do banco de dados isso significa que para um registro em uma 
-- tabela podem existir vários registros relacionados em outra.

-- relacionamento do tipo N:1 (muitos para um) ocorrem quando várias ocorrências de 
-- de uma entidade pode se relacionar com APENAS uma ocorrência de outra entidade. 
-- No contexto do banco de dados isso significa que para varios registros em uma 
-- tabela pode existir apenas um registro relacionado em outra.

-- relacionamento do tipo N:N (muitos para muitos) ocorrem quando várias ocorrências de 
-- de uma entidade pode se relacionar varias ocorrência de outra entidade. 
-- No contexto do banco de dados isso significa que para varios registros em uma 
-- tabela podem existir varios registros relacionados em outra.

-- DEVIDO AOS RELACIONAMENTOS ENTRE AS TABELAS, É IMPORTANTE EXECUTAR AS  
-- OPERACOES NA ORDEM CORRETA:

-- EXECUÇAO 1: CRIACAO DA TABELA DE PAÍS
CREATE TABLE country (
    country_id INT NOT NULL AUTO_INCREMENT,
   	country VARCHAR(50),
    PRIMARY KEY(country_id)
   );

-- EXECUÇAO 2: INCLUSAO DOS DADOS NA TABELA COUNTRY
insert into country (country) values ('Brasil');
insert into country (country) values ('USA');
insert into country (country) values ('Canada');

-- EXECUÇAO 3: CRIACAO DA TABELA DE ESTADO
CREATE TABLE state (
    state_id INT NOT NULL AUTO_INCREMENT,
    country_id INT,
	state VARCHAR(50),
    PRIMARY KEY(state_id),
    FOREIGN KEY(country_id) REFERENCES country(country_id)
);

-- EXECUÇAO 4: INCLUSAO DOS DADOS NA TABELA state
insert into state (state) values ('São Paulo');
insert into state (state) values ('Rio de Janeiro');
insert into state (state) values ('Minas Gerais');

-- EXECUÇAO 5: CRIACAO DA TABELA DE CIDADE
CREATE TABLE city (
    city_id INT NOT NULL AUTO_INCREMENT,
    state_id int,
	city VARCHAR(50),
    PRIMARY KEY(city_id),
	FOREIGN KEY(state_id) REFERENCES state(state_id)
);

-- EXECUÇAO 6: INCLUSAO DOS DADOS NA TABELA city
insert into city (city) values ('São Paulo');
insert into city (city) values ('Rio de Janeiro');
insert into city (city) values ('Belo Horizonte');

-- EXECUÇAO 7: CRIACAO DA TABELA DE PAIS DE ORIGEM
CREATE TABLE country_Origin (
    countryOfOrigin_id INT NOT NULL AUTO_INCREMENT,
	countryOfOrigin VARCHAR(50),
    PRIMARY KEY(countryOfOrigin_id)
);

-- EXECUÇAO 8: INCLUSAO DOS DADOS NA TABELA country_Origin
insert into country_Origin (countryOfOrigin) values ('Brasileira');
insert into country_Origin (countryOfOrigin) values ('Americana');
insert into country_Origin (countryOfOrigin) values ('Francesa');

-- EXECUÇAO 9: CRIACAO DA TABELA TIPOS DE DEFICIÊNCIA(DisabilityTypes)
CREATE TABLE disability_type (
    disability_id INT NOT NULL AUTO_INCREMENT,
    disabilityType varchar(100),
	PRIMARY KEY(disability_id)
);

-- EXECUÇAO 10: INCLUSAO DOS DADOS NA TABELA disability_type
insert into disability_type  (disabilityType) values ('Deficiência Auditiva');
insert into disability_type  (disabilityType) values ('Deficiência Visual ');
insert into disability_type  (disabilityType) values ('Defiência Motora');

-- EXECUÇAO 11: CRIACAO DA TABELA CANDIDATO_DISABILITY
CREATE TABLE candidatoDisability (
    candidatoDisability_id INT NOT NULL AUTO_INCREMENT,
    disability_id int,
    candidato_id int,
    PRIMARY KEY(candidatoDisability_id),
    FOREIGN KEY(disability_id) REFERENCES disability_type(disability_id),
    FOREIGN KEY(candidato_id) REFERENCES candidato(candidato_id)
   );

-- EXECUÇAO 12: CRIACAO DA TABELA DE GENEROS
CREATE TABLE gender (
    gender_id INT NOT NULL AUTO_INCREMENT,
	gender VARCHAR(50),
    PRIMARY KEY(gender_id)
);

-- EXECUÇAO 13: INCLUSAO DOS DADOS NA TABELA gender
insert into gender (gender) values ('Feminino');
insert into gender (gender) values ('Masculino');
insert into gender (gender) values ('outro');

-- EXECUÇAO 14: CRIACAO DA TABELA DE STATUS DA QUALIFICACAO ACADEMICA
Create TABLE status (
status_id INT NOT NULL AUTO_INCREMENT,
statusName varchar(50),
Primary Key (status_id)
);

-- EXECUÇAO 15: INCLUSAO DOS DADOS NA TABELA academicQualification_status
insert into status (statusName) values ('Paralisado');
insert into status (statusName) values ('Em andamento');
insert into status (statusName) values ('Concluído');

-- EXECUÇAO 16: CRIACAO DA TABELA DE AREAS DE FORMACAO
Create TABLE formation (
formation_id INT NOT NULL AUTO_INCREMENT,
formationName varchar(50),
Primary Key (formation_id)
);

-- EXECUÇAO 17: INCLUSAO DOS DADOS NA TABELA formation
insert into formation (formationName) values ('Ensino Médio');
insert into formation (formationName) values ('Ensino Superio');
insert into formation (formationName) values ('Pós-Graduado');
insert into formation (formationName) values ('Mestrado');
insert into formation (formationName) values ('Doutorado');

-- EXECUÇAO 18: CRIACAO DA TABELA DE INSTITUICAO DE ENSINO
Create TABLE  institution(
institution_id INT NOT NULL AUTO_INCREMENT,
institutionName varchar(50),
Primary Key (institution_id)
);

-- EXECUÇAO 19: INCLUSAO DOS DADOS NA TABELA institution
insert into institution (institutionName) values ('PUC');
insert into institution (institutionName) values ('USP');
insert into institution (institutionName) values ('Mackenzie');

-- EXECUÇAO 20: CRIACAO DA TABELA DE CURSOS
Create TABLE  course (
course_id INT NOT NULL AUTO_INCREMENT,
courseName varchar(50),
Primary Key (course_id)
);

-- EXECUÇAO 21: INCLUSAO DOS DADOS NA TABELA course
insert into course (courseName) values ('Administração');
insert into course (courseName) values ('Engenharia');
insert into course (courseName) values ('Análise de Desenvolvimento de Sistemas');

-- EXECUÇAO 22: CRIACAO DA TABELA DE IDIOMAS
CREATE TABLE languages (
    language_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    language varchar(20)
   );
   
-- EXECUÇAO 23: INCLUSAO DOS DADOS NA TABELA languages
insert into languages (language) values ('Inglês'); 
insert into languages (language) values ('Espanhol'); 
insert into languages (language) values ('Português'); 

-- EXECUÇAO 24: CRIACAO DA TABELA DE NIVEL DE PROFISSIENCIA NO IDIOMA
CREATE TABLE level (
    level_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    levelName varchar(25)
   );

-- EXECUÇAO 25: INCLUSAO DOS DADOS NA TABELA level
insert into level (levelName) values ('Básico'); 
insert into level (levelName) values ('Intermediário'); 
insert into level (levelName) values ('Avançado'); 
insert into level (levelName) values ('Fluente'); 

-- EXECUÇAO 26: CRIACAO DA TABELA DE PAPEIS DE DESEMPENHO
Create TABLE role (
role_id INT NOT NULL AUTO_INCREMENT,
roleName varchar(50),
Primary Key (role_id)
);

-- EXECUÇAO 27: INCLUSAO DOS DADOS NA TABELA role
insert into role (roleName) values ('Desenvolvedora FullStack');
insert into role (roleName) values ('Gerente de Projetos');
insert into role (roleName) values ('Analista de Sistemas');

-- EXECUÇAO 28: CRIACAO DAS TABELAS AREAS 
CREATE TABLE area_interest (
    areaInterest_id INT NOT NULL AUTO_INCREMENT,
    areaName varchar(50),
    PRIMARY KEY(areaInterest_id )
);

-- EXECUÇAO 29: INCLUSAO DOS DADOS NA TABELA areas_id
insert into area_interest (areaName) values ('Analise de Sistemas');
insert into area_interest (areaName) values ('Desenvolvimento de Sistemas');
insert into area_interest (areaName) values ('Arquitura de Sistemas');

-- EXECUÇAO 30: CRIACAO DA TABELA DE CANDIDATO
-- tabela dependente das tabelas: 
-- GENDER, COUNTRYOFORIGIN, CITY E CANDIDATODISABILITY

-- Tabela CANDIDATO tem os seguintes relacionamentos: 
-- GENDER 1:N CANDIDATO
-- COUNTRYOFORIGIN 1:N CANDIDATO
-- CITY 1:N CANDIDATO
-- CANDIDATODISABILITY N:1 CANDIDATO

-- EXECUÇAO 30: CRIACAO DA TABELA DE CANDIDATO
CREATE TABLE candidato (
    candidato_id INT NOT NULL AUTO_INCREMENT,
    gender_id int,
    city_id int,
    countryOfOrigin_id int,
    firstName varchar(50),
    lastName varchar(50),
    email varchar(50),
    birthdate date,
    identificationDocument varchar(50),
    linkedinProfileUrl varchar(255),
    mobileNumber varchar(50),
    phoneNumber varchar(50),
  	addressZipCode varchar(8),
	addressNumber varchar(5),
	addressStreet varchar(30),
    PRIMARY KEY(candidato_id),
	FOREIGN KEY(gender_id) REFERENCES gender(gender_id),
    FOREIGN KEY(city_id) REFERENCES city(city_id),
    FOREIGN KEY(countryOfOrigin_id) REFERENCES country_Origin(countryOfOrigin_id)
);

-- EXECUÇAO 31: CRIACAO DA TABELA AREAS DE INTERESSE DO CANDIDATO
CREATE TABLE candidato_areas (
    candidato_areas_id INT NOT NULL AUTO_INCREMENT,
    areaInterest_id int,
    candidato_id int,
    PRIMARY KEY(candidato_areas_id),
    FOREIGN KEY(areaInterest_id) REFERENCES area_interest(areaInterest_id),
    FOREIGN KEY (candidato_id) REFERENCES candidato(candidato_id)
);

-- EXECUÇAO 32: CRIACAO DA TABELA DE EXPERIENCIAS DE TRABALHO
-- tabela dependente da tabela ROLE, portanto precisa ser criada
-- apenas após a criacao dela
CREATE TABLE work_experience (
    workExperience_id INT NOT NULL AUTO_INCREMENT,
    role_id int,
    candidato_id INT,
    companyName varchar(50),
    activitiesPerformed varchar(300),
    startMonth date,
    startYear date,
    endMonth date,
    endYear date,
    PRIMARY KEY(workExperience_id),
	FOREIGN KEY(role_id) REFERENCES role(role_id),
    FOREIGN KEY (candidato_id) REFERENCES candidato(candidato_id)
);

-- EXECUÇAO 33: CRIACAO DA TABELA DE AREAS DE QUALIFICACOES ACADEMICAS
-- tabela dependente das tabelas 
-- COUSES, INSTITUTION, FORMATION E ACADEMICQUALIFICATION_STATUS
-- portanto precisa ser criada apenas após a criacao delas
CREATE TABLE academic_qualification (
    academicQualification_id INT NOT NULL AUTO_INCREMENT,
    formation_id int,
    institution_id int,
    course_id int,
    status_id int,
    candidato_id INT,
    startMonth date,
    startYear date,
    endMonth date,
    endYear date,
    PRIMARY KEY(academicQualification_id),
    FOREIGN KEY(formation_id) REFERENCES formation(formation_id),
    FOREIGN KEY(institution_id) REFERENCES institution(institution_id),
	FOREIGN KEY(course_id) REFERENCES course(course_id),
    FOREIGN KEY(status_id) REFERENCES status(status_id),
    FOREIGN KEY (candidato_id) REFERENCES candidato(candidato_id)
);

-- EXECUÇAO 34: CRIACAO DA TABELA DE IDIOMAS QUE O CONDIDATO TEM CONHECIMENTO
-- tabela dependente LANGUAGES e LEVEL,  portanto precisa ser criada
-- apenas após a criacao delas
CREATE TABLE languages_skill (
    languagesskill_id INT NOT NULL AUTO_INCREMENT,
    language_id int,
	level_id int,
    candidato_id INT,
    PRIMARY KEY(languagesskill_id),
    FOREIGN KEY(language_id) REFERENCES languages(language_id),
	FOREIGN KEY(level_id) REFERENCES level(level_id),
    FOREIGN KEY (candidato_id) REFERENCES candidato(candidato_id)
);
