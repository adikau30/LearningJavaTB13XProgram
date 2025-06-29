package Ex_14_Strings;

public class Lab07_String_Functions {
    public static void main(String[] args) {

        String name= "aditya"; //char- 0,1,2,3...
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));

        System.out.println(name.concat(" "+ "kaushik"));

        // contains
        System.out.println(name.contains("sh"));
        System.out.println(name.contains("hh"));

        //equals
        System.out.println(name.equals("aditya"));
        //ignorecase
        System.out.println(name.equalsIgnoreCase("ADITYA"));

        //indesOf

        System.out.println(name.indexOf("0"));
        System.out.println(name.indexOf("a"));// return with first a of aditya
        System.out.println(name.lastIndexOf("a"));// last se

        // length
        System.out.println(name.length());

        //replace
        System.out.println(name.replace('i','I'));

        //split
        String name1="Aditya@kaushik@30";
        String[] Split_name= name1.split("@");
        System.out.println(Split_name[0]);
        System.out.println(Split_name[1]);
        System.out.println(Split_name[2]);


        System.out.println(name.toUpperCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("a"));

        //substring
        System.out.println(name.substring(1,5)); //starts with 0 ends with -1 (5-1=4) -> dity

    }
}
