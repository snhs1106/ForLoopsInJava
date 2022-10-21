package app;

public class Controller {

    public static void main(String[] args) {

        yourInfoHeader();

        PrintHeader.printStepHeader(1);
        for (int i = -10; i <= 10; i++) {
            System.out.println("The value of i is: " + i);
        }

        PrintHeader.printStepHeader(2);
        for (int k = 0; k <= 8; k += 2) {

            System.out.println("The value of k is: " + k);
        }

        PrintHeader.printStepHeader(3);
        for (int l = 10; l >= 1; l--) {

            System.out.println("The value of l is: " + l);
        }

        PrintHeader.printStepHeader(4);
        for (int i = 0; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println("The value of i is: " + i + " \t\t even");
            } else {
                System.out.println("The value of i is: " + i + " \t\t odd");
            }
        }

        PrintHeader.printStepHeader(5);
        for (int i = 0; i <= 20; i++) {

            if (i <= 9) {

                if (i % 2 == 0) {
                    System.out.println("The value of i is: " + i + " \t\t even");
                } else {
                    System.out.println("The value of i is: " + i + " \t\t odd");
                }
            } else {
                if (i % 2 == 0) {
                    System.out.println("The value of i is: " + i + " \t even");
                } else {
                    System.out.println("The value of i is: " + i + " \t odd");
                }

            }
        }

        PrintHeader.printStepHeader(6);
        for (int row = 1; row <= 10; row++) {

            for (int col = 1; col <= 15; col++) {
                System.out.print("X\t");
            }
            System.out.println();
        }
        PrintHeader.printStepHeader(7);
        for(int row = 1; row <= 10; row++){

            if(row %2 != 0) {

                for (int col = 1; col <= 10; col++) {

                    if (col % 2 != 0) {
                        System.out.print("X\t");
                    } else {
                        System.out.print("0\t");
                    }
                }
                System.out.println();
            }
            else {

                for (int col = 1; col <= 10; col++) {

                    System.out.print("0 \t");

                }
                System.out.println();
            }
        }

        PrintHeader.printStepHeader(8);
        for(int row = 1; row<= 10; row++){

            for(int col = 1; col <= 10; col++){

                if(row == col){

                    System.out.print("X\t");

                }
                else{

                    System.out.print("0\t");
                }

            }
            System.out.println();

        }

        PrintHeader.printStepHeader(9);
        for(int row = 1; row<= 10; row++){

            for(int col = 1; col <= 10; col++){

                if(row == col || col == 11 - row){

                    System.out.print("X\t");

                }
                else{

                    System.out.print("0\t");
                }

            }
            System.out.println();

        }
        PrintHeader.printStepHeader(10);
        for(int row = 1; row <= 10; row++) {

            for (int col = 1; col <= 10; col++) {

                if (row >= 3 && row < 9) {

                    if (col >= 6) {

                        System.out.print("X\t");
                    }
                    else {

                        System.out.print("0\t");
                    }

                } else {

                    System.out.print("0\t");
                }
            }
            System.out.println();
        }

        PrintHeader.printStepHeader(11);
        for(int row = 1; row <= 10; row++){

            for(int col = 1; col <= 10; col ++){

                if(row %2 != 0 || col %3 == 0){

                    System.out.print("X\t");
                }
                else{

                    System.out.print("0\t");
                }
            }
            System.out.println();
        }

    }
    public static void yourInfoHeader(){

        System.out.println("====================================");
        System.out.println("PROGRAMMER:  " + "STEPHANIE HERNANDEZ");
        System.out.println("PANTHER ID:  " + "6297754");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210 ");
        System.out.println("SECTION: \t " + "U02");
        System.out.println("CLASSTIME: \t " + "6:25 PM TO 9:05 PM");
        System.out.println();
        System.out.println("Assignment: " + " Lab 7");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("===================================");
        System.out.println();

    }
}
