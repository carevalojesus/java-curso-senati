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
            System.out.print("Seleccione una opción :");

            opcion = scanner.nextInt();

            System.out.println(opcion);

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: S/ " + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    int cantidad = scanner.nextInt();
                    saldo += cantidad;
                case 3:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    cantidad = scanner.nextInt();

                    if (cantidad > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= cantidad;
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático");
                    break;
            }
        }

    }
}
