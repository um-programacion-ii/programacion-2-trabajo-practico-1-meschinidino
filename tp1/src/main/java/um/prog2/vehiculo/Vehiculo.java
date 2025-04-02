package um.prog2.vehiculo;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    public Vehiculo() {
    }

    public Vehiculo(double capacidadCargaKg, int anio, String marca, String patente) {
        this.capacidadCargaKg = capacidadCargaKg;
        this.anio = anio;
        this.marca = marca;
        this.patente = patente;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }


    public void mostrarInformacion(){
        System.out.printf("Marca: %s \nPatente: %s\n Anio: %d\n capacidadCargaKg: %f\n" , marca, patente, anio, capacidadCargaKg);
    }
}
