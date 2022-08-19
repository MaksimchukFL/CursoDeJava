package EjercicioRepaso1;

import javax.swing.*;

public class EjercicioRepaso1 {
    public static void main(String[] args){
        int a=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número a: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero b: "));
        int suma=a+b;

        if(suma==100){
          JOptionPane.showMessageDialog(null,"Es 100");
        } else if(suma>100){
            JOptionPane.showMessageDialog(null,"Es mayor a 100 y el resultado es: "+suma);
        } else{
            JOptionPane.showMessageDialog(null,"El resultado es negativo y es: "+suma);
        }
    }
}
