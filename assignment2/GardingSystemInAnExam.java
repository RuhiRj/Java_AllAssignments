package assignment2;

import javax.swing.*;

public class GardingSystemInAnExam {
    public static void main(String[] args) {
        int marks = 60;

        if (marks >= 90) {
            System.out.println("A grade");
        } else if (marks >= 80) {
            System.out.println("B grade");
        } else if (marks >= 70) {
            System.out.println("C grade");
        } else if (marks >= 60) {
            System.out.println("D grade");
        } else if (marks >= 50) {
            System.out.println("E grade");
        } else {
            System.out.println("F grade");
        }
    }
}
