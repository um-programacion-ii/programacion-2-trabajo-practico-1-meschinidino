package um.prog2;


import um.prog2.vehiculo.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo(1.12312, 2009, "hyundai", "GSC 123");
        System.out.println("info para el vehiculo 1");
        vehiculo1.mostrarInformacion();
        Vehiculo vehiculo2 = new Vehiculo(2.12312, 2015, "hyundai", "HTD 234");
        System.out.println("info para el vehiculo 2");
        vehiculo2.mostrarInformacion();
        Vehiculo vehiculo3 = new Vehiculo(3.12312, 2019, "hyundai", "AD 123 AA");
        System.out.println("info para el vehiculo 3");
        vehiculo3.mostrarInformacion();
    }
}