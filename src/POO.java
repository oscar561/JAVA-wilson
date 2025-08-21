public class POO {

    // 1. Clases y objetos
    // Clase: Molde para crear objetos
class Persona {
    String nombre;
    int edad;

    void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creación de un objeto
        Persona p = new Persona();
        p.nombre = "Carlos";
        p.edad = 25;
        p.saludar(); // Llama al método de la clase
    }
}
// Para qué sirve: Permite definir entidades (clases) y crear instancias de ellas (objetos).
// Comentarios: Una clase es la plantilla y el objeto es la instancia real.
    

// 2. Encapsulamiento
class CuentaBancaria {
    private double saldo; // Propiedad privada

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Setter con validación
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(500);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}

// Para qué sirve: Protege los datos internos de la clase y controla su acceso mediante getters y setters.
// Comentarios: Evita modificar los valores directamente, aplicando reglas internas.

// 3. Constructores y this
class Coche {
    String marca;
    int año;

    // Constructor
    public Coche(String marca, int año) {
        this.marca = marca; // this se refiere a la instancia actual
        this.año = año;
    }
}

public class Main {
    public static void main(String[] args) {
        Coche auto = new Coche("Toyota", 2022);
        System.out.println("Marca: " + auto.marca);
    }
}
// Para qué sirve: Inicializa los objetos al crearlos.
// Comentarios: this diferencia las variables de la clase de las variables del método o constructor.


// 4. Herencia y super
class Animal {
    void comer() {
        System.out.println("El animal come");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("El perro ladra");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro p = new Perro();
        p.comer(); // Método heredado
        p.ladrar(); // Método propio
    }
}
// Para qué sirve: Permite que una clase herede propiedades y métodos de otra.
// Comentarios: super se usa para llamar métodos o constructores de la clase padre.


// 5. Polimorfismo (@Override)
class Animal {
    void sonido() {
        System.out.println("Sonido genérico");
    }
}

class Gato extends Animal {
    @Override
    void sonido() {
        System.out.println("El gato maúlla");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Gato(); // Polimorfismo
        a.sonido(); // Llama al método de Gato, no al de Animal
    }
}
// Para qué sirve: Permite que un método se comporte de diferentes maneras según la clase que lo implemente.
// Comentarios: @Override indica que se sobrescribe un método.


// 6. Abstracción
abstract class Figura {
    abstract double area(); // Método abstracto
}

class Circulo extends Figura {
    double radio;
    Circulo(double r) { radio = r; }
    double area() { return Math.PI * radio * radio; }
}

public class Main {
    public static void main(String[] args) {
        Figura f = new Circulo(5);
        System.out.println("Área: " + f.area());
    }
}
// Permite definir clases y métodos sin implementación concreta.
// Comentarios: Obliga a las subclases a implementar los métodos abstractos.

// 7. static y final
class Utilidades {
    static final double PI = 3.1416; // Constante

    static void mostrarMensaje() {
        System.out.println("Método estático llamado sin crear objeto");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Valor de PI: " + Utilidades.PI);
        Utilidades.mostrarMensaje();
    }
}
// Para qué sirve: static pertenece a la clase y no a la instancia. final define constantes o evita modificaciones.
// Comentarios: Se accede sin crear objetos.


// 8. Paquetes y organización
// Archivo: com/ejemplo/Mensaje.java
package com.ejemplo;

public class Mensaje {
    public static void saludar() {
        System.out.println("¡Hola desde el paquete!");
    }
}

// Archivo: Main.java
import com.ejemplo.Mensaje;

public class Main {
    public static void main(String[] args) {
        Mensaje.saludar();
    }
}
// Para qué sirve: Organiza el código en paquetes y controla la visibilidad (public, protected, private).
// Comentarios: Facilita la organización de proyectos grandes.

// 9. toString, equals y hashCode
class Persona {
    String nombre;
    Persona(String n) { nombre = n; }

    @Override
    public String toString() {
        return "Persona: " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona p = (Persona) o;
        return nombre.equals(p.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana");
        Persona p2 = new Persona("Ana");

        System.out.println(p1); // Usa toString()
        System.out.println("¿Son iguales? " + p1.equals(p2));
    }
}
// Para qué sirve: toString() muestra una representación legible, equals() compara objetos y hashCode() mejora el manejo en colecciones.


// 10. Composición vs Herencia
// Herencia
class Motor {
    void encender() { System.out.println("Motor encendido"); }
}

class Coche extends Motor {}

// Composición
class CocheCompuesto {
    Motor motor = new Motor();
    void arrancar() { motor.encender(); }
}

public class Main {
    public static void main(String[] args) {
        // Herencia
        Coche c1 = new Coche();
        c1.encender();

        // Composición
        CocheCompuesto c2 = new CocheCompuesto();
        c2.arrancar();
    }
}

// Para qué sirve:

// Herencia: Relación "es un" (un coche es un motor).

// Composición: Relación "tiene un" (un coche tiene un motor).
// Comentarios: Se prefiere composición cuando se quiere flexibilidad y bajo acoplamiento.
}
