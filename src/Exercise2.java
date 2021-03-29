
import java.util.Scanner;

/**
 * java语言程序设计基础篇3.9
 */
public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        Scanner input = new Scanner(System.in);

        String  num = input.next();

        input.close();
        
        int check=0;
        for(int i=0;i<num.length();i++){
            check+=(num.charAt(i)-'0')*(i+1);
        }
        check%=11;        
        System.out.println("The ISBN-10 number is "+num+(check==10?"X":check));
            
    }
}
