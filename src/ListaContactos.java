import java.util.LinkedList;
import java.util.Scanner;
public class ListaContactos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Contacto> contactos = new LinkedList<>();

        int opcion = 0;

        while(opcion != 4) {
            System.out.println("Bienvenido a la lista de contactos");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    contactos.add(new Contacto(nombre, telefono));
                    System.out.println("Contacto agregado");
                    break;
                case 2:
                    if (contactos.isEmpty()){
                        System.out.println("No hay contactos");
                    } else {
                        System.out.println("Lista de contactos");
                        for (int i = 0; i < contactos.size(); i++) {
                            System.out.println((i + 1) + ". " + contactos.get(i));
                        }
                    }
                    break;

                case 3:
                    if (contactos.isEmpty()){
                        System.out.println("No hay contactos para eliminar");
                    } else {
                        for (int i = 0; i < contactos.size(); i++) {
                            System.out.println((i + 1) + ". " + contactos.get(i));
                        }
                        System.out.println("Ingrese el número del contacto a eliminar: ");
                        int numero = scanner.nextInt();
                        contactos.remove(numero - 1);
                        System.out.println("Contacto eliminado");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar la lista de contactos");
                    break;

            }
        }
    }
}
