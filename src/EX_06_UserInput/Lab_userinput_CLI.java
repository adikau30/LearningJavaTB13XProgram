package EX_06_UserInput;

public class Lab_userinput_CLI {
    public static void main(String[] args) {
        String ageofperson = args[0];
        System.out.println(ageofperson);
        int age = Integer.parseInt(ageofperson);
        String canivote = age>=18 ? "yes":"no";
        System.out.println(canivote);
    }
}
