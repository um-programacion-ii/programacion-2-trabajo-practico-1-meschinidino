package um.prog2.vehiculo;

public class Auto extends Vehiculo{
    private int cantidadPasajeros;

    public Auto(double capacidadCargaKg, int anio, String marca, String patente, int cantidadPasajeros) {
        super(capacidadCargaKg, anio, marca, patente);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public Auto() {
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
}
