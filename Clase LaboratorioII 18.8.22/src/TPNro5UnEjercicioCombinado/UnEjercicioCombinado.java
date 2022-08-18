package TPNro5UnEjercicioCombinado;

public class UnEjercicioCombinado {
    public static void main(String[] args) {
        /* Java no viene incluido con una clase que pueda manejar operaciones con fracciones de una manera muy exacta, sin embargo, se puede
        obtener un resultado bastante aproximado utilizando variables tipo double expresadas como divisiones entre doubles. El resultado real
        de la operación es -16 */
        double f1=6d/5d;
        double f2=2d/3d;
        double f3=7d/2d;
        double f4=2d/30d;
        double f5=1d/3d;
        double operacion=((f1-f2*f3+f4)/(f5/5));
        System.out.println(operacion);
    }
}
