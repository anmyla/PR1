package Basics;

import java.sql.SQLOutput;

public class GradingTable {
    public static void main(String[] args) {

        findGrade(100);
        findGrade(51);
        findGrade(49);
        findGrade(78);
        findGrade(65);
        findGrade(64);
        findGrade(89);
    }
    public static void findGrade(int grade){
        if (grade >= 90) {
            System.out.println("Outstanding");
        } else if (grade >= 78 && grade < 90) {
            System.out.println("Excellent");
        } else if (grade >= 65 && grade < 78) {
            System.out.println("Acceptable");
        } else if (grade >= 51 && grade <65) {
            System.out.println("Passing");
        }else {
            System.out.println("Fail");
        }
    }
}