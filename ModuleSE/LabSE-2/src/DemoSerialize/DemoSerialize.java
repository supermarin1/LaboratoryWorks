package DemoSerialize;

import java.io.*;

/**
 * Created by Maringa on 23.04.2017.
 */
public class DemoSerialize {
    public static void main(String[] args) throws IOException {

        String fileSource = "D:\\IdeaProjects\\BrainAcademy\\ModuleSE\\LabSE-2\\src\\DemoSerialize\\employee.ser";

        // create an employee
        Employee employee1 = new Employee();

        employee1.setName("John McClane");
        employee1.setAdress("New York");
        employee1.setSSN(911);
        employee1.setNumber(756_667_778);

        // write into the file
        FileOutputStream fileOut = new FileOutputStream(fileSource);

        ObjectOutputStream oos = new ObjectOutputStream(fileOut);

        oos.writeObject(employee1);

        //read from the file
        FileInputStream fileIn = new FileInputStream(fileSource);

        ObjectInputStream ois = new ObjectInputStream(fileIn);

        try {
            Employee employee2 = (Employee) ois.readObject();
            System.out.println("Employee: " + employee2.getName() + ", SSN: " + employee2.getSSN());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
