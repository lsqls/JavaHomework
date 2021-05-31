public class Excersice11 {
    static int getTerms(long n){
        int ops=0;
        while (n!=1){
            if(n%2==0){
                n=n/2;
            }
            else {
                n=3*n+1;
            }
            ops++;
        }
        return ops;

    }
    public static void main(String[] args) {
        int max=0;
        long ret=0;
        for (long i=1;i<1000000;i++){
            int ops=getTerms(i);
            if(max<ops){
                max=ops;
                ret=i;
            }
        }
        System.out.println(ret+":"+max);
    }

}
