import com.sun.org.apache.xpath.internal.SourceTree;

/**
 *
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void fullName (String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
        System.out.println("The full name: " + firstName + " " + lastName);
    }

    public void nameAndAge (String firstName, String lastName, int age){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        System.out.println(firstName + " " + lastName + " is " + age + " years old");
    }

    public void nameAgeGender (String firstName, int age, String gender){
        setFirstName(firstName);
        setAge(age);
        setGender(gender);
        System.out.println(firstName + ", " + age + " years old. Gender: " + gender);
    }

    public void fullNamePhone (String firstName, String lastName, int phoneNumber){
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        System.out.println(firstName + " " +lastName + ". Phone number: " + phoneNumber);
    }

    public void allInfo (String gender, String firstName, String lastName, int age, int phoneNumber){
        setGender(gender);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPhoneNumber(phoneNumber);
        System.out.println(gender + ": " + firstName + " " +lastName + ". " +
                age +" years old. Phone number: " + phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
