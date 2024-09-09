--- DDL
CREATE TABLE requester (
    requester_id   serial primary key,
    name                varchar(255) not null,
    password            varchar(255) not null,
    email               varchar(255) not null,
    phone               varchar(255) not null,
    employee_id         varchar(255) not null,
    office         varchar(255) not null
);

--- DML
insert into requester(name, employeeId, email, password, phone, office) values("Ajay", "E0001", "ajaydas5478@gmail.com", "test123", "9876543210", "Kolkata");