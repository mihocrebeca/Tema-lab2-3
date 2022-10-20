import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Deviza este: „Sammy’s makes it fun in the sun”");
        System.out.println("Introduceti cate minute doriti sa inchiriati un echipament sportiv:");
        int minute= Integer.parseInt(scanner.next());
        int ore=minute/60;
        System.out.println("Numarul minutelor de inchiriere este de:"+minute);
        System.out.println("Numarul orelor de inchiriere este de:"+ore);
        double pretTotal=40*ore+1*minute;
        System.out.println("Pretul total este :"+pretTotal);
    }
}