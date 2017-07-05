package DemoSerialize;

import java.io.Serializable;

/**
 * Created by Maringa on 23.04.2017.
 */
public class Employee implements Serializable {
    private String name;
    private String adress;
    private transient int SSN;
    private int number;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
