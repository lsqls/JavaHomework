public class Circle2D {
    double x;
    double y;
    double radius;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public  double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2D() {
        x=y=0;
        radius=1;
    }
    public boolean contains(double x,double y){
        double dis=(x-this.x)*(x-this.x)+(y-this.y)*(y-this.y);
        return dis<radius*radius;
    }
    public boolean contains(Circle2D circle){
        double dis=Math.sqrt((circle.x-x)*(circle.x-x)+(circle.y-y)*(circle.y-y))+circle.radius;
        return dis<radius;
    }
    public boolean overlaps(Circle2D circle){
        double dis=Math.sqrt((circle.x-x)*(circle.x-x)+(circle.y-y)*(circle.y-y));
        return dis<(circle.radius+radius)&&!circle.contains(this)&&!this.contains(circle);
    }

    public static void main(String[] args) {
        Circle2D c1=new Circle2D(2,2,5.5);
        System.out.println(c1.getArea()+" "+c1.getPerimeter()
        +" "+c1.contains(3,3)+" "+c1.contains(new Circle2D(4,5,10.5))+" "+
        c1.overlaps(new Circle2D(3,5,2.3)));


    }

}
