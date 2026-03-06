package constructor;

public class Banco {
    private String nombre;
    private int cc;
    private double saldo;
    public boolean cuenta;

    public Banco(String nombre, int cc, double saldo, boolean cuenta) {
        this.nombre = nombre;
        this.cc = cc;
        this.saldo = saldo;
        this.cuenta = cuenta;
    }

//-------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public int getCc() {
        return cc;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isCuenta() {
        return cuenta;
    }

//-------------------------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCuenta(boolean cuenta) {
        this.cuenta = cuenta;
    }

//-------------------------------------------------------------


    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", cc=" + cc +
                ", saldo=" + saldo +
                ", cuenta=" + cuenta +
                '}';
    }
}
