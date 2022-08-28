public class UsoCuenta {

    public static void main(String[] args) {
        CuentaCorriente Cuenta1=new CuentaCorriente("Franco", 10000);
        CuentaCorriente Cuenta2=new CuentaCorriente("Facundo",10000);
        CuentaCorriente.Transferencia(Cuenta1,Cuenta2,2500);
        CuentaCorriente.getDatos(Cuenta1);
        CuentaCorriente.getDatos(Cuenta2);
    }
}
