public class Ex1 {
    public static void main(String[] args) {

        System.out.println("la concatenazione è " + concatena("ciao ", 2));
        System.out.println("la somma è " + moltiplicazione(2,4));

    }
    public static int moltiplicazione(int num1, int num2) {
        return num1 * num2;
    }
    public static String concatena(String str, int num3) {
        return str + num3;
    }

}

