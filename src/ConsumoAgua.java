import java.util.Scanner;

public class ConsumoAgua {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        String nombreUsuario;
        double lecturaInicial, lecturaFinal, consumo, costoTotal;
        final double TARIFA_POR_LITRO = 0.15;

        
        System.out.print("Ingrese el nombre del usuario: ");
        nombreUsuario = scanner.nextLine();

        System.out.print("Ingrese la lectura inicial del mes (en litros): ");
        lecturaInicial = scanner.nextDouble();

        System.out.print("Ingrese la lectura final del mes (en litros): ");
        lecturaFinal = scanner.nextDouble();

      
        consumo = lecturaFinal - lecturaInicial;
        costoTotal = consumo * TARIFA_POR_LITRO;

      
        System.out.println("\n--- Resumen del consumo ---");
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Consumo: " + consumo + " litros");
        System.out.println("Costo total: $" + String.format("%.2f", costoTotal));

        
        scanner.close();
    }
}