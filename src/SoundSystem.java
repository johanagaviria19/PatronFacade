public class SoundSystem {
    private boolean on = false;
    private int volume = 10;

    public boolean isOn() {
        return on;
    }

    public int getVolume() {
        return volume;
    }

    public void turnOn() {
        if (on) {
            System.out.println("Sonido: Ya estaba encendido");
            return;
        }
        on = true;
        System.out.println("Sonido: Encendido");
    }

    public void setVolume(int level) {
        if (!on) {
            System.out.println("Sonido: No puede ajustar volumen, el sistema está apagado");
            return;
        }
        volume = Math.max(0, Math.min(100, level));
        System.out.println("Sonido: Volumen ajustado a " + volume);
    }

    public void turnOff() {
        if (!on) {
            System.out.println("Sonido: Ya estaba apagado");
            return;
        }
        on = false;
        System.out.println("Sonido: Apagado");
    }
}