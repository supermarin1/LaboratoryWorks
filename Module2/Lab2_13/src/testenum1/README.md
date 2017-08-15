Task description  
  
  2-13-1  
  Add package “com.brainacad.oop.testenum1”.  
1)	Create a class Main with a main().  
2)	Create a enum type MyDayOfWeek which specify a days-of-the-week (SUNDAY, MONDAY, …).  
3)	Add to method main() code that iterate over MyDayOfWeek enum possible values in loop and print each value name to console. 
4)	Execute the program.  
Example of program output: 
SUNDAY  
MONDAY  
TUESDAY  
WEDNESDAY  
THURSDAY  
FRIDAY  
SATURDAY  
  
  2-13-2  
  Open project called  TestEnum1 (form 2-13-1 lab).  
Add to method main() code that iterate over MyDayOfWeek enum possible values in loop and using switch statement print to console days of the week only when you have classes in Java Programming. 
Execute the program.  
    Example of program output:  
    My Java day: TUESDAY   
    My Java day: THURSDAY  
    My Java day: SATURDAY  
    
  2-13-3  
  Open project called  TestEnum1 (form 2-13-2 lab).  
  Rewrite MyDayOfWeek enum, add method nextDay() which return the next day of week on for given enum value.  
  For example: MyDayOfWeek.FRIDAY.nextDay() must return MyDayOfWeek.SATURDAY.  
  Add to method main() code that read string value from console (using System.in and Scanner), 
  then you must parse string value to particular enum value (using valueOf() method) 
  and then print the name of next day of week to console.  
  Execute the program.  
  Example of program output:  
  FRIDAY  
  The next day of week: SATURDAY  
