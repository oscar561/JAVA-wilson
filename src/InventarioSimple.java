import java.util.*;

public class InventarioSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> inventario = new HashMap<>();

        System.out.print("Ingrese el número de productos: ");
        int M = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea

        if (M <= 0) {
            System.out.println("El número de productos debe ser mayor a 0.");
            sc.close();
            return;
        }

        for (int i = 1; i <= M; i++) {
            String nombre;
            int stock;

            // Validar que el nombre no esté vacío
            do {
                System.out.print("Nombre del producto " + i + ": ");
                nombre = sc.nextLine().trim();
            } while (nombre.isEmpty());

            System.out.print("Stock de " + nombre + ": ");
            stock = sc.nextInt();
            sc.nextLine(); // limpiar salto

            inventario.put(nombre, stock);
        }

        // Mostrar inventario
        System.out.println("\n Inventario:");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " unidades");
        }

        // Calcular total y mayor stock
        int total = 0;
        String productoMax = "";
        int maxStock = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            total += entry.getValue();
            if (entry.getValue() > maxStock) {
                maxStock = entry.getValue();
                productoMax = entry.getKey();
            }
        }

        System.out.println("\n🔹 Total de unidades: " + total);
        System.out.println("🔹 Producto con mayor stock: " + productoMax + " (" + maxStock + " unidades)");

        sc.close();
    }
}
