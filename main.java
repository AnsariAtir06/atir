import java.util.*;
class Employee
{
Scanner sc=new Scanner(System.in);
String name,address;
Long mob;
int id;
String mail;
Double basic_pay,net_salary,gross_salary;
Double hra,da,pf,staff_club_fund;

public void input()
{
System.out.println("---------------ENTER EMPLOYEE DETAILS----------------");
System.out.println("Enter the name of Employee : ");
name=sc.next();
System.out.println("Enter the address of Employee : ");
address=sc.next();
System.out.println("Enter the ID of Employee : ");
id=sc.nextInt();
System.out.println("Enter the mail id of Employee : ");
mail=sc.next();
System.out.println("Enter the basic salary of "+name+" : ");
basic_pay=sc.nextDouble();
}

void output()
{
System.out.println("---------------EMPLOYEE DETAILS----------------");                                     
System.out.println("\n Name of Employee = "+name);
System.out.println("\n Address of Employee = "+address);
System.out.println("\n ID of Employee = "+id);
System.out.println("\n Mail of Employee = "+mail);
System.out.println("\n Basic salary = "+basic_pay);
}

void calculations()
{
da=basic_pay*97/100;
hra=basic_pay*10/100;
pf=basic_pay*12/100;
staff_club_fund=basic_pay*0.1/100;
gross_salary=basic_pay+hra;
net_salary=gross_salary-hra-staff_club_fund;
}

void salary_slip()
{
System.out.println("---------------EMPLOYEE SALARY DETAILS----------------");
System.out.println("DA of Employee = "+da);
System.out.println("HRA of Employee = "+hra);
System.out.println("PF of Employee = "+pf);
System.out.println("Staff club fund of Employee = "+staff_club_fund);
System.out.println("gross_salary of Employee = "+gross_salary);
System.out.println("net_salary of Employee = "+net_salary);
}
}
class Programmer extends Employee
{
void display()
{
input();
output();
calculations();
salary_slip();
}
}


class  TeamLeader extends Employee
{
void display()
{
input();
output();
calculations();
salary_slip();
}
}

class AssistantProjectManager extends Employee
{
void display()
{
input();
output();
calculations();
salary_slip();
}
}

class ProjectManager extends Employee
{
void display()
{
input();
output();
calculations();
salary_slip();
}
}

public class main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("---------------SELECT YOUR CHOICE----------------");
System.out.println("\n 1.Programmer \n 2.TeamLeader \n 3.AssistantProjectManager \n 4.ProjectManager");  
int s =sc.nextInt();      
switch(s)
{
case 1:
Programmer p =new  Programmer();
p.display ();
break;

case 2:
TeamLeader t =new  TeamLeader();
t.display ();
break;

case 3:
AssistantProjectManager ap =new  AssistantProjectManager();
ap.display ();
break;

case 4:
ProjectManager a =new  ProjectManager();
a.display ();
break;

default:
System.out.println("wrong input");
break;
}
}
}


