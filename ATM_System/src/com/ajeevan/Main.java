package com.ajeevan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperation operation = new AtmImplementation();

        int atmNumber = 12345;
        int atmPin = 123;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ATM Machine");

        System.out.print("Enter Atm Number : ");
        int atmNo = sc.nextInt();

        System.out.print("Enter Atm Pin Number : ");
        int pin = sc.nextInt();

        if((atmNumber == atmNo) && (atmPin ==pin)){
            System.out.println("Successful validation");

            while (true){
                System.out.println("\n1.View available balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View statement\n5.Exit");
                System.out.println("\nEnter your Choice : ");

                int ch = sc.nextInt();
                if(ch == 1){
                    operation.viewBalance();

                } else if (ch==2) {
                    System.out.println("Enter amount to withdraw : ");
                    double withdrawAmt = sc.nextDouble();
                    operation.withdrawAmount(withdrawAmt);
                    
                } else if (ch==3) {
                    System.out.println("Enter Desired amount to Deposit! ");
                    double depAmt = sc.nextDouble();
                    operation.depositAmount(depAmt);
                    
                } else if (ch==4) {
                    operation.viewStatement();
                    
                } else if (ch==5) {
                    System.out.println("Please collect your ATM card\nThank you for using ATM Machine");
                    System.exit(0);
                }
            }
        }
        else {
            System.out.println("invalid Number/Pin");
            System.exit(0);
        }
    }
}