public class Lights {
    private boolean on = false;

    public boolean areOn() {
        return on;
    }

    public void turnOn() {
        if (on) {
            System.out.println("Luces: Ya estaban encendidas");
            return;
        }
        on = true;
        System.out.println("Luces: Encendidas");
    }

    public void turnOff() {
        if (!on) {
            System.out.println("Luces: Ya estaban apagadas");
            return;
        }
        on = false;
        System.out.println("Luces: Apagadas");
    }
}