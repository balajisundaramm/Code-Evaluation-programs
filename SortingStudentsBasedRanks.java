package com.interiewQuestions;

import java.util.*;

/**
 * Created by Balaji on 4/11/17.
 */
public class SortingStudentsBasedRanks {
    public static void main(String[] args) {
        Student s1=new Student("Ramu",23,6);
        Student s2=new Student("Raja",24,3);
        Student s3=new Student("Vijay",21,9);
        Student s4=new Student("Sai Yoshitha",22,1);
        Student s5=new Student("Vikram",32,2);
        Student s6=new Student("Somu",19,7);
        Student s7=new Student("Rani",26,4);
        Student s8=new Student("Pooja",45,10);
        Student s9=new Student("Praveen",28,8);
        Student s10=new Student("Gokul",35,5);

        Student[] s={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        Arrays.sort(s);
        for (Student student:s) {
            System.out.println(student);
        }

    }

}
class Student implements Comparable{
    private String name;
    private int age;
    private int rank;

    public Student(String name, int age, int rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            if (this.name.equals(s.name) &&
                    this.age==(s.age) && this.rank==(s.rank))
                    return true;
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (name+age+rank).hashCode();
    }

    @Override
    public String toString() {
        return ("Student:"+name+","+age+","+rank);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            Student s=(Student)o;
            return this.rank-s.rank;
        }
        return 0;
    }
}
