Task description:  
  
  2-5-1  
  Create class MyInitTest with two initialization blocks, two static initialization blocks and two constructors (one constructor() must invoke second constructor(int)).  
  On each block write code that prints on console type of block and block number.  For example:  
  “static initialization block 1”  
  “static initialization block 2”  
  “non-static initialization block 1”  
  “non-static initialization block 2”  
  “constructor 1”  
  “constructor 2”  
  Create class Main, which will create instance of class MyInitTest by invoking first constructor.  
  
  2-5-2
  Create class MyInit with field arr of array of integers and non-static initialization block which will initialize that array with random values (Size of array is 10). 
  To generate random numbers you can use next code:   arr[i]= (int) (100 * Math.random()).  
  (Or using Random class instance and nextInt() method invocation).  
  Add to class MyInit and method printArray() which will print values of this array.  
  Create class Main, which will create two instances of class MyInit and invoke method printArray() 
  to print values of their arrays on console.  
  Example of output:  
  23,43,11,34,78,59,34,61,24,2  
  5,48,50,3,1,4,67,62,78,98  
  
  2-5-5
  Write class InitTest with private field id of int type and static private field nextId of integer. Write code that:  
    -	Initialize static field nextId of some random value (in 1 … 1000 range) once when class loaded to JVM;  
    -	Increments  static field nextId each time when new instance of InitTest created;  
    -	Initialize field id of nextId field value each time when new instance of InitTest created.  
  And method getId() which will return value of id.  
  Create class Main, which will create five instances of class InitTest 
  and invokes method getId() on each instance and print returned value on console.  
