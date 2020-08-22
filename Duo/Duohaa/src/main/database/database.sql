USE duohaa_db;

CREATE TABLE users(
    id int primary key auto_increment,
    username nvarchar(64) unique not null,
    password_hash nvarchar(64) not null,
    first_name nvarchar(64) not null,
    second_name nvarchar(64) not null,
    registration_date date default SYSDATE()
);

CREATE TABLE duohaa (
    id int primary key auto_increment,
    first text not null,
    second text not null,
    instruction text, -- not required
    comment text, -- not required
    creation_date DATE,
    author_id int
);