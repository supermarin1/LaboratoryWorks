Task description  
  
  2-11-4  
  Open project MyShapes (from 2.10 labs).  
  Create InvalidShapeStringException class  that is subclass of Exception.  
  Rewrite the parseShape(String) method in class Shape to throw  
  InvalidShapeStringException if string passed as method argument is not valid. 
  Example of valid string: “Rectangle:RED:10,20”; 
  Example of invalid strings:  
      “RectangRED12”;  
      “sdzgdzhgd”;  
  Add code to main() method in class Main, which creates one Rectangle, one Triangle and one Circle using Shape.parseShape(String) method and handles (using try-catch) exceptions if it occurs (display parsing error message on console). 
  Execute program.  
  Add code (in this loop) to read string from console, create new particular shape object 
  (using Shape.parseShape() method) using retrieved string from console and handles exceptions if it occurs.  
