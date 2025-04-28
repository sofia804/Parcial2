public class TestJuego {
    public static void main(String[] args) {
        Robot robot = new Robot();

        Hombre hombre1 = new Hombre("Tomas");
        hombre1.jugarConRobot(robot);

        if (robot.estaDormido()) {
            robot.despertar();
        }

        Hombre hombre2 = new Hombre("Camilo");
        hombre2.jugarConRobot(robot);

        System.out.println("Fin del juego.");
    }
}
