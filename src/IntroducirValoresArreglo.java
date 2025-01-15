import java.util.Scanner;

public class IntroducirValoresArreglo {
    public static void main(String[] args) {
        //Introducir valores a un arreglo
        Scanner consola = new Scanner(System.in);

        //Declarar arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var longitudArreglo = Integer.parseInt(consola.nextLine());

        //Creamos de manera dinamica el arreglo
        var enteros = new int[longitudArreglo];

        //Solicitar los valores del arreglo
        for (var i = 0; i < longitudArreglo; i++) {
            System.out.print("Introduce la posicion [" + i + "] del arreglo: ");
            var agregar = Integer.parseInt(consola.nextLine());
            enteros[i] = agregar;
        }

        System.out.println("\nImpresion del arreglo");
        //imprimir valores del arreglo
        for (var j =0; j<longitudArreglo;j++) {
            System.out.println("Valor " + j + " : " + enteros[j]);
        }
    }
}
