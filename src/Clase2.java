import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Captura un número entero
        // System.out.print("Ingrese su edad: ");
        // int age = sc.nextInt();
        // sc.nextLine(); // Limpiar el buffer

        // int age_parameter = 18; // Ejemplo de parámetro
        // boolean tieneBoleta = true; // Ejemplo de variable booleana

        // if (age >= age_parameter && tieneBoleta) {
        //     System.out.println(" Puede ingresar al evento.");
        // } else {
        //     System.out.println(" No puede ingresar al evento.");
        // }

        // sc.close(); // Cerrar el escáner al final
    }

// if (age >= 18 && tieneBoleta) {
//             System.out.println(" Puede ingresar al evento.");
//         } else if (age > 18 && !tieneBoleta) {
//             System.out.println(" No puede ingresar al evento, pero puede comprar una boleta.");
//         } else if (age < 18 tieneBoleta) {
//             System.out.println(" No puede ingresar al evento, necesita ser mayor de edad.");
//         } else {
//             System.out.println(" No puede ingresar al evento, necesita una boleta.");
//         }

// if-else if-else (anidado) para el caso de que deba cumolir varias condiciones

// switch (case) {
int dia = 3; 
       switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            
                default:
                System.out.println("otro día");

       
    // Desde java 14+: Se puede usar una version mejorada con switch expresiones
        string resultado = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            default -> "otro día";
        };
        System.out.println(resultado);
        sc.close(); // Cerrar el escáner al final

// ejemplos de estructura respectivas
for (int i = 0; i < 5; i++) {
            System.out.println("Interacion: " + i);
        }





// //sintaxis:
// for (tipoElemento variable : coleccion) {
//     // cuerpo del bucle
// }
     
// //ejemplo con array
// String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

// for (String diaSemana : dias) {
//     System.out.println("Día de la semana: " + diaSemana);
// }

//Ejemplo arraylist

arrayList<String> nombres = new ArrayList<>();
colores.add(e:"Rojo");
colores.add("Verde");
        for (String color : colores) {
            System.out.println(Color);
        }
    }
}
//foreach clasico
for (String nombre : nombres) {
    System.out.println(Nombre);
}
//alternativa con forEach (java 8+) usando una lambda
nombre.forEach(f -> System.out.println("-> " + f));


