public class IncrementoPostfijo {
    public static void main(String[] args) {
        // Escenario 1: Incremento postfijo en asignación
        int x = 5;
        int y = x++;
        System.out.println("Después de 'int y = x++;':");
        System.out.println("x = " + x);  // Imprime 6
        System.out.println("y = " + y);  // Imprime 5

        // Escenario 2: Incremento postfijo en impresión
        int a = 10;
        System.out.println("\nImprimiendo 'a++': " + a++);  // Imprime 10
        System.out.println("Valor de 'a' después: " + a);   // Imprime 11

        // Escenario 3: Múltiples incrementos postfijos
        int b = 1;
        int c = b++ + b++;
        System.out.println("\nDespués de 'int c = b++ + b++;':");
        System.out.println("b = " + b);  // Imprime 3
        System.out.println("c = " + c);  // Imprime 3 (1 + 2)
    }
}