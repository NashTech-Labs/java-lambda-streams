package com.knoldus.java.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeProcessingWithLambdaTest {

    ArrayList<Employee> employeeList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        //adding data to the array list
        employeeList.add(new Employee(23, "KRISHNA", "VASUDEV",50000));
        employeeList.add(new Employee(22, "PRAKHAR", "RASHTOGI",45000));
        employeeList.add(new Employee(22, "DEEPAK", "KUMAR",35000));
        employeeList.add(new Employee(25, "AASHIF", "ALI",55000));
        employeeList.add(new Employee(21, "vaishali", "yaadav",51000));
        employeeList.add(new Employee(22, "PRATIBHA", "YADAV",43500));
        employeeList.add(new Employee(23, "ARUNESH", "JAIN",42000));
        employeeList.add(new Employee(24, "SHIVAM", "ROY",38500));
        employeeList.add(new Employee(25, "anshita", "mathur",41000));

    }
    @Test
    public void testSortByName(){
        List<Employee> employees = EmployeeProcessingWithLambda.sortByName(employeeList);
        Assertions.assertEquals("Employee{age=25, name='AASHIF', sureName='ALI', salary=55000.0}", employees.get(0).toString());
    }
    @Test
    public void sortInAscendingOrder(){
        List<Employee> employee = EmployeeProcessingWithLambda.sortByName(employeeList);
        Assertions.assertEquals("Employee{age=24, name='SHIVAM', sureName='ROY', salary=38500.0}", employee.get(4).toString());

    }
    @Test
    public void sortInDescendingOrder(){
        List<Employee> employee = EmployeeProcessingWithLambda.sortByName(employeeList);
        Assertions.assertEquals("Employee{age=23, name='ARUNESH', sureName='JAIN', salary=42000.0}", employee.get(1).toString());

    }
    @Test
    public void sortInLambdaWay(){
        List<Employee> employees = EmployeeProcessingWithLambda.sortByName(employeeList);
        Assertions.assertEquals("Employee{age=23, name='KRISHNA', sureName='VASUDEV', salary=50000.0}", employees.get(5).toString());
    }
}
