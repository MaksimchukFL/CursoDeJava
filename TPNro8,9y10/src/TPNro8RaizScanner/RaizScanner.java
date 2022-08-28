package TPNro8RaizScanner;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("introduce un número: ");
        int n=s.nextInt();
        System.out.println("la raìz de "+n+" es = "+Math.sqrt(n));
    }
}
