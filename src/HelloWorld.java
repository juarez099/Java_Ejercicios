import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Bienvenido a Java Luis Juarez");

        System.out.println("Digita un numero: ");
        double num1=leer.nextDouble();
        System.out.println("Digita un numero: ");
        double num2=leer.nextDouble();

        double total= num1+num2;
        System.out.println("total es = " + total);



    }
}
