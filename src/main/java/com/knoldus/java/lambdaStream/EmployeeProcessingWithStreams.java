package com.knoldus.java.lambdaStream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeProcessingWithStreams {

    // LOGGER added
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeProcessingWithStreams.class);
   
    /**
     *
     * filterAllEmployeeDataStartingNameWith_A (List<Employee> employeeList) using following methods from Stream API
     * stream(): creates sequential Stream
     * collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList() method
     * @param employeeList list of employees
     * @return true if all Employee Starting Name with 'A' otherwise false.
     */
    public static List<Employee> filterAllEmployeeDataStartingNameWith_A (List<Employee> employeeList){
        List<Employee> list1 = employeeList.stream().filter(emp -> emp.getSureName().startsWith("A")).collect(Collectors.toList());
        return list1;
    }

    /**
     * filterAllEmployeeDataStartingNameWith_P (List<Employee> employeeList) using following methods from Stream API
     * stream(): creates sequential Stream
     * collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList() method
     * @param employeeList list of employees
     * @return true if filter all Employee Data Starting Name With 'P' otherwise false.
     */
    public static List<Employee> filterAllEmployeeDataStartingNameWith_P (List<Employee> employeeList){
        List<Employee> list2=employeeList.stream().filter(name -> name.getName().startsWith("P")).collect(Collectors.toList());
        return list2;
    }
    /**
     * printingAllEmployeeNamesInUpperCase (List<Employee> employeeList) using following methods from Stream API
     * stream(): creates sequential Stream
     * @param employeeList list of employees
     * @return true if printing All Employee Names in Upper Case otherwise false.
     */
    public static  List<Employee>printingAllEmployeeNamesInUpperCase (List<Employee> employeeList){

        employeeList.stream().forEach(name -> LOGGER.info(name.toString().toUpperCase()));
        return employeeList;
    }
     /**
      * filterAllEmployeeNamesEndingWith_A_inUpperCase (List<Employee> employeeList) using following methods from Stream API
      * stream(): creates sequential Stream
      * filter(): returns Stream that match the predicate
      * @param employeeList list of employees
      * @return true if filter all Employee Names Ending With 'A' in Upper Case otherwise false.
      */
    public static  List<Employee>filterAllEmployeeNamesEndingWith_A_inUpperCase (List<Employee> employeeList){
        employeeList.stream().filter(name -> name.getName().endsWith("A")).forEach(name -> LOGGER.info(name.toString().toUpperCase()));
        return employeeList;
    }

     /**
      * countEmployeeWhoseNamesEndingWith_A_Letter(List<Employee> employeeList) using following methods from Stream API
      * filter(): returns Stream that match the predicate
      * count(): return the number of elements in the stream.
      * @param employeeList list of employees
      * @return true if counted Employee Whose Names Ending With 'A' Letter otherwise false.
      */
    public static List<Employee> countEmployeeWhoseNamesEndingWith_A_Letter(List<Employee> employeeList){

        LOGGER.info(String.valueOf(employeeList.stream().filter(name -> name.getName().endsWith("A")).count()));
        return employeeList;
    }
     /**
      * printingEmployeeNamesStartingWith_D_Letter(List<Employee> employeeList) using following methods from Stream API
      * stream(): creates sequential Stream
      * filter(): returns Stream that match the predicate
      * @param employeeList list of employees
      * @return true if printing all Employee Names Starting With Letter 'D' otherwise false.
      */
    public static  List<Employee>printingEmployeeNamesStartingWith_D_Letter(List<Employee> employeeList) {
        employeeList.stream().filter(name -> name.getName().startsWith("D")).forEach(name -> LOGGER.info(String.valueOf(name)));
        return employeeList;
    }
     /**
      * employeeWhoseAgeAreMoreThan_23_Yrs (List<Employee> employeeList) using following methods from Stream API
      * @param employeeList list of employees
      * @return employees, Whose Age are more than 23 Years .
      */
    public static  List<Employee>employeeWhoseAgeAreMoreThan_23_Yrs (List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            LOGGER.info("Name is = " + employee.getName() + " age is = " + employee.getAge());
        }
        return employeeList;
    }

    /**
     * employeesSalaryMoreThan5000(List<Employee> employeeList) using following methods from Stream API
     * find employees whose salaries are above 5000
     */
    public static List<Employee> employeesSalaryMoreThan5000(List<Employee> employeeList) {
        for (Employee employee : employeeList){
            LOGGER.info("Employee Name: " + employee.getName() + " Salary is = " + employee.getSalary());
        }
        return employeeList;
    }
    /**
     * employeeWhoseAgeAreMoreThan_23_Yrs (List<Employee> employeeList) using following methods from Stream API
     * stream(): creates sequential Stream
     * sorted list by  age in Ascending order
     */
    public static List<Employee> sortedListByTheirAge (List <Employee> employeeList){
           return employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge))
            .collect(Collectors.toList());

    }
}
