--liquibase formatted sql

--changeset cgt:1
create table users
(
    id   identity primary key,
    name varchar(255) not null
);
--rollback drop table users;