package testnested1;


import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */
public class MyPhone {

    MyPhoneBook phoneBook;

    public MyPhone() {
        this.phoneBook = new MyPhoneBook();
    }

    public void SwitchOn() {
        System.out.print("Loading phone book records... ");
        phoneBook.addPhoneNumber("Nastya", "380939347896");
        phoneBook.addPhoneNumber("Amanda", "380939347455");
        phoneBook.addPhoneNumber("Bill", "380939666896");
        phoneBook.addPhoneNumber("Jon", "380939340000");
        phoneBook.addPhoneNumber("Teon", "380939388896");
        phoneBook.addPhoneNumber("Yurii", "380939347897");
        phoneBook.addPhoneNumber("Oleg", "380939347457");
        phoneBook.addPhoneNumber("Natalia", "380939666897");
        phoneBook.addPhoneNumber("Mom", "380939340007");
        phoneBook.addPhoneNumber("Stan", "380939388897");
        System.out.println("OK!");
    }

    public void call(int num) {
        System.out.println("Calling to " + phoneBook.phoneNumbers[num].toString());
    }


    static class MyPhoneBook {

        private PhoneNumber[] phoneNumbers;

        public MyPhoneBook() {
            phoneNumbers = new PhoneNumber[10];
        }

        void addPhoneNumber(String name, String phone) {
            for (int i = 0; i < phoneNumbers.length; i++) {
                if (phoneNumbers[i] == null) {
                    phoneNumbers[i] = new PhoneNumber();
                    phoneNumbers[i].setName(name);
                    phoneNumbers[i].setPhone(phone);
                    break;
                }
            }
        }

        void printPhoneBook() {
            for (PhoneNumber phoneNumber : phoneNumbers) {
                if (phoneNumber != null)
                    System.out.println(phoneNumber.toString());
            }
        }

        class PhoneNumber {
            private String name;
            private String phone;

            @Override
            public String toString() {
                return (getName() + ", phone: " + getPhone());
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }
        }

        // lab 2_14_2

        public PhoneNumber[] sortByName() {
            Comparator comp = new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    if (o1.getName().compareTo(o2.getName()) > 0) {
                        return 1;
                    } else if (o1.getName().compareTo(o2.getName()) == 0) {
                        return 0;
                    } else return -1;
                }
            };
            Arrays.sort(phoneNumbers, comp);
            return phoneNumbers;
        }

        public PhoneNumber[] sortByPhoneNumber() {
            Comparator comp = new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    if (o1.getPhone().compareTo(o2.getPhone()) > 0) {
                        return 1;
                    } else if (o1.getPhone().compareTo(o2.getPhone()) == 0) {
                        return 0;
                    } else return -1;
                }
            };
            Arrays.sort(phoneNumbers, comp);
            return phoneNumbers;
        }

    }

    class PhoneBattery {
    }

    class PhoneCharger {
    }

    class PhoneDisplay {
    }

    class PhoneSpeaker {
    }

    class Camera {
    }

    class Bluetooth {
    }

    class PowerOnButton {
    }

}
