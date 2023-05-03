import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo;
        double boy;
        double index;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu girin :");
        kilo= scanner.nextDouble();

        System.out.println("Lutfen boyunuzu girin :");
        boy=scanner.nextDouble();

        index=kilo/(boy*boy);
        System.out.println("Index :" + index);

    }
}