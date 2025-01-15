public class Arreglos {
    public static void main(String[] args) {
        //Arreglos
        //1. Declaramos un arreglo
        int[] enteros;

        //2. Inicializar el arreglo
        enteros = new int[5];
        enteros[0] = 13;
        enteros[1] = 11;
        enteros[2] = 45;
        enteros[3] = 45;
        enteros[4] = 77;

        //Imprimir todos los valores del array
        for(var i = 0; i<enteros.length; i++){
            System.out.print(enteros[i] + " ");
        }

    }
}
