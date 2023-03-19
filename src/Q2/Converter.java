package Q2;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        getrupee();
        convert();
    }

    public static float rupees;
    static Scanner inputObj = new Scanner(System.in);
    public static void getrupee(){
        System.out.print("Enter the rupees: ");
        rupees = inputObj.nextFloat();
    }
    public static void convert(){
        System.out.println("Rs. " + rupees + " is equal to " + "$" + (rupees*135.03));
    }
}
