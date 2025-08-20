import java.util.Scanner;

public class IvaPorcategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Categoría: ");
        String cat = sc.nextLine().toLowerCase();
        System.out.print("Precio base: ");
        double base = sc.nextDouble();

        double ivaPct = switch (cat) {
            case "alimentos" -> 5;
            case "electronica" -> 19;
            case "ropa" -> 12;
            case "salud" -> 0;
            default -> 10;
        };

        double iva = base * ivaPct / 100;
        System.out.printf("Subtotal: %.2f\nIVA (%.0f%%): %.2f\nTotal: %.2f\n", base, ivaPct, iva, base + iva);
        sc.close();
    }
}
