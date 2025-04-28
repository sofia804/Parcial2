public class Robot {
    private Bateria bateria;
    private boolean dormido;

    public Robot() {
        this.bateria = new Bateria(1000);
        this.dormido = false;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public boolean isDormido() {
        return dormido;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }

    public void avanzar(int pasos) {
        if (!dormido && bateria.getCarga() > 0) {
            int consumo = (pasos / 100) * 10;
            bateria.setCarga(Math.max(bateria.getCarga() - consumo, 0));
            System.out.println("El robot avanzó " + pasos + " pasos.");
        } else {
            System.out.println("El robot no puede avanzar. Está dormido o sin batería.");
        }
    }

    public void retroceder(int pasos) {
        if (!dormido && bateria.getCarga() > 0) {
            int consumo = (pasos / 100) * 10;
            bateria.setCarga(Math.max(bateria.getCarga() - consumo, 0));
            System.out.println("El robot retrocedió " + pasos + " pasos.");
        } else {
            System.out.println("El robot no puede retroceder. Está dormido o sin batería.");
        }
    }

    public void dormir() {
        dormido = true;
        System.out.println("El robot se ha dormido");
    }

    public void despertar() {
        dormido = false;
        System.out.println("El robot se ha despertado");
    }

    public void recargar() {
        bateria.setCarga(1000);
        System.out.println("La batería ha sido recargada");
    }

    public boolean bateriaLlena() {
        return bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga() == 0;
    }

    public int energiaActual() {
        return bateria.getCarga();
    }

    public boolean estaDormido() {
        return dormido;
    }
}

