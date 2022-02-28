package com.knoldus.java.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 /**
 * main employee class called here
 */
public class EmployeeImplementation {

    public static void main(String[] args) {

        // A list of object employee class
        ArrayList<Employee> employeeList = new ArrayList<>();

        //adding data to the array list
        employeeList.add(new Employee(23, "KRISHNA", "VASUDEV"));
        employeeList.add(new Employee(24, "PRAKHAR", "RASHTOGI"));
        employeeList.add(new Employee(22, "DEEPAK", "KUMAR"));
        employeeList.add(new Employee(25, "AASHIF", "ALI"));
        employeeList.add(new Employee(21, "vaishali", "yaadav"));
        employeeList.add(new Employee(22, "PRATIBHA", "YADAV"));
        employeeList.add(new Employee(23, "ARUNESH", "JAIN"));
        employeeList.add(new Employee(24, "SHIVAM", "ROY"));
        employeeList.add(new Employee(25, "anshita", "mathur"));

        System.out.println("===========================================");
        System.out.println("a) After Sorting the employee data by Name:");

        //Lambda expression for sorting the list by student last name
        employeeList.sort((Employee e1, Employee e2) -> e1.getSureName().compareTo(e2.getSureName()));
        employeeList.forEach((e) -> System.out.println(e));

        // filter all name starting with 'A'
        System.out.println("b) filter all employee data starting name with 'A'");
        System.out.println("===========================================");
        System.out.println("\n");
        employeeList.stream().filter(emp -> emp.getSureName().startsWith("A")).forEach((e) -> System.out.println(e));

        System.out.println("===========================================");
        System.out.println("c) filter all the employee names starting with P");
        employeeList.stream().filter(name -> name.getName().startsWith("P")).forEach(name -> System.out.println(name));
        System.out.println("");

        System.out.println("===========================================");
        System.out.println(" d) printing all employee names in upper case");
        employeeList.forEach(name -> System.out.println(name.toString().toUpperCase()));
        System.out.println("");

        System.out.println("===========================================");
        System.out.println("e) filter all the employee names ending with A in upper case\n");
        employeeList.stream().filter(name -> name.getName().endsWith("A")).forEach(name -> System.out.println(name.toString().toUpperCase()));
        System.out.println("");

        System.out.println("===========================================");
        System.out.println("f) count the employee names ending with 'A' Letter");
        System.out.println(employeeList.stream().filter(name -> name.getName().endsWith("A")).count());
        System.out.println("");

        System.out.println("===========================================");
        System.out.println("g) printing the employee names starting with D");
        employeeList.stream().filter(name -> name.getName().startsWith("D")).forEach(name -> System.out.println(name));
        System.out.println("");

        System.out.println("===========================================");

        List<Employee> employeeListHavingAgeMoreThan23 = employeeList.stream().filter(e -> (e).getAge() > 23).collect(Collectors.toList());
        System.out.println("h) Employee whose age more than 23 yrs are");

        for (Employee employee : employeeListHavingAgeMoreThan23) {
            System.out.println("Name is = " + employee.getName() + " age is = " + employee.getAge());
        }
        System.out.println("===========================================");
    }
}
