package Q3;

import java.util.Scanner;

public class fibonacci {
    public static void  main(String[] args){
        getNumber();
        getFibonacci();
    }

    public static int a = 0;
    public static int b = 1;
    public static int number;
    public static int sum;
    static Scanner inputObj = new Scanner(System.in);

    public static void getNumber(){
        System.out.print("Enter a number: ");
        number = inputObj.nextInt();
    }
    public static void getFibonacci(){
        System.out.print(a + ", " + b);
        sum = a+b;
        for(int i =0;i<number-2;i++){
            System.out.print( ", " + sum);
            a=b;
            b=sum;
            sum = a+b;
        }
    }

}
