package ua.com.owu.startPoint;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SwitchHelper helper = new SwitchHelper();
        int cases;
        Scanner scanner = new Scanner(System.in);
        boolean forWhile = true;
        while (forWhile) {
            System.out.println("Enter 1- to add book \n" +
                    "Enter 2- to remove book \n" +
                    "Enter 3- to edit book \n" +
                    "Enter 4- to show all books \n"+
                    "Enter 5- to exit: ");
            cases = scanner.nextInt();
            switch (cases){
                case 1: helper.add();
                break;
                case 2: helper.remove();
                break;
                case 3: helper.edit();
                break;
                case 4: helper.showAll();
                break;
                case 5: forWhile = false;
                break;
                default :{
                    System.out.print("Wrong input");
                }
            }
        }
        System.out.println("lol");
    }

}
