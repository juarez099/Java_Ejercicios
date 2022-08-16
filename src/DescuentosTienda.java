import java.util.Scanner;
public class DescuentosTienda {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double precio1=0, precio2=0, precio3=0,desc=0;
        System.out.println("Bienvnido a la tienda EL ZAPATO FELIZ");
        System.out.println();
        System.out.println("Digita el precio del producto: ");
        precio1=leer.nextDouble();

        System.out.println("Digita el precio del producto: ");
        precio2=leer.nextDouble();

        System.out.println("Digita el precio del producto: ");
        precio3=leer.nextDouble();

        double total = precio1+precio2+precio3;

        desc=(total * 0.15)-total;
        System.out.println("total a pagar en caja = " + desc +" $ ");


    }
}
