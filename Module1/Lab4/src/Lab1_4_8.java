/**
 * Using Type casting
 */
public class Lab1_4_8 {
    public static void main(String[] args) {

        long myLong = 199_000L;
        byte myLongByte = (byte) myLong;
        int myLongInt = (int) myLong;
        double myLongDouble = (double) myLong;
        System.out.println("Long " + myLong +" to byte will be " + myLongByte);
        System.out.println("Long " + myLong +" to int will be " + myLongInt);
        System.out.println("Long " + myLong +" to double will be " + myLongDouble +"\n");


        int myInt = 120_000_111;
        short myIntShort = (short) myInt;
        float myIntFloat = (float) myInt;
        System.out.println("Int " + myInt +" to short will be " + myIntShort);
        System.out.println("Int " + myInt +" to float will be " + myIntFloat + "\n");

        char myChar = '©';
        short myCharShort = (short) myChar;
        byte myCharByte = (byte) myChar;
        System.out.println("Char " + myChar +" to short will be " + myCharShort);
        System.out.println("Char " + myChar +" to byte will be " + myCharByte);
    }
}
