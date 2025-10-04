public class gestiondebuses {
    public static void main(String[] args) {
        autobus bus1 = new autobus("AB1234", 800, 20, 10);
        conductores conductor1 = new conductores("Pedro Lopez", "Clase A3", bus1);

        //Imprimir usando getters, datos del bus y del conductor
        System.out.println("Datos del bus:");
        System.out.println("Placa: " + bus1.getPlaca());
        System.out.println("Nivel de combustible: " + bus1.getNivcombus() + " litros");
        System.out.println("Porcentaje de consumo: " + bus1.getPorcentajedeconsumo() + "%");
        System.out.println("Desgaste: " + bus1.getDesgaste() + "%");
        System.out.println("\nDatos del conductor:");
        System.out.println("Nombre: " + conductor1.getNombre());
        System.out.println("Licencia: " + conductor1.getLicencia());
        System.out.println("Bus asignado: " + conductor1.getBusAsignado().getPlaca());
        //Imprimir consumo por recorrido
        System.out.println("\nConsumo por recorrido:");
        bus1.recorrido();
        //Imprimir nivel de combustible restante
        System.out.println("\nNivel de combustible restante después de los recorridos: " + bus1.getNivcombus() + " litros");
        
    }
}
