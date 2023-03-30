package shapes;

public class Circle {
     double radius;

     public void calculateArea(){
         double area = radius * radius * Math.PI;
         System.out.println("This area of the circle is:" + area);
     }
}
