import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  level = input.nextInt();
        input.close();
        // int level=8;
        int width=level*2-1;
        long maxNum=(long) Math.pow(2, level-1);
        int bits=0;
        while(maxNum>0){
            bits++;
            maxNum/=10;
        }
        bits++;
        String format="%"+(bits)+"d";
        
        for(int i=1;i<=level;i++){
            int numCnt=2*i-1;
            int spaceCnt=width-numCnt;
            for(int j=0;j<spaceCnt/2;j++){
                for(int k=0;k<bits;k++)
                    System.out.print(' ');
            }
            for(int k=0;k<numCnt/2+1;k++)
                System.out.printf(format,(long)Math.pow(2, k));
            
            for(int k=numCnt/2-1;k>=0;k--)
                System.out.printf(format,(long)Math.pow(2, k));
                
            
            for(int j=0;j<spaceCnt/2;j++){
                for(int k=0;k<bits;k++)
                    System.out.print(' ');
            }
            System.out.println();      
        }
        
    }
}
