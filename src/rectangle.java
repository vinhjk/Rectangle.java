import java.util.Scanner;

public class rectangle {
    double width, height;

    public rectangle(){

    }
    public rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }
    public String display(){
        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width :");
        double width = scanner.nextDouble();
        System.out.print("Enter height :");
        double height = scanner.nextDouble();
        rectangle rectangle = new rectangle(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of rectangle : " + rectangle.getPerimeter());
        System.out.println("Area of rectangle : " + rectangle.getArea());
    }
}
