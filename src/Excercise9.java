import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excercise9 {
    private static int[][] matrix;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(new File("C:\\Users\\Master\\OneDrive\\桌面\\solution\\java课\\src\\11.txt"));
        matrix=new int[20][20];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                matrix[i][j]=scanner.nextInt();
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                try {
                    max = Math.max(cal(i, j), max);
                }
                catch(Exception exception){
                    continue;
                }
            }
        }
        System.out.println(max);
    }

    static int cal(int startx,int starty) {
        int ret=Integer.MIN_VALUE;
        int[][] dirs=new int[][]{{0,1},{1,0},{1,1},{1,-1}};
        for(int[] dir:dirs){
            int temp=1;
            for(int i=0,j=0;i<4&j<4;i++,j++){
                temp*=matrix[startx+i*dir[0]][starty+j*dir[1]];
            }
            ret=Math.max(ret,temp);
        }
        return ret;
    }
}
