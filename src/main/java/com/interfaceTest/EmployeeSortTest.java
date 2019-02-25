package com.interfaceTest;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class EmployeeSortTest {
    public static void main(String[] args) {
        System.out.println( Paths.get("jdk1.8","jre","bin")); //打印： jdk1.8\jre\bin
       Employee[] employees = new Employee[3];
       employees[0] =new Employee("tom","男",18,"No001",new Date());
       employees[1] =  new Employee("jack","男",20,"NO002",new Date());
       employees[2] = new Employee("candy","女",19,"NO003",new Date());
       String []  s = new String[]{"123","1","12"};

       Arrays.sort(employees);
        Comparator<String> comparator = new LengthComparator();
        System.out.println(Arrays.toString(employees));
        Arrays.sort(s,new LengthComparator());
        System.out.println(Arrays.toString(s));
        Arrays.sort(s,(String y,String x)-> x.length()-y.length());
        System.out.println(Arrays.toString(s));
        List<Employee>  employeesList = Arrays.asList(employees);
        employeesList.forEach(employee -> System.out.println(employee));
        employeesList.forEach(System.out::println);
    }
}
