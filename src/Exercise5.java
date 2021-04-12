import java.util.HashMap;
import java.util.Scanner;


public class Exercise5 {
    
    static HashMap<Character,String> codeBook=new HashMap<>();
    
    static void generateCodeBook(){
        codeBook.put(' ', "00");
        for(char i='0';i<='9';i++){
            codeBook.put(i, String.valueOf(i));
        }
        for(char i='a';i<='o';i++){
            int num=(i-'a')/3+2;
            int cnt=(i-'a')%3+2;
            
            codeBook.put(i, generateCode(num, cnt));
        }
        char[] startandEnd=new char[]{'p','s','t','v','w','z'};
        for(int i=0,j=7;i<startandEnd.length;i+=2,j++){
            char start=startandEnd[i],end=startandEnd[i+1];
            for(char k=start;k<=end;k++){
                codeBook.put(k, generateCode(j, k-start+2));
            }
        }
    }
    static String generateCode(int num,int cnt){
        String numString=String.valueOf(num);
        StringBuffer sBuffer=new StringBuffer();
        for(int i=0;i<cnt;i++){
            sBuffer.append(numString);
        }
        return sBuffer.toString();
    }
    
    public static void main(String[] args) {
        
        generateCodeBook();
        System.out.println(codeBook.toString());


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.nextLine();
        sc.close();

        StringBuffer sBuffer=new StringBuffer();
        for(int i=0;i<input.length();i++){
            sBuffer.append(codeBook.get(input.charAt(i)));
        }
        System.out.println(sBuffer.toString());
         
    }
}
