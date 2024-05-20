public class Ex3 {
    public static void main(String[] args){
        System.out.println("il perimetro di questo rettangolo è " + perimetroRettangolo(2.5, 7.8));
        System.out.println("il numero del pari o dispari è " + pariDispari(8));
        System.out.println("l'area del triangono è " + perimetroTriangolo(8.2,10.2,9.3));

    }

    public static double perimetroRettangolo (double latx, double laty){
        return 2* (latx + laty);
    }

    public static int pariDispari (int num){
        int pari = num % 2;
        if(pari == 0){
            return pari;
        }else{
            return 1;
        }
    }

    public static double perimetroTriangolo(double num1, double num2, double num3) {
        double perimetro = num1 + num2 + num3;
        double semiperimetro = perimetro / 2;
        double latoA = semiperimetro - num1;
        double latoB = semiperimetro - num2;
        double latoC = semiperimetro - num3;

        double result = semiperimetro * latoA * latoB * latoC;
        double area = Math.sqrt(semiperimetro*(semiperimetro - num1)*(semiperimetro - num2)* (semiperimetro-num3));
        return area;

        //return Math.sqrt(result);
    }



}
