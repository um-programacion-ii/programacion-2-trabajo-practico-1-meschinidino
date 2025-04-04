package um.prog2;


import um.prog2.vehiculo.Camion;
import um.prog2.vehiculo.Vehiculo;
import um.prog2.vehiculo.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        VehiculoPrinter vehiculoPrinter = new VehiculoPrinter();
        Vehiculo vehiculo1 = new Vehiculo(1.12312, 2009, "hyundai", "GSC 123");
        System.out.println("info para el vehiculo 1");
        VehiculoPrinter.mostrarInfoVehiculo(vehiculo1);
        Vehiculo vehiculo2 = new Vehiculo(2.12312, 2015, "hyundai", "HTD 234");
        System.out.println("info para el vehiculo 2");
        VehiculoPrinter.mostrarInfoVehiculo(vehiculo2);
        Vehiculo vehiculo3 = new Vehiculo(3.12312, 2019, "hyundai", "AD 123 AA");
        System.out.println("info para el vehiculo 3");
        VehiculoPrinter.mostrarInfoVehiculo(vehiculo3);
        Camion vehiculo4 = new Camion(4.12312, 2020, "hyundai", "AE 123 AA", true);
        VehiculoPrinter.mostrarInfoVehiculo(vehiculo4);
    }
}