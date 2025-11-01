public class TV {
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if (on) {
            System.out.println("TV: Ya estaba encendida");
            return;
        }
        on = true;
        System.out.println("TV: Encendida");
    }

    public void turnOff() {
        if (!on) {
            System.out.println("TV: Ya estaba apagada");
            return;
        }
        on = false;
        System.out.println("TV: Apagada");
    }
}