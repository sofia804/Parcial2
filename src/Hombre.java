import java.util.Scanner;

public class Hombre {
    private String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugarConRobot(Robot robot) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        boolean rep = true;

        do {
            System.out.println(" CONTROLA AL ROBOT - " + nombre);
            System.out.println("Menú:");
            System.out.println("1. Avanzar una cantidad de pasos");
            System.out.println("2. Retroceder una cantidad de pasos");
            System.out.println("3. Ver la energía actual");
            System.out.println("4. Dormir al robot (finaliza la sesiòn)");
            System.out.println("5. Despertar al robot");
            System.out.println("6. Recargar batería");
            System.out.print("Elija su opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    if (!robot.estaDormido()) {
                        System.out.print("Ingrese pasos a avanzar ");
                        int pasos = teclado.nextInt();
                        robot.avanzar(pasos);
                    } else {
                        System.out.println("El robot está dormido, no puede avanzar");
                    }
                    break;
                case 2:
                    if (!robot.estaDormido()) {
                        System.out.print("Ingrese pasos a retroceder? ");
                        int pasos = teclado.nextInt();
                        robot.retroceder(pasos);
                    } else {
                        System.out.println("El robot está dormido, no puede retroceder.");
                    }

                case 3:
                    System.out.println("Energía actual del robot: " + robot.energiaActual());

                case 4:
                    robot.dormir();
                    rep = false;

                case 5:
                    robot.despertar();

                case 6:
                    robot.recargar();

            }

            if (robot.bateriaVacia()) {
                System.out.println("Batería vacía - Debe recargarla para continuar.");
            }
        } while (rep);
    }
}

