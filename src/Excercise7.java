public class Excercise7 {
    public static void main(String[] args) {
        int cnt=0;
        int num=2;
        while(cnt<100){
            if(isPrime(num)&&isPalindrome(String.valueOf(num))){
                System.out.print(num+" ");
                cnt++;
                if(cnt%10==0){
                    System.out.println();
                }
            }
            num++;

            
        }
    }
    static public boolean isPrime(int n){
        if(n < 2) return false;
        
        for(int i = 2; i < n; ++i)
        
        if(n%i == 0) return false;
        
        return true;
    }
    static public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            //两个指针不能碰撞                 
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}
