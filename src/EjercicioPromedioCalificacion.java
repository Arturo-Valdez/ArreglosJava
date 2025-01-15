import java.util.Scanner;

public class EjercicioPromedioCalificacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Titulo
        System.out.println("*** Promedio de Calificaciones ***");

        //Adquirir datos
        System.out.print("¿Cuantas calificaciones desea agregar?: ");
        var cantidadCalificaciones = Integer.parseInt(consola.nextLine());

        //Generar arreglo ( array )
        var calificaciones = new int[cantidadCalificaciones];

        //Asiganamos valores al arreglo
        for (var i = 0; i<cantidadCalificaciones; i++){
            System.out.print("Calificacion[" + i + "] = ");
            var calificacion = Integer.parseInt(consola.nextLine());
            calificaciones[i] = calificacion;
        }
        //Generamos variable y sumamos los valores del arreglo
        var sumaCalificacions = 0;
        for (var j = 0; j<cantidadCalificaciones; j++){
            sumaCalificacions += calificaciones[j];
        }

        //Creamos expresion de promedio
        var promedio = sumaCalificacions / cantidadCalificaciones;

        //Imprimimos calificacion
        System.out.println("Promedio de las Calificaciones: " + promedio);

    }
}
