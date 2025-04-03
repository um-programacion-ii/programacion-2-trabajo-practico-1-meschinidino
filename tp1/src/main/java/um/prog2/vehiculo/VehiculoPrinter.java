package um.prog2.vehiculo;

public class VehiculoPrinter {

    public static void mostrarInfoVehiculo(Vehiculo vehiculo) {
        System.out.printf("Marca: %s \nPatente: %s\n Anio: %d\n capacidadCargaKg: %f\n" , vehiculo.getMarca(), vehiculo.getPatente(), vehiculo.getAnio(), vehiculo.getCapacidadCargaKg());
    }


}
