import java.util.Scanner;

public class Veterinaria {
    public static void main(String[] args) {
        byte operacion;
        float suma;
        suma = 0;

        mostrarMenu();

        Scanner scannerobj = new Scanner(System.in);
        operacion = scannerobj.nextByte();
        suma = evaluarOperacion(operacion);
        
        System.out.println("El costo total del servicio es: "+ suma);
    }

    public static void mostrarMenu() {
        System.out.println("Bienvenido a la Veterinaria");
        System.out.println("");
        System.out.println("1- Para servicio de baño. $3500");
        System.out.println("2- Para servicio de peluqueria. $6000");
        System.out.println("3- Para servicio de vacunación. $12500");
        System.out.println("4- Para servicio de baño y peluquería");
        System.out.println("5- Para los tres servicios");
        System.out.println("6- ¨Para baño y vacunación");
        System.out.println("7- Para peluquería y vacunación");
        System.out.println("");
    }

    public static float evaluarOperacion(byte op) {
        float peluqueria, baño, vacunación, sum;

        baño = 3500;
        peluqueria = 600;
        vacunación = 12500;
        sum = 0;
        switch (op) {
            case 1:
                sum = baño;
                break;

            case 2:
                sum = peluqueria;
                break;
            case 3:
                sum = vacunación;
                break;
            case 4:
                sum = baño + peluqueria;
                break;
            case 5:
                sum = baño + peluqueria + vacunación;
                break;
            case 6:
                sum = baño + vacunación;
                break;
            case 7:
                sum = peluqueria + vacunación;
                break;
            default:
                System.out.print("Caracter inválido");
                break;
        }
        return sum;
    }

}
