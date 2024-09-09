CREATE TABLE requester (
    requester_id    serial not null,
    name            varchar(255) not null,
    password        varchar(255) not null,
    email           varchar(255) not null,
    phone           varchar(255) not null,
    employee_id     varchar(255) not null,
    office          varchar(255) not null,
    CONSTRAINT requester_pk PRIMARY KEY(requester_id)
);