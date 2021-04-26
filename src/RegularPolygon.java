public class RegularPolygon {
    int n=3;
    int size=1;
    double x=0;
    double y=0;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, int size) {
        this.n = n;
        this.size = size;
    }

    public RegularPolygon(int n, int size, double x, double y) {
        this.n = n;
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public int  getPerimeter(){
        return n*size;
    }
    public double getArea(){
        return (double)(n*size*size)/(4*Math.tan(Math.PI/n));
    }

    public static void main(String[] args) {
        RegularPolygon rp1=new RegularPolygon(),
                rp2=new RegularPolygon(6,4),
                rp3=new RegularPolygon(10,4,5.6,7.8);
        System.out.println(rp1.getPerimeter()+" "+rp1.getArea());
        System.out.println(rp2.getPerimeter()+" "+rp2.getArea());
        System.out.println(rp3.getPerimeter()+" "+rp3.getArea());



    }

}
