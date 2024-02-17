import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        //Instanciamos el objeto de la libreria que permite escribir en consola
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        double saldo = 1000; // saldo inicial

        while (opcion != 4) {
            System.out.println("Bienvenido al Cajero Automático de SENATI");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción");

            opcion = scanner.nextInt();

            System.out.println(opcion);
        }

    }
}
