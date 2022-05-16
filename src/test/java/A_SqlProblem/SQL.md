* EmployeeInfo  table:

|EmpID  |EmpFname   |EmpLname   |Department |Project    |Address    |DOB            |Gender|
|-------|-----------|-----------|-----------|-----------|-----------|---------------|--------|
| 1		|Rohit		|Gupta		|Admin		|P1			|Delhi	    |02/12/1979	    |Male|
| 2		|Rahul		|Mahajan	|Admin		|P2			|Mumbai	    |10/10/1986	    |Male| 
| 3		|Sonia		|Banerjee	|HR			|P3			|Pune	    |05/06/1983	    |Female| 
| 4		|Ankita		|Kapoor		|HR			|P4			|Chennai	|28/11/1983	    |Female| 
| 5		|Swati		|Garg		|HR			|P5			|Delhi	    |06/04/1991	    |Female| 

* EmployeePosition table:

|EmpID	|EmpPosition|  DateOfJoining| 	Salary  |
|-------|-----------|---------------|-----------|
|1		|Executive 	|01/04/2020		|75000      | 
|2		|Manager 	|03/04/2020		|500000      |
|3		|Manager	|02/04/2020		|150000      |
|2		|Officer	|02/04/2020		|90000      |
|1		|Manager 	|03/04/2020		|300000      |


> Assignment
>>1. Write a query to fetch all employees who also hold the managerial position.
> 
>>`select e.* from test.employeeinfo e right join test.employeeposition p on e.EmpID =p.EmpID
where p.EmpPosition='Manager';`
> 
>>2. Create a query to fetch the third-highest salary from the EmpPosition table.
>
>>`select * from test.employeeposition p order by p.salary desc limit 3;`
> 
>>3. Write a query to find duplicate EmpID records from a EmployeePosition table.
> 
>>`select EmpID from (
select e.EmpID as EmpID, count(*) as count from test.employeeposition e group by e.EmpID
) employeeposition where count>1;` 
> 

