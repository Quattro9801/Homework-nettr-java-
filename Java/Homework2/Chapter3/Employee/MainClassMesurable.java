package exercise1Chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class MainClassMesurable {
    public static void main(String[] args) {

        Measurable[] emp = new Measurable[3];
        emp[0] = new Employee(1,"Petya","Ivanov",500);
        emp[1] = new Employee(1,"Vasya","Petrov",700);
        emp[2] = new Employee(1,"Elena","Ermolaeva",1000);
        double salary=Salary.average(emp);
        String salaryRound=String.format("%.3f",salary);
        System.out.println("Средняя зарплата сотрудников = "+salaryRound+" $");
        Measurable Maxsalary=Salary.calculatemaxSalary(emp);
        System.out.println("Сотрудник с наибольшей зарплатой "+Maxsalary);

        }


    }

