package com.interfaceTest;


import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;


public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee =new Employee("jack","男",18,"No0001",new Date());
        Timer timer = new Timer(2000,null);
        Employee employee1 =employee.clone();
        com.Exception.Employee e =new com.Exception.Employee();
        employee.setName("Tfirst");
//        employee.subFileds(); 私有方法
        System.out.println(employee.toString()); // Employee{name='Tfirst', sex='男', age=18, number='No0001', hireDay=Fri Feb 01 14:02:15 CST 2019}
        System.out.println(employee1.toString());// Employee{name='jack', sex='男', age=18, number='No0001', hireDay=Fri Feb 01 14:02:15 CST 2019}
        try {
            Thread .currentThread().sleep(2000);
        } catch (InterruptedException ｘ) {
            ｘ.printStackTrace();
        }
//        employee1.setHireDay(new Date());
        System.out.println("employee clone info: "+ employee.hashCode() +" = "+employee1.hashCode());
        System.out.println( " employee clone info: "+ employee.getHireDay().hashCode()+" = "+ employee1.clone().getHireDay().hashCode());
        LocalDate birthday = LocalDate.now();
        System.out.println();
        Date date1  =new Date();
        Date  date2 = (Date) date1.clone();
        System.out.println("date clone info: " + date1.hashCode()+ " = "+ date2.hashCode());
        Teacher teacher = new Teacher("张雪峰",date1);
//        Teacher teacher1 = teacher.clone(); //子类无法继承父类的protected方法
        Object object = new Object();
        System.out.println(object.hashCode());
//       System.out.println(object.clone().hashCode());
    }


}
