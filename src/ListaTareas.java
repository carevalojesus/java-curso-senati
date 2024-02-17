import java.util.Scanner;
import java.util.ArrayList;

public class ListaTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<String>();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Bienvenido a la lista de tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la tarea: ");
                    String tarea = scanner.next();
                    tareas.add(tarea);
                    System.out.println("Tarea agregada");
                    break;
                case 2:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas");
                    } else {
                        System.out.println("Lista de tareas");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;
                case 3:
                    if (tareas.isEmpty()){
                        System.out.println("No hay tareas para eliminar");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                        System.out.println("Ingrese el número de la tarea a eliminar: ");
                        int numero = scanner.nextInt();
                        tareas.remove(numero - 1);
                        System.out.println("Tarea eliminada");
                    }
                    break;
                    case 4:
                    System.out.println("Gracias por usar la lista de tareas");
                    break;
            }

        }
    }
}
