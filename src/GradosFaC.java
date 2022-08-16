import java.util.Scanner;
public class GradosFaC {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        double gradoF=0,C=0;
        System.out.println("Digita los grados en Fahrenheit: ");
        gradoF=leer.nextDouble();

        C=(gradoF-32)/1.8;
        System.out.println("Fahrenheit: "+ gradoF +" son " + C + " Celcius");
    }
}
