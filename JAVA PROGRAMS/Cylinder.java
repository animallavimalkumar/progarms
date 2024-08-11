class Circle
{
    int radius =18;
    float pi=3.140f;
    int height=5;
 public void Area(){
    double area=pi*radius*radius;
    System.out.println("Area of the Circle:"+area);
 }
}
 class Cylinder extends Circle{
    public void volume(){
        double volume=pi*height;
        System.out.println("Volume of the Cylinder:"+volume);
       }
 

 public static void main(String[] args){
    Cylinder c=new Cylinder();
   c.volume();
    c.Area();
}
 }

