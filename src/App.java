import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Empleado> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el ID del Empleado:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese su nombre:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese su apellido:");
            String apellido = scanner.nextLine();

            System.out.println("Departamento en que vive:");
            double departamento = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Ingrese su salario:");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            Empleado empleado = new empleado (id, nombre, apellido, departamento, salario);
            productos.add(empleado);

           System.out.println("¿Quiere ingresar un Empleado más? (s/n):");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        Collections.sort(empleado, Comparator.comparingInt(Empleado::getId));

        Iterator<Empleado> iterator = empleado.iterator();
         while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            System.out.println(empleado);
        }

        scanner.close();
    }
}
