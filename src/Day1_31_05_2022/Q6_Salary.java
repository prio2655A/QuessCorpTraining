package Day1_31_05_2022;/*
Q6. Write a Java program for bonus calculation. Accept basic salary from user.
    Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary.
    If basic >= 20,000 then give 10% bonus otherwise give 20% bonus on basic salary.
    Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)
 */

import java.util.Scanner;

public class Q6_Salary {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        float basicSalary=scan.nextFloat();

        double ta=basicSalary*0.1, da=basicSalary*0.15, hra=basicSalary*0.2, pf=basicSalary*0.12, bonus;
        if(basicSalary>=20000)
            bonus=basicSalary*0.1;
        else
            bonus=basicSalary*0.2;
        System.out.println("TA = " +ta);
        System.out.println("DA = " +da);
        System.out.println("HRA = " +hra);
        System.out.println("PF = " +pf);
        System.out.println("Bonus = " +bonus);
        System.out.println("Gross Salary = " +(basicSalary + da + ta + hra + bonus - pf));

    }
}
