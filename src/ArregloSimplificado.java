public class ArregloSimplificado {
    public static void main(String[] args) {
        //Arreglos simplificado
        int[] enteros = {100,200,300,400,500};

        //Uso con var
        var entero = new int[]{100,200,300,400,500};

        //imprimir
        for(var i = 0; i<enteros.length;i++){
            System.out.println("Valor " + (i+1)  + " : " + enteros[i]);
        }
    }
}
