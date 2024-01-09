//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 1");

        //PRIMA PARTE
        System.out.println(moltiplica(5,4));

        //SECONDA PARTE
      System.out.println(concatena("Epicode", 8));
    }


//PRIMA PARTE
    public static int moltiplica(int a, int b){
        return a*b;

    }

    //SECONDA PARTE
    public static String concatena(String c, int d){

        return c+d;
    }
}