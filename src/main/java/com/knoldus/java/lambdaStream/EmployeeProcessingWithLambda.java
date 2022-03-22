package com.knoldus.java.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeProcessingWithLambda {

    static ArrayList<Employee> employeeList = new ArrayList<>();

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeProcessingWithLambda.class);

    /**
     * sortByName(List<Employee> employeeList) using following method with Lambda.
     * sort(): sort the list of all employees name i.e Ascending order
     * @param employeeList list of employees
     * @return true if all the employee sorted by their name otherwise false.
     */

    public static List<Employee> sortByName(List<Employee> employeeList){

        employeeList.sort((Employee e1, Employee e2) -> e1.getSureName().compareTo(e2.getSureName()));
        return employeeList;
    }

    /**
     * sortInLambdaWay(List<Employee> employeeList) using following method with Lambda.
     * sort(): sort the list of all employees name i.e Ascending order & descending order.
     * @param employeeList  list of employees
     * @return  true, if all the employee sorted by their salary otherwise false.
     */
     public static List<Employee> sortInLambdaWay(List<Employee> employeeList) {
         employeeList.sort((Employee e1, Employee e2) -> e2.getSalary().compareTo(e1.getSalary()));

         LOGGER.info("\n\n<--- Sorted list with Lambda - DESC order --->");
         employeeList.forEach(emp -> LOGGER.info(emp.toString()));

         employeeList.sort((Employee e2, Employee e1) -> e2.getSalary().compareTo(e1.getSalary()));
         LOGGER.info("\n\n<--- Sorted list with Lambda - ASC order --->");
         employeeList.forEach(emp -> LOGGER.info(emp.toString()));

         return employeeList;
   }
    /**
     * sortInAscendingOrder(List<Employee> employeeList) using following method with Lambda.
     * sort(): sort the list of all employees name i.e Ascending order & descending order.
     * @param employeeList  list of employees
     * @return  true, if all the employee sorted by their salary otherwise false.
     */

    // ascending order
    public static List<Employee> sortInAscendingOrder(List<Employee> employeeList) {
        employeeList.sort((Employee o1, Employee o2) -> (o1.getName().compareTo(o2.getName())));
        return employeeList;
    }

    // descending order
        public static List<Employee> sortInDescendingOrder(List <Employee> employeeList) {
            employeeList.sort((Employee e1, Employee e2) -> (e2.getName().compareTo(e1.getName())));
            return employeeList;
        }

}
