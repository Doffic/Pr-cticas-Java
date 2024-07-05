import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EncontrarCaracterEnVector {
    public static void main(String[] args) {
        int tamaño;
        ArrayList<String> arrayCaracteres;

        tamaño = 5;
        arrayCaracteres = new ArrayList<String>(tamaño);

        rellenarVectorLetras(tamaño, arrayCaracteres);

        encontrarLetra(tamaño, arrayCaracteres);

    }

    public static void rellenarVectorLetras(int tamaño, ArrayList<String> vector) {
        Scanner scannerobj = new Scanner(System.in);
        String caracter;
        for (int x = 0; x < tamaño; x++) {
            System.out.println("Ingrese un caracter");
            caracter = scannerobj.next();
            vector.add(caracter);
        }
    }

    public static void encontrarLetra(int tamaño, ArrayList<String> vector) {
        boolean encontrada = false;
        System.out.println("Ingrese la letra que desea encontrar");
        Scanner scannerobj = new Scanner(System.in);
        String letra = scannerobj.next();
        for (int variableIteradora = 0; variableIteradora < tamaño; variableIteradora++) {
            if (vector.get(variableIteradora).equals(letra)) {
                System.out.println("La letra " + letra + " Se encuentra en la posición " + variableIteradora);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("La letra " + letra + " No se encuentra en el vector. ");
        }

    }
}
