import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean rep = true;
        int opc;

        do{
            System.out.println("CONTROLA AL ROBOT");
            System.out.println("Menù:");
            System.out.println("1. Avanzar una cantidad de pasos");
            System.out.println("2. Retroceder una cantidad de pasos");
            System.out.println("3. Ver la energìa actual");
            System.out.println("4. Dormir al robot");
            System.out.println("5. Despertar al robot");
            System.out.println("6. Recargar baterìa");
            opc = teclado.nextInt();

            switch (opc){
                case 1 -> {

                }

                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }

                case 5 -> {

                }

                case 6 -> {

                }
            }


        }while(rep);



    }
}