Task description  
    
  2-7-6  
  Create new project named MyShapes. Add package “com.brainacad.oop.testshapes”. 
  You should design a super class Shape, which defines the public method of all the shapes called calcArea(), 
  which returns the area (double type) of that particular shape. 
  (Our program uses many kinds of shapes, such as triangle, rectangle and so on.)  Define a Shape class as:  
  public class Shape {   
   //declare private instance variable shapeColor of String type  
   // create a constructor for Shape with shapeColor parameter  
   // Override  toString() to return the string of Shape name and color, example:  
                  “Shape, color is: RED”   
   // All shapes must has a method called calcArea(), write public method (empty)  calcArea() that returns double value ( 0.0 ) . 
}  
Create class Main with method main().  
The program must demonstrate the creation of one Shape object and print it name and color to console. 
Then add code to invoke calcArea() method and print result to console. Program output must looks like:  
“This is Shape, color is: RED”  
“Shape area is: 0”  
  
2-7-7  
1)	Add to project  MyShapes a new class Circle which is a subclass of Shape.  
Add to class Circle a private field radius (of double type).  
In class Circle override  calcArea() method which must return area of circle  (by the formula:  area  = PI*radius2).  
In class Circle override the toString() method. It must return string which contain name of shape, color and radius of circle. Example:  
“This is Circle, color: GREEN, radius=22”  
Add to class Circle constructor with color and radius arguments.  
2)	Then add to class Main code to create one Circle object and print it name color, and radius to console. Then invoke calcArea() method and print result to console. 
Program output must looks like:  
“This is Circle, color: GREEN, radius=10”  
“Shape area is: 314.15926”  
  
2-7-8
1)	Add to project  MyShapes a new class Rectangle which is a subclass of Shape.  
Add to class Rectangle a private field’s width and height (of double type).  
In class Rectangle override  calcArea() method which must return area of rectangle  (By the formula:  area  = width* height).  
In class Rectangle override the toString() method. It must return string which contain name of shape, color and rectangle width and height. Example:  
“This is Rectangle, color: RED, width=11, height=22”  
Add to class Rectangle constructor with color, width and height arguments.  
2)	Then add to class Main code to create one Rectangle object and print it name, color, width and height to console. Then invoke calcArea() method and print result to console.  
Program output must looks like:  
“This is Rectangle, color: RED, width=11, height=22” “Shape area is: 242”  
  
2-7-9  
1)	Add to project  MyShapes a new class Triangle which is a subclass of Shape.  
Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.  
In class Triangle override  calcArea() method which must return area of triangle   
In class Triangle override the toString() method. 
It must return string which contain name of shape, color and a, b, c sides of triangle. Example:  
“This is Triangle, color: BLACK, a=5, b=5, c=5”  
Add to class Triangle constructor with color, a, b and c arguments.  
2)	Then add to class Main code to create one Triangle object and print it name, color, a, b, c sides of triangle to console. Then invoke calcArea() method and print result to console. 
Program output must looks like:  
“This is Triangle, color: BLACK, a=5, b=5, c=5”  
“Shape area is: 10.825”  
  
2-7-10  
Use MyShapes project. The program must demonstrate the creation of an array of different types of shapes and print characteristics of each shape on console.  
1.	Add new code to method main() in class Main:  
2.	Create array (Shape[] arr) of different Shape objects, (five  rectangles, two circles and two triangles);  
3.	Add code to iterate over shapes array in loop (use for-each loop) and print characteristics of each shape on console (using toString() method) with area of this shape (using calcArea() method).  
4.	Execute the program, output must looks like:  
               This is Rectangle, color: RED, width=11, height=22,  area is: 242  
               This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825  
               This is Circle, color: GREEN, radius=10, area is: 314.15926  
               … 
5.	Add code to calculate total area of all shape types. 
Define sumArea (of double type) local variable and use it in loop to sum total area for all shapes.  
6.	Add code to sum total area for each shape types. 
Define sumRectArea, sumTriangleArea, sumCircleArea (of double type) local variables and use it in loop to sum total area 
for each shape type. You should use instanceof keyword for determining, 
total area for each of shape types (Rectangle, Circle, Triangle) and print it to console.  
7.	Execute the program, output must looks like:  
Rectangles total area: 234.54  
Circle total area: 547.231  
Triangle total area: 356.56  
