import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("„Carly’s makes the food that makes it a party.”.");
        System.out.println("Introduceti numarul de persoane care participa la eveniment:");
        int persoane= Integer.parseInt(scanner.next());
        int oaspete=35;
        System.out.println("Numarul de invitati este de:"+persoane);
        System.out.println("Pretul per oaspete este:"+oaspete);
        System.out.println("Pretul total este:"+(persoane*35));

    }
}