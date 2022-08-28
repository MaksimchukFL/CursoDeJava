package TPNro9CalcularElPeso;

import java.util.Scanner;

public class CalcularElPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su altura en centìmetros: ");
        int altura=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese hombre o mujer: ");
        String genero= scanner.nextLine();
        if (genero.equals("hombre")){
            System.out.println("Su peso ideal es: "+(altura-110)+"kg");
        } else if (genero.equals("mujer")){
            System.out.println("Su peso ideal es: "+(altura-120)+"kg");
        }else{
            System.out.println("Opción no válida.");
        }
    }
}

