Task description  
  
  2-12-1  
Create new project called  TestNested1. Add package “com.brainacad.oop.testnest1”.  
Create a class MyPhoneBook which contains static nested class PhoneNumber.  
1)	Add to class PhoneNumber two fields: name (of String type) and phone (оf String type), constructor with two parameters (name, phone)
and getters for each class field. Override the toString() method in PhoneNumber to return information about name and phone number.  
2)	Add to class MyPhoneBook private field phoneNumbers as array of PhoneNumber (array length of 10).  
3)	Add to class MyPhoneBook public method addPhoneNumber()  with  two parameters, of String type (name, phone) 
which use it to create new PhoneNumber object and pass it to next available array element.  
4)	Add to class MyPhoneBook public method printPhoneBook() which iterates over phoneNumbers 
array in loop and print name and phone number information of each record to console.  
5)	Create a class Main with a main() method. Add to method main() code that creates MyPhoneBook object 
and fill it with five phone number records. Add code to invoke printPhoneBook() method.  
6)	Execute the program.  
Example of program output:  
Name: Sasha, phone: 050123456  
Name: Vova, phone: 067987654  
  
  2-12-2  
Open project TestNested1 from 2-12-1 lab.  
1)	Add to class MyPhoneBook two public methods sortByName() and sortByPhoneNumber().  
Provide code in sortByName() method to sort PhoneNumbers array by name (using Comparator interface and anonymous class).  
Provide code in sortByPhoneNumber () method to sort PhoneNumbers array by phone (using Comparator interface and anonymous class).  
2)	Add to method main() code that creates MyPhoneBook object and fill it with ten phone number records.  
3)	Add code to sort phone numbers in phone book by invoking sortByName()  and then invoke printPhoneBook() method.  
Execute the program.  
Example of program output:  
Name: Anna, phone: 0501237777  
Name: Boris, phone: 0679878888  
  
  2-12-3  
  Open project TestNested1 from 2-12-2 lab.  
1)	Create new class MyPhone.  
Rewrite class MyPhoneBook to make it as inner class (non-static) of  MyPhone class  (move class MyPhoneBook code inside MyPhone class). 
Add to class MyPhone constructor with no arguments to initialize the field phonebook.  
Add to class MyPhone public method swichOn(), which print message “Loading PhoneBook records…” and create MyPhoneBook object and add to it ten phone number records. Then print to console “OK!”;  
Add to class MyPhone method call(int), which prints to console message “Calling to”  and full information from MyPhoneBook element (by index of array).   
2)	Add to method main() code that creates MyPhone object, invoke swichOn() method  and then invoke call() method with argument of value 1  3) Execute the program.  
Example of program output:  
Loading PhoneBook records… OK!   
Calling to: Name: Boris, phone: 0679878888  
  
  2-12-4  
Open project TestNested1 from 2-12-3 lab.  
Add to project next classes: class Camera; class Bluetooth; class MemoryCard; class SimCard; class PowerOnButton; class HeadPhones; class PhoneBattery; class PhoneCharger; class PhoneDisplay; class PhoneSpeaker;  
Analyze and decide how to create each of these classes, like top-level class, like static nested class or like inner class of MyPhone class. 


  
  
