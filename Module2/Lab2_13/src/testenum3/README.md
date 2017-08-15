Task description  
  
  2-13-5  
  Create new project called  TestEnum3. Add package “com.brainacad.oop.testenum3”.  
Create a class TrainSchedule which contains inner class Train.  
1)	Add to class Train six fields: number (of int type), stationDispatch (of String type), stationArrival (of String type), 
timeDispatch (оf String type), timeArrival (of String type) and days (array of enum type DayOfWeek, containing a list of days of the week),
constructor with one parameter (number train) and getters/setter for each class field.  
Override the toString() method in Train to return all information about train.  
2)	Add to class TrainSchedule private field trains as array of Train and constructor with one parameter to allocate memory to the schedule.   
3)	Add to class TrainSchedule public method addTrain() without parameters, which read from console (using System.in and Scanner) all information on train, then to create new Train object and pass it to next available array element.   
4)	Add to class TrainSchedule  public method printTrains() which iterates over trains array in loop and print all information of each train to console.  
5)	Add to class TrainSchedule  public method searchTrain(...) with  three parameters, of String type (stationDispatch, stationArrival ) and of DayOfWeek enum type, which searches and print all trains that go to the destination after a specified day of the week.   
6)	Create a class Main with a main() method. Add to method main() code that creates TrainSchedule  object and fill fills it the several trains. Add code to invoke printTrains() method, then code to invoke searchTrain() method.  
