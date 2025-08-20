public class AlmacenWC {
    public static void main(String[] args) {
        
        double zapatos = 350000;
        double tenis = 280000;
        double camisetas = 175000;
        double jeans = 200000;

        
        System.out.println("Precios actuales:");
        System.out.println("Zapatos: $" + zapatos);
        System.out.println("Tenis: $" + tenis);
        System.out.println("Camisetas: $" + camisetas);
        System.out.println("Jeans: $" + jeans);

        
        double total = zapatos + tenis + camisetas + jeans;
        System.out.println("\nCosto total de los 4 artículos: $" + total);

        double promedio = total / 4;
        System.out.println("Promedio de precios: $" + promedio);

       
        double nuevoJeans = jeans * 1.062;
       
        double nuevoZapatos = zapatos * 0.992;

     
        System.out.println("\nNuevo precio de los Jeans: $" + nuevoJeans);
        System.out.println("Nuevo precio de los Zapatos: $" + nuevoZapatos);
    }
}