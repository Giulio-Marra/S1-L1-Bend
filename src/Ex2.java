import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci 3 stringhe diverse");

        System.out.println("inserisci la prima stringa");
        String str1 = scanner.nextLine();

        System.out.println("inserisci la seconda stringa");
        String str2 = scanner.nextLine();

        System.out.println("inserisci la terza stringa");
        String str3 = scanner.nextLine();

        System.out.println(str1 + str2 + str3);
        System.out.println(str3 + str2 + str1);

    }
}
