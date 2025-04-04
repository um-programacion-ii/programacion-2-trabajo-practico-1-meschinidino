package um.prog2.vehiculo;

public class Camion extends Vehiculo{
    private boolean tieneAcoplado;

    public Camion(double capacidadCargaKg, int anio, String marca, String patente, boolean tieneAcoplado) {
        super(capacidadCargaKg, anio, marca, patente);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }
}
