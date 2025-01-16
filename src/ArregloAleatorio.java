import java.util.Random;

public class ArregloAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("*** Arreglo aleatorio ***");

        //Crear arreglo
        int[] numeros = new int[6];

        //Asignacion de valores al arreglo del 1 al 100
        for (var i = 0; i<numeros.length; i++){
            numeros[i] = random.nextInt(100) + 1;
        }

        //Imprimir valores del arreglo
        for(var i = 0; i<numeros.length; i++){
            System.out.println("Valor [" + i + "] = " + numeros[i]);
        }

        //Valor auxiliar para resguardar un valor temporalmente
        int aux;
        //Ordenar valores del arreglo
        for(var i = 0; i<numeros.length; i++){
            for(var j = 0; j<numeros.length; j++){
                if(numeros[i] < numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        System.out.println("\nValores ordenados del menor a mayor del arreglo");
        //Imprimir valores del arreglo ordenados menor a mayor
        for(var i = 0; i<numeros.length; i++){
            System.out.println("Valor Ordenado[" + i + "] = " + numeros[i]);
        }
    }
}
