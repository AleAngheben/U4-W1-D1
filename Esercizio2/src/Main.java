import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita una stringa");
        String stringa1=scanner.nextLine();

        System.out.println("Digita una stringa");
        String stringa2=scanner.nextLine();

        System.out.println("Digita una stringa");
        String stringa3=scanner.nextLine();


        System.out.println(concatena(stringa1, stringa2, stringa3));
        System.out.println(concatena(stringa3, stringa2, stringa1));
    }

    public static String concatena (String a, String b, String c){

        return a + " " + b + " " + c;
    }



}