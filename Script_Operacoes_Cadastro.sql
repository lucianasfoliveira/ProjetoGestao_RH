-- devida as relacoes entre as chaves estrangeiras nas tabelas,
-- as operacoes devem obedecer uma ordem:

-- para incluir um candidado na tabela candidato, é obrigatória a 
-- inclusao das informacoes nas tabelas cuja chave primaria 
-- vai para a tabela candidato como chave estrangeria,
-- ou seja, tabelas q tem relacionamentos N pra 1 com a tabela candidato 

-- como ja populamos essas tabelas no script de criacao do banco, podemos 
-- começar a popular o banco pela tabela candidato:

insert into candidato (
    gender_id,
    city_id,
    countryOfOrigin_id,
    firstName,
    lastName,
    birthdate,
    identificationDocument,
    email,
    linkedinProfileUrl,
    mobileNumber,
    phoneNumber,
    addressZipCode,
    addressNumber,
    addressStreet) values ('2', -- gender_id,
    '2',-- city,
    '1',-- countryOfOrigin_id,
	'Maria',-- firstName,
    'Silva',-- lastName,
    '1980-01-02',-- birthdate,
	'00000000-5',-- identificationDocument,
    'claudiosilva@email.com',-- email,
    'www.linkedin.com.br/claudio',-- linkedinProfileUrl,
	'11-99999-9999',-- mobileNumber,
    '11-5555-5555', -- phoneNumber
    '00000000',-- addressZipCode,
    '50',-- addressNumber,
    'Rua Claudio da Silva');-- addressStreet

insert into work_experience (
    role_id,
    candidato_id,
    companyName,
    activitiesPerformed,
    startMonth,
    startYear,
    endMonth,
    endYear) values ('1',-- role_id,
    '2', -- candidato_id,
    'Taking',-- companyName,
    'Acompanhamento de cronograma de projeto',-- activitiesPerformed,
    '2020-10-04',-- startMonth,
    '2020-10-04',-- startYear,
    '2020-10-04',-- endMonth,
    '2020-10-04'); -- endYear
    
insert into academic_qualification (
    formation_id,
    institution_id,
    course_id,
    status_id,
    candidato_id,
    startMonth,
    startYear,
    endMonth,
    endYear) values ('1',-- formation_id,
    '1',-- institution_id,
    '1',-- course_id,
    '1',-- status_id,
    '1', -- candidato_id
    '1994-02-01',-- startMonth,
    '1999-02-01',-- startYear,
    '1999-02-01',-- endMonth,
    '1999-02-01');-- endYear)
    
insert into languages_skill (
    language_id,
	level_id,
    candidato_id) values 
    ('1','1','1');
    
insert into candidato_areas (
    areaInterest_id,
    candidato_id) values 
    ('1','1');
    
insert into candidatoDisability (
	disability_id,
	candidato_id) values 
    ('1','1');
   


    