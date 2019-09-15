package com.company;

public class Student {

    private String name;
    private int rollNo;
    private int id;

    public Student() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void displayStudent(){
        System.out.println("Name :"+name+"Roll no :"+rollNo +"id :"+id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", id=" + id +
                '}';
    }
}
