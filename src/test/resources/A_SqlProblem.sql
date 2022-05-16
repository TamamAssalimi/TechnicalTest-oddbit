DROP TABLE EmployeePosition;
DROP TABLE EmployeeInfo;
create table employeeinfo
(
    EmpID      int auto_increment
        primary key,
    EmpFname   varchar(256) null,
    EmpLname   varchar(256) null,
    Department varchar(256) null,
    Project    varchar(256) null,
    Address    varchar(256) null,
    DOB        date         null,
    Gender     varchar(12)  null
);

INSERT INTO test.employeeinfo (EmpID, EmpFname, EmpLname, Department, Project, Address, DOB, Gender) VALUES (1, 'Rohit', 'Gupta', 'Admin', 'P1', 'Delhi', '1979-02-12', 'Male');
INSERT INTO test.employeeinfo (EmpID, EmpFname, EmpLname, Department, Project, Address, DOB, Gender) VALUES (2, 'Rahul', 'Mahajan', 'Admin', 'P2', 'Mumbai', '1979-02-12', 'Male');
INSERT INTO test.employeeinfo (EmpID, EmpFname, EmpLname, Department, Project, Address, DOB, Gender) VALUES (3, 'Ankita', 'Kapoor', 'HR', 'P4', 'Chennai', '1979-02-12', 'Female');
INSERT INTO test.employeeinfo (EmpID, EmpFname, EmpLname, Department, Project, Address, DOB, Gender) VALUES (4, 'Sonia', 'Banerjee', 'HR', 'P3', 'Pune', '1979-02-12', 'Female');
INSERT INTO test.employeeinfo (EmpID, EmpFname, EmpLname, Department, Project, Address, DOB, Gender) VALUES (5, 'Swati', 'Garg', 'HR', 'P5', 'Delhi', '1979-02-12', 'Female');

create table employeeposition
(
    EmpID         int          not null,
    EmpPosition   varchar(256) null,
    DateOfJoining date         null,
    Salary        int          not null,
    constraint R_EMPID
        foreign key (EmpID) references employeeinfo (EmpID)
);

create index R_EmpID
    on employeeposition (EmpID);

INSERT INTO test.employeeposition (EmpID, EmpPosition, DateOfJoining, Salary) VALUES (1, 'Executive', '2020-04-01', 75000);
INSERT INTO test.employeeposition (EmpID, EmpPosition, DateOfJoining, Salary) VALUES (2, 'Manager', '2020-04-02', 500000);
INSERT INTO test.employeeposition (EmpID, EmpPosition, DateOfJoining, Salary) VALUES (3, 'Manager', '2020-04-03', 150000);
INSERT INTO test.employeeposition (EmpID, EmpPosition, DateOfJoining, Salary) VALUES (2, 'Officer', '2020-04-04', 90000);
INSERT INTO test.employeeposition (EmpID, EmpPosition, DateOfJoining, Salary) VALUES (1, 'Manager', '2020-04-05', 300000);