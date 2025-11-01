public class DVDPlayer {
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if (on) {
            System.out.println("DVD: Ya estaba encendido");
            return;
        }
        on = true;
        System.out.println("DVD: Encendido");
    }

    public void play(String movie) {
        if (!on) {
            System.out.println("DVD: No puede reproducir, el reproductor está apagado");
            return;
        }
        System.out.println("DVD: Reproduciendo '" + movie + "'");
    }

    public void turnOff() {
        if (!on) {
            System.out.println("DVD: Ya estaba apagado");
            return;
        }
        on = false;
        System.out.println("DVD: Apagado");
    }
}