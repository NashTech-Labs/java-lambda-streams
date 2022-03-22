package com.knoldus.java.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeProcessingWithStreamTest {

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
    public void testFilterAllEmployeeDataStartingNameWith_A(){
       List<Employee> employees = EmployeeProcessingWithStreams.filterAllEmployeeDataStartingNameWith_A(employeeList);
       Assertions.assertEquals("Employee{age=25, name='AASHIF', sureName='ALI', salary=55000.0}", employees.get(0).toString());
    }
    @Test
    public void testFilterAllEmployeeDataStartingNameWith_P(){
        List<Employee> employees = EmployeeProcessingWithStreams.filterAllEmployeeDataStartingNameWith_P(employeeList);
        Assertions.assertEquals("Employee{age=22, name='PRATIBHA', sureName='YADAV', salary=43500.0}", employees.get(1).toString());
    }
    @Test
    public void testPrintingAllEmployeeNamesInUpperCase(){
        List<Employee> employees = EmployeeProcessingWithStreams.printingAllEmployeeNamesInUpperCase(employeeList);
        Assertions.assertEquals("Employee{age=22, name='PRATIBHA', sureName='YADAV', salary=43500.0}", employees.get(5).toString());
    }
    @Test
    public void testFilterAllEmployeeNamesEndingWith_A_inUpperCase() {
        List<Employee> employees = EmployeeProcessingWithStreams.filterAllEmployeeNamesEndingWith_A_inUpperCase(employeeList);
        Assertions.assertEquals("Employee{age=23, name='KRISHNA', sureName='VASUDEV', salary=50000.0}", employees.get(0).toString());
    }

    @Test
    public void testCountEmployeeWhoseNamesEndingWith_A_Letter(){
        List<Employee> employees = EmployeeProcessingWithStreams.countEmployeeWhoseNamesEndingWith_A_Letter(employeeList);
        Assertions.assertEquals("Employee{age=23, name='ARUNESH', sureName='JAIN', salary=42000.0}", employees.get(6).toString());

    }
    @Test
    public void testPrintingEmployeeNamesStartingWith_D_Letter(){
        List<Employee> employees = EmployeeProcessingWithStreams.printingEmployeeNamesStartingWith_D_Letter(employeeList);
        Assertions.assertEquals("Employee{age=22, name='DEEPAK', sureName='KUMAR', salary=35000.0}", employees.get(2).toString());

    }
    @Test
    public void testEmployeeWhoseAgeAreMoreThan_23_Yrs(){
        List<Employee> employees = EmployeeProcessingWithStreams.employeeWhoseAgeAreMoreThan_23_Yrs(employeeList);
        Assertions.assertEquals("Employee{age=25, name='anshita', sureName='mathur', salary=41000.0}", employees.get(8).toString());

    }

}