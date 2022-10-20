import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        motto();
        pretTotal();
    }

    public static int nrMinuteInchiriere() {
        System.out.println("Introduceti cate minute doriti sa inchiriati echipamentul:");
        Scanner sc = new Scanner(System.in);
        int minute = sc.nextInt();
        return minute;
    }

    public static void motto() {
        JOptionPane.showMessageDialog(null, "Sammy’s makes it fun in the sun");
    }

    public static void pretTotal() {
        int minute = nrMinuteInchiriere();
        int ore=minute/60;
        System.out.println("Echipamentul va fi inchiriat pentru "+minute+" minute");
        System.out.println("Numarul minutelor suplimentare este de:"+(40*ore));
        System.out.println("Numarul orelor de inchiriere este de:"+ore+" ore" +" \nPretul total de inchiriere cu minutele extra este de:"+(40*ore+1*minute));


    }
}