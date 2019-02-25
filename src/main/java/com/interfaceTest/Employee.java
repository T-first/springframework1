package com.interfaceTest;

import java.util.Date;

/**
 * 作者：甲第升科
 *
 *操作过程中由于Comparable接口是由编辑器引进的，
 * 没有泛型的括号（默认是object对象），
 * 导致compareTo方法中参数变为Employee的时候编辑器报错。
 * */
public class Employee implements Comparable<Employee>,Cloneable{
    private String name;
    private String sex;
    private int age;
    private String number;
    private Date hireDay;
    public Employee(String name, String sex, int age, String number, Date hireDay) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.number = number;
        this.hireDay = hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                ", hireDay=" + hireDay +
                '}';
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public int compareTo(Employee o) {
        return  Integer.compare(age,o.age);
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay =(Date)hireDay.clone();
        return cloned;
//        return (Employee) super.clone();
    }
    protected  String subFileds(){
        return null;
    }
}


