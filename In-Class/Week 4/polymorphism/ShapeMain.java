
public class ShapeMain {

    public static void polymorphism_ex1(){
        System.out.println("------- example 1 ------" ); 
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Call the getArea() method on the Shape object
        System.out.println("Area of shape: " + shape.getArea()); // Output: "Area of shape: 0.0"

        // Call the getArea() method on the Rectangle object
        System.out.println("Area of rectangle: " + rectangle.getArea()); // Output: "Area of rectangle: 15.0"

        // Call the getArea() method on the Shape object again
        // (but this time, assign it to a variable of type Rectangle)
        Shape anotherRectangle = new Rectangle(8.0, 2.0);

        // since the datatype is Shape, but in reality it's a rectangle, will this print out 16 or 0...?
        System.out.println("Area: " + anotherRectangle.getArea()); 
    }

    // in this example, we have a method that can take any shape as input
    public static void polymorphism_ex2(Shape s){
      System.out.println("------- example 2 ------" ); 
      System.out.println("Area: " + s.getArea()); 
    }

    // by making a superclass for different shape objects, we can collect 
    // different shapes into 1 unified array!
    public static void polymorphism_ex3(){
      System.out.println("------- example 3 ------" ); 

      Shape[] variousShapes = new Shape[5];
      variousShapes[0] = new Rectangle(0.01, 0.05); // tiny rectangle
      variousShapes[1] = new Rectangle(1.0, 1.0); // 1x1 square
      variousShapes[2] = new Rectangle(2.0, 1.0); // 2x1 rectangle
      variousShapes[3] = new Circle(1.0); // unit circle
      variousShapes[4] = new Circle(5.0); // circle with radius 5

      // and because all shapes have a getArea() method, we can call it through a generic Shape
      // crazy! ask questions if it's not clear why this works
      for(Shape s : variousShapes){ // for each shape in the variousShapes array
        System.out.println("Area: " + s.getArea()); 
      }

    }


         


    public static void main(String[] args) {
      polymorphism_ex1();

      Rectangle r = new Rectangle(1.0, 1.0);
      Circle c = new Circle(1.0);
      polymorphism_ex2(r); // works because this method takes any Shape as input, and a Rectangle IS a shape
      polymorphism_ex2(c);

      polymorphism_ex3();

    }
}

