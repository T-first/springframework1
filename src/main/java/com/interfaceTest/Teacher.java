package com.interfaceTest;

import java.time.LocalDate;
import java.util.Date;

public class Teacher implements Cloneable{
    private String name;
    private Date bithday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }

    public Teacher(String name, Date bithday) {

        this.name = name;
        this.bithday = bithday;
    }

    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        Teacher cloned =(Teacher)super.clone();
        cloned.bithday =(Date) cloned.bithday.clone();
        return cloned;
    }
}
