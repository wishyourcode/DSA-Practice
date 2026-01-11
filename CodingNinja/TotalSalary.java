import java.util.*;

/*
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), depending upon which the total salary is calculated as:
    Total_salary = Basic + HRA + DA + Allow – PF
where :
HRA   = 20% of basic
DA    = 50% of basic
Allow = 1700 if grade = ‘A’
Allow = 1500 if grade = ‘B’
Allow = 1300 if grade = ‘C' or any other character
PF    = 11% of basic.
Round off the total salary and then print the integral part only. */
public class TotalSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        char grade = input.next().charAt(0);
        grade = Character.toUpperCase(grade);

        double HRA = salary * 0.2;
        double DA = salary * 0.5;

        int allow;
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double PF = salary * 0.11;

        int total_salary = Math.round((float) (salary + HRA + DA + allow - PF));
        System.out.print(total_salary);

        input.close();
    }
}