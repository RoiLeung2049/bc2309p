
-- the execrise part --

-- Task 1  SQL
CREATE DATABASE BOOTCAMP_EXECRISE1 ; 

use BOOTCAMP_EXECRISE1;

-- Task 2 create all the table  , ingore table job_grades

-- create table for regions 
Create Table regions(
	REGION_ID numeric PRIMARY KEY ,
    REGION_NAME VARCHAR(25)
);

-- create table for countries
Create Table countries(
	COUNTRY_ID CHAR(2) PRIMARY KEY,
	COUNTRY_NAME VARCHAR(40),
    REGION_ID numeric REFERENCES regions(REGION_ID)
);

-- locations table 
Create Table locations (
	LOCATION_ID NUMERIC PRIMARY KEY,
    STREET_ADDRESS VARCHAR(25),
    POSTAL_CODE VARCHAR(12),
    CITY VARCHAR(30),
    STATE_PROVINCE VARCHAR(12),
    COUNTRY_ID CHAR(2) REFERENCES countries(COUNTRYID)

);

-- create departments 

Create Table departments(
	DEPARTMENT_ID NUMERIC PRIMARY KEY,
    DEPARTMENT_NAME varchar(30),
    MANAGER_ID NUMERIC,
    LOCATION_ID NUMERIC REFERENCES locations(LOCATION_ID)
	

);

-- create table job first , before making table employees for the foreign key  from employees(JOB_ID) to jobs(JOB_ID)
Create Table jobs (
	JOB_ID VARCHAR(10) PRIMARY KEY,
    JOB_TITLE VARCHAR(35),
	MIN_SALARY NUMERIC,
	MAX_SALARY NUMERIC
    
);

--  create table job_history 
Create Table job_history(
	EMPLOYEE_ID NUMERIC,
    START_DATE DATE,
    END_DATE DATE,
    JOB_ID VARCHAR(10),
    DEPARTMENT_ID NUMERIC,
    PRIMARY KEY (EMPLOYEE_ID, START_DATE)
    

);

-- set ths foreign in job History  by using alter table 
Alter table job_history 
Add constraint job_history_FK FOREIGN KEY (JOB_ID) REFERENCES jobs(JOB_ID);


-- create table employee 
Create Table employees(
	EMPLOYEE_ID NUMERIC PRIMARY KEY REFERENCES job_history(EMPLOYEE_ID),
    FIRST_NAME VARCHAR(20),
    LAST_NAME VARCHAR(25),
    EMAIL VARCHAR(25),
    PHONE_NUMBER VARCHAR(20),
    HIRE_DATE DATE,
    JOB_ID VARCHAR(10) REFERENCES jobs(HOB_ID),
    SALARY NUMERIC,
    COMMISSION_PCT NUMERIC,
    MANAGER_ID NUMERIC,
    DEPARTMENT_ID NUMERIC REFERENCES departments(DEPARTMENT_ID)      
);



--   insert data into table 
insert into locations values (1000, "1297 Via Cola di Rie",989, "Roma","","IT");
insert into locations values (1100, "93091 Calle della Te",10934, "Venice","","IT");
insert into locations values (1200, "2017 Shinjuku-ku",1689, "Tokyo","Tokyo","JP");
insert into locations values (1400, "2014 Jabberwocky Rd",26192, "Southlake","Texas","US");




insert into COUNTRIES values ("DE", "Germany", 1);
insert into COUNTRIES values ("IT", "Italy", 1);
insert into COUNTRIES values ("JP", "Japan", 3);
insert into COUNTRIES values ("US", "United State", 2);

insert into DEPARTMENTS values (10, "Administration", 200,1100);
insert into DEPARTMENTS values (20, "Marketing", 201,1200);
insert into DEPARTMENTS values (30, "Purchasing", 202,1400);


insert into EMPLOYEES values (100, "Steven", "King","SKING","515-1234567","1987-06-17","ST_CLERK",24000.00,0.00,109,10);
insert into EMPLOYEES values (101, "Neena", "Kochhar","NKOCHHAR","515-1234568","1987-06-18","MK_REP",17000.00,0.00,103,20);
insert into EMPLOYEES values (102, "Lex", "De Haan","LDEHAAN","515-1234569","1987-06-19","IT_PROG",17000.00,0.00,108,30);
insert into EMPLOYEES values (103, "Alexander", "Hunold","AHUNOLD","590-4234567","1987-06-20","MK_REP",9000.00,0.00,105,20);


insert into JOBS values ("ST_CLERK", "Clerk", 10000,25000);
insert into JOBS values ("MK_REP", "Marketing Reprsentative", 8000,30000);
insert into JOBS values ("IT_PROG", "Programmer", 15000,30000);

-- need to add Job ID first before job_history , because of foreign key 

insert into JOB_HISTORY values (102, '1993-01-13', '1998-07-24',"IT_PROG",20);
insert into JOB_HISTORY values (101, "1989-09-21", "1993-10-27","MK_REP",10);
insert into JOB_HISTORY values (101, "1993-10-28", "1997-03-15","MK_REP",30);
insert into JOB_HISTORY values (100, "1996-02-17", "1999-12-19","ST_CLERK",30);
insert into JOB_HISTORY values (103, "1998-03-24", "1999-12-31","MK_REP",20);

insert into REGIONS values (1, "Europe");
insert into REGIONS values (2, "north America");
insert into REGIONS values (3, "Asia");


-- Task 3 Write a query to find location_id, street_address, city , state_province , country_name

SELECT L.LOCATION_ID , L.STREET_ADDRESS , L.CITY , L.STATE_PROVINCE , C.COUNTRY_NAME 
FROM Locations L 
left join countries C  on L.COUNTRY_ID = C.COUNTRY_ID ;

-- Task 4 find first name , last name , department id  of all employees
select first_name , last_name , department_id  from employees ;

-- Task 5 find first_name , last_name ,job_id , department_ID of the employees who works in Japan 
select e.first_name , e.last_name , e.job_id, e.department_id from employees e  
left join departments D on D.department_id = e.department_id 
left join locations L on D.location_ID = L.Location_ID
left join countries C on C.Country_ID  = L.Country_ID
where C.country_name = 'Japan' ; 

-- Task 6 find employee_id , last_name  with manager_id and last name 

-- select e.EMPLOYEE_ID , e.LAST_NAME , e.Manager_ID ,  from EMPLOYEES e 

-- Task 7 find the first_name , last_name and hire date of employ who was hired after employee 'Lex de Haan' 
select first_name , last_name , hire_date from Employees 
where hire_date >  ( select Hire_date from Employees where ( First_name = 'Lex' and Last_name = 'De Haan')) ; 
 
-- Task 8  department name and no. of employee of each department 

WITH CTE_EMPLOYEES AS (select e.Department_ID  as DEPARTMENT_ID , Count(EMPLOYEE_ID) as Num_of_Employee from EMPLOYEES e
group by Department_ID) 

select D.Department_name , C.Num_of_Employee  from Departments D
left join cte_employees C ON D.DEPARTMENT_ID = C.DEPARTMENT_ID ;


-- Task 9 get employee ID , job title , number of days between ending date and start date for all job in department ID 30 
with CTE_Jobs as 
	(select jh.employee_id as employee_id, jh.start_date as start_date , jh.end_date  as end_date ,jh.job_id as job_id , j.JOB_TITLE as JOB_TITLE , jh.department_id as department_id from JOB_HISTORY jh 
		left join JOBS j on j.JOB_ID = jh.JOB_ID)
        

select e.employee_ID , c.JOB_TITLE , DateDiff( c.end_date ,c.start_date   )   from employees e
left join CTE_JOBs c  on c.employee_id = e.employee_ID 
where c.department_id = 30 ; 


-- Task 10 display all deaprtment name , manager name , city and country name 


-- Task 11  display average salary of each department 

with CTE_Employee_D as 
( Select e.SALARY as SALARY , d.DEPARTMENT_NAME as DEPARTMENT_NAME from EMPLOYEES e
	left join Departments D on D.DEPARTMENT_ID = e.DEPARTMENT_ID ) 

SELECT C.DEPARTMENT_NAME , AVG(SALARY) 
from CTE_Employee_D C 
group by C.DEPARTMENT_NAME ; 