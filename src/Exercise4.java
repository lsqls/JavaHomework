import java.util.Scanner;

public class Exercise4 {

    public static boolean isValid(String number){
        if(!checkInput(number))
            return false;
        // System.out.println(sumOfDoubleEvenPlace(number)+" "+sumOfOddPlace(number));
        return (sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10==0;
    }
    public static boolean checkInput(String input){
        int size=getSize(input);
        if(size<13||size>16)
            return false;
        for(int i=0;i<input.length();i++)
            if(input.charAt(i)<'0'||input.charAt(i)>'9')
                return false;
        String[] validKinds=new String[]{"4","5","37","6"};
        boolean validKind=false;
        for(String kind:validKinds){
            if(prefixMatched(input, kind))
                validKind=true;
        }
        if(!validKind)
            return false;
        return true;
    }
    public static int sumOfDoubleEvenPlace(String number){
        int sum=0;
        for(int i=0;i<number.length();i+=2){
            sum+=getDigit((number.charAt(i)-'0')*2);
        }
        return sum;
    }
    public static int getDigit(int num){
        return num/10+num%10;
    }
    public static int sumOfOddPlace(String number){
        int sum=0;
        for(int i=1;i<number.length();i+=2){
            sum+=number.charAt(i)-'0';
        }
        return sum;
    }
    public static boolean prefixMatched(String number,String d){
        return getPrefix(number, getSize(d)).equals(d);
    }
    public static int getSize(String d){
        return d.length();
    }
    public static String getPrefix(String number,int k){
        return number.substring(0,k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a credit number as a long integer");
        String number=sc.next();
        sc.close();
        boolean isValid=isValid(number);
        System.out.println(number+" is "+(isValid?"valid":"invalid"));
    }
}
