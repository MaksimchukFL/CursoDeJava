package TPNro10AdivinaElNumero;

import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        int numeroaleatorio = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        int seleccion=-1;
        int intentos = 0;
        while (seleccion !=numeroaleatorio) {
            System.out.println("Ingrese un número entre 0 y 100: ");
            seleccion = scanner.nextInt();
            if (seleccion>numeroaleatorio) {
                System.out.println("El numero ingresado es mayor al que debe adivinar. Ingrese un número mas pequeño!:");
                intentos = intentos + 1;
                System.out.println("Cantidad de intentos= " + intentos);
            } else if (seleccion<numeroaleatorio){
                System.out.println("El numero ingresado es menor al que debe adivinar. Ingrese un número mas grande!:");
                intentos = intentos + 1;
                System.out.println("Cantidad de intentos= " + intentos);
            } else{
                System.out.println("Correcto!");
                intentos = intentos + 1;
                System.out.println("Cantidad de intentos= " + intentos);
                break;
            }
        }
    }
}
