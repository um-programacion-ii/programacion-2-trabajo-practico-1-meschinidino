package um.prog2;


import um.prog2.vehiculo.Auto;
import um.prog2.vehiculo.Camion;
import um.prog2.vehiculo.Vehiculo;
import um.prog2.vehiculo.VehiculoPrinter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = getVehiculos();

        for (Vehiculo vehiculo : vehiculos) {
            switch (vehiculo) {
                case Auto auto -> {
                    System.out.println("info para el auto");
                    VehiculoPrinter.mostrarInfoVehiculo(auto);
                }
                case Camion camion -> {
                    System.out.println("info para el camion");
                    VehiculoPrinter.mostrarInfoVehiculo(camion);
                }
                default -> {
                    System.out.println("info para el vehiculo");
                    VehiculoPrinter.mostrarInfoVehiculo(vehiculo);
                }
            }
        }
        VehiculoPrinter.mostrarInfoVehiculo(getVehiculo(vehiculos, "GSC 123"));
    }

    private static ArrayList<Vehiculo> getVehiculos() {
        Vehiculo vehiculo1 = new Vehiculo(1.12312, 2009, "hyundai", "GSC 123");
        Vehiculo vehiculo2 = new Vehiculo(2.12312, 2015, "hyundai", "HTD 234");
        Vehiculo vehiculo3 = new Vehiculo(3.12312, 2019, "hyundai", "AD 123 AA");
        Camion vehiculo4 = new Camion(4.12312, 2020, "hyundai", "AE 123 AA", true);
        Auto vehiculo5 = new Auto(5.12312, 2021, "hyundai", "AF 123 AA", 4);


        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);
        vehiculos.add(vehiculo5);
        return vehiculos;
    }

    private static Vehiculo getVehiculo(ArrayList<Vehiculo> vehiculos, String patente) {
        Vehiculo vehiculoEncontrado = null;
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo.getPatente().equals(patente)){
                vehiculoEncontrado = vehiculo;
                break;
            }
        }
        return vehiculoEncontrado;
    }
}