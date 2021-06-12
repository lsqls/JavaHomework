public class Complex implements Cloneable{
    private double a;
    private double b;

    public Complex() {
        this.a=0;
        this.b=0;
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }


    Complex add(Complex y){
        return new Complex(a+y.a,b+y.b);
    }



    Complex subtract(Complex y){
        return new Complex(a-y.a,b-y.b);
    }
    Complex multiply(Complex y){
        double c=y.a,d=y.b;
        return new Complex(a*c-b*d,b*c+a*d);
    }

    Complex divide(Complex y){

        double c=y.a,d=y.b;
        return new Complex((a*c+b*d)/(c*c+d*d),(b*c-a*d)/(c*c+d*d));
    }

    double abs(){

        return Math.sqrt(a*a+b*b);
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    @Override
    public String toString() {

        return ""+ a + (b==0?"":((b>0?"+":"-") + Math.abs(b)+ "i")) ;
    }




    @Override
    protected Complex clone() throws CloneNotSupportedException {
        Complex clone=new Complex(a,b);
        return clone;
    }

    public static void main(String[] args) {
        Complex x=new Complex(3.5,5.5),
                y=new Complex(-3.5,1);

        System.out.println(x.add(y)+"\n"+x.subtract(y)+"\n"+x.multiply(y)+"\n"+x.divide(y)+"\n"+x.abs());


    }
}
