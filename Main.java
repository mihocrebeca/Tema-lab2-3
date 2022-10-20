import javax.swing.*;
import java.util.Scanner;
public class Main {
    static int nrPersoane(){
        System.out.println("Introduceti numarul de persoane care participa la eveniment:");
        Scanner scanner=new Scanner(System.in);
        int persoane= Integer.parseInt(scanner.next());
        return persoane;
    }
    public static void motto() {
        JOptionPane.showMessageDialog(null, "„Carly’s makes the food that makes it a party.”.");
    }
    public static void pretEv(){
        int persoane=nrPersoane();
        int pretOaspete=35;
        int pretTotal= 35*persoane;
        System.out.println("Pretul evenimentului este de:"+pretTotal +"dolari");
    }
    public static void main(String[] args) {

        int invitati=nrPersoane();
        System.out.println("Numarul total de invitati este de :"+invitati);
        motto();



    }
}