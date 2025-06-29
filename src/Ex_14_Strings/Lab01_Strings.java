package Ex_14_Strings;

public class Lab01_Strings {
    public static void main(String[] args) {
        String name= "Aditya";// string constant pool
        name.toUpperCase();
        System.out.println(name); //case number 1(5 line number will be printed)
        name= name.toUpperCase();
        System.out.println(name); // inmutable in nature
    }
}
