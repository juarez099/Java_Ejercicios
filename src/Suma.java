import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String sumfin;
        System.out.println("Digita un numero: ");
        double num1=leer.nextDouble();
        System.out.println("Digita un numero: ");
        double num2=leer.nextDouble();

        double total= num1+num2;
        System.out.println("total es = " + total);

        sumfin=total >= 30 || total <=50 ? "EL total es mayor a 30 y menor a 50":"Mayor a 50 o menor a 30";
        System.out.println("sumfin = " + sumfin);
    }
}
