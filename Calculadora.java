
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        imprimirMenu();

        preguntarOperacion();

    }

    public static void imprimirMenu() {
        System.out.println("Calculadora básica");
        System.out.println("");
        System.out.println("1.- suma");
        System.out.println("2.- resta");
        System.out.println("3.- multiplicación");
        System.out.println("4.- división");
        System.out.println("5.- para salir");
    }

    public static void preguntarOperacion() {

        System.out.println("");
        System.out.println("Ingrese la operación que desea realizar");
        Scanner scannerobj = new Scanner(System.in);
        int lect = scannerobj.nextInt();
        if (lect != 5) {
            System.out.println("");
            System.out.println("Ingrese los números con los que quiere operar");
            System.out.println("");

            double num1 = scannerobj.nextDouble();
            double num2 = scannerobj.nextDouble();
            switch (lect) {
                case 1:
                    sumar(num1, num2);
                    break;
                case 2:
                    restar(num1, num2);
                    break;
                case 3:
                    multiplicar(num1, num2);
                    break;
                case 4:
                    dividir(num1, num2);
                    break;
                default:
                    System.out.println("Caracter inválido");
                    break;

            }
        } else {
            System.out.println("Saliendo de la calculadora.");
        }
    }

    public static void sumar(double a, double b) {
    }

    public static void restar(double a, double b) {
    }

    public static void multiplicar(double a, double b) {
    }

    public static void dividir(double a, double b) {
    }
    public class calculadora {

        public static void main(String[] args) {
            // Pruebas de las funciones
            sumar(5, 3);
            restar(5, 3);
            multiplicar(5, 3);
            dividir(5, 3);
            dividir(5, 0); // Prueba con divisor 0
        }
    
        public static void sumar(double a, double b) {
            double total = a + b;
            imprimirTotal(total);
        }
    
        public static void restar(double a, double b) {
            double total = a - b;
            imprimirTotal(total);
        }
    
        public static void multiplicar(double a, double b) {
            double total = a * b;
            imprimirTotal(total);
        }
    
        public static void dividir(double a, double b) {
            if (b == 0) {
                System.out.println("El divisor no puede ser cero");
            } else {
                double total = a / b;
                imprimirTotal(total);
            }
        }
    
        public static void imprimirTotal(double total) {
            System.out.println("Total: " + total);
        }
    }
    
}