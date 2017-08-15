Task description  
  
  2-8-1  
  Open project MyShapes (from 2.7 labs). 
  Rewrite the class Shape to make it abstract and change calcArea() method declaration to make it abstract too.  
    
  2-8-2  
  1)	Add to project  MyShapes a new  interface called Drawable, with abstract method draw().  
  The draw() method has no arguments and does not return a value.  
  2)	Implement  interface Drawable to class Shape.  
  The classes that implements the Drawable interface will provide actual implementation to these abstract method witch print 
  characteristics of each shape on console (print to console information about this object from toString() and area of 
  this shape (using calcArea() method).  
  3)	Add code to main() method in class Main to iterate over shapes array in loop (use foreach loop) and invoke draw() method. 
  Execute the program, output must looks like:  
               This is Rectangle, color: RED, width=11, height=22,  area is: 242  
               This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825  
               This is Circle, color: GREEN, radius=10, area is: 314.15926  
    
  2-8-3  
  You must implement the Comparable interface to each of shape types (Rectangle, Circle, Triangle). 
  Implement the compareTo() method for each of shape types class so that it compares the areas of the shapes. 
  Create two different Rectangle instances and compare it to each other. Print result to console.  
    
  2-8-4  
  Add code to main() method in class Main to create array 
  (Rectangle[] arr2) of six Rectangle objects and sort it using Arrays.sort() method. 
  Add code to main() method in class Main to iterate over Rectangles array in loop (use for-each loop) and invoke draw() method. 
  Execute the program, output must looks like:  
    This is Rectangle, color: RED, width=10, height=10,  area is: 100  
    This is Rectangle, color: RED, width=11, height=22,  area is: 242  
    This is Rectangle, color: RED, width=100, height=5,  area is: 500  
    
  2-8-5
  You must implement the Comparator interface to each of shape types (Rectangle, Circle, Triangle). 
  Implement the compare(…) method for each of shape types class so that it compares the color of the shapes.  
  Create an array of different shapes (size 10) and sorted in lexicographical order by color name. Print result to console.  
