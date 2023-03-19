package Q1;

import java.util.Scanner;


public class Multiplication {
    public static void main(String[] args){
        getMultiplicationMessage();
        getInput();
        getmultiplicationtable();
    }
    public static int number;

    static Scanner inputObj = new Scanner(System.in);
    public static void getMultiplicationMessage(){
        System.out.println("Multiplication Table: ");
        System.out.println();
    }
    public static void getInput(){
        System.out.print("Enter a number: ");
        number = inputObj.nextInt();
    }
    public static void getmultiplicationtable(){
        for(int i = 1;i<=10;i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}
