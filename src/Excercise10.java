import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excercise10 {


    public static void main(String[] args) {
        try {
            int[] arr=new int[10];
            System.out.println(arr[11]);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            arrayIndexOutOfBoundsException.printStackTrace();
        }

        try {
            int a=1/0;
        }
        catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();

        }
        try {
            int[] arr=null;
            System.out.println(arr[0]);
        }
        catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();

        }
        try {
            Integer.parseInt("288gg32");
        }
        catch (NumberFormatException numberFormatException){
            numberFormatException.printStackTrace();

        }


        try {

            Scanner scanner=new Scanner(System.in);
            System.out.println("输入字符串，抛出InputMismatchException");
            scanner.nextInt();
        }
        catch (InputMismatchException inputMismatchException){
            inputMismatchException.printStackTrace();

        }





    }


}
