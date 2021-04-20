CREATE USER teemo IDENTIFIED BY teemo;
GRANT CONNECT TO teemo;
GRANT UNLIMITED TABLESPACE TO teemo;
GRANT create session TO teemo;
GRANT create table TO teemo;
GRANT create view TO teemo;
GRANT create any trigger TO teemo;
GRANT create any procedure TO teemo;
GRANT create sequence TO teemo;
GRANT create synonym TO teemo;


create table teemo.users(
    user_id_pk NUMBER(15),
    user_name varchar2(200) NOT NULL,
    user_email varchar2(200) UNIQUE NOT NULL,
    user_password varchar(200) NOT NULL,
    
    CONSTRAINT user_pk PRIMARY KEY(user_id_pk)
);

create table teemo.subject(
    subject_id_pk NUMBER(15) primary key,
    subject_name varchar(30) not null,
    user_id_fk NUMBER(15) NOT NULL,
    constraint user_id_fk_subject foreign key (user_id_fk) references TEEMO.users (user_id_pk)
);

create table teemo.free_time (
    free_time_id_pk NUMBER(15) primary key,
    day_of_week NUMBER(15) not null,
    free_time_hour NUMBER(15) not null,
    user_id_fk NUMBER(15) NOT NULL,
    constraint user_id_fk_free_time foreign key (user_id_fk) references TEEMO.users (user_id_pk)
);

create table teemo.time_subject (
    time_subject_id_pk NUMBER(15) primary key,
    subject_id_fk NUMBER(15),
    free_time_id_fk NUMBER(15),
    constraint subject_id_fk_time_subject foreign key (subject_id_fk) references TEEMO.subject (subject_id_pk),
    constraint free_time_id_fk_time_subject foreign key (free_time_id_fk) references TEEMO.free_time (free_time_id_pk)
);

create table teemo.user_subject (
    user_subject_id_pk NUMBER(15) primary key,
    dificulty NUMBER(15) NOT NULL,
    user_id_fk NOT NULL,
    subject_id_fk NOT NULL,
    constraint user_id_fk_user_subject foreign key (user_id_fk) references TEEMO.users (user_id_pk),
    constraint subject_id_fk_user_subject foreign key (subject_id_fk) references TEEMO.subject (subject_id_pk)
);



