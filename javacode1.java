package com.bhavya;
import java.util.Arrays;
import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello java");
        System.out.println("bhavya");
        String name ="Bhavya";
        String surname="Tyagi";
        System.out.println(surname);
        String Fname=name;
        int age = 20;
        int a =2;
        int b=8;
        System.out.println(a+b);
        System.out.println(Fname);
        byte ab= 9;
        int phone= 5555555;
        float pi = 3.14F;
        System.out.println(name.length());
        System.out.println(surname.length());
        String fullname = name +" and " + surname;
        System.out.println(fullname);
        System.out.println(name.charAt(5));
        String name2= name.replace('a','x');
        System.out.println(name2);
        System.out.println(fullname.substring(2,4));
        int[] marks = new int[3];
        marks[0]= 97;
        marks[1]=98;
        marks[2]=95;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println("hello");

        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        int[] smarks ={97,98,95,99,91};
        System.out.println(smarks[4]);
        int[][] finalmarks = {{97,98,99}, {95,95,98}};
        System.out.print("marks");
        System.out.println( finalmarks[0][0]);
        System.out.println(finalmarks [1][1]);
        //casting
        double price=100;
        double fprice=price+18;
        System.out.println(fprice);

        int p =100;
        int fp = p+(int)18.0;
        System.out.println(fp);
        final float PI = 3.14F ;


    }
}


