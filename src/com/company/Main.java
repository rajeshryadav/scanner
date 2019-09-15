package com.company;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static ArrayList arrayList = new ArrayList();


    public static void main(String[] args) {

        printMessage();

        Scanner myObj = new Scanner(System.in);

        boolean b=true;

        while (b) {
            int enteredOption= myObj.nextInt();

            switch (enteredOption) {
                case 1:
                    System.out.println("Entered name");
                    System.out.println("Entered roll");
                    System.out.println("Entered id");

                    Scanner myObj2 = new Scanner(System.in);
                    String name = myObj2.nextLine();
                    int rollNo = myObj2.nextInt();
                    int id = myObj2.nextInt();



                    Student student = new Student();
                    student.setName(name);
                    student.setRollNo(rollNo);
                    student.setId(id);

                    arrayList.add(student);
                    printMessage();
                    break;

                case 2:
                    ListIterator listIterator=arrayList.listIterator();

                    while (listIterator.hasNext()){
                        System.out.println(listIterator.next());
                    }
                    printMessage();
                    break;
                case 3:
                    Scanner updateObj = new Scanner(System.in);


                    System.out.println("Entered name");
                    System.out.println("Entered roll");
                    System.out.println("Entered id");

                    String updateName = updateObj.nextLine();
                    int updateRollNo = updateObj.nextInt();
                    int updateId = updateObj.nextInt();

                    ListIterator listIterator1=arrayList.listIterator();

                    while (listIterator1.hasNext()){
                        Student student1= (Student) listIterator1.next();
                        if (updateId==student1.getId()){
                            student1.setName(updateName);
                            student1.setRollNo(updateRollNo);
                        }
                    }
                    printMessage();
                    break;
                case 4:
                    Scanner delete = new Scanner(System.in);
                    int deleteId = delete.nextInt();
                    ListIterator listIterator2=arrayList.listIterator();

                    while (listIterator2.hasNext()){
                        Student student1= (Student) listIterator2.next();
                        if (deleteId==student1.getId()){

                            arrayList.remove(0);
                            //arrayList.remove(listIterator2);
                            System.out.println("Just to check");
                        }
                    }


                    break;
                case 6:
                    b=false;

                default:
                    System.out.println("No matched");


            }


        }
    }

    public static void printMessage(){
        System.out.println("Please enter 1 for add student");
        System.out.println("Please enter 2 for read student");
        System.out.println("Please enter 3 for update student");
        System.out.println("Please enter 4 for delete student");
        System.out.println("Please enter 5 to get exit");
    }
}
