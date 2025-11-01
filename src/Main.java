public class Main {
    public static void main(String[] args) {
        // Subsistemas
        TV tv = new TV();
        DVDPlayer dvd = new DVDPlayer();
        SoundSystem sonido = new SoundSystem();
        Lights luces = new Lights();

        // Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, dvd, sonido, luces);

        // Demostración de uso de la fachada
        homeTheater.watchMovie("Matrix");

        // Mostrar estados para dar uso a los getters y reducir advertencias
        System.out.println("Estado TV: " + (tv.isOn() ? "Encendida" : "Apagada"));
        System.out.println("Estado DVD: " + (dvd.isOn() ? "Encendido" : "Apagado"));
        System.out.println("Sonido encendido: " + (sonido.isOn() ? "Sí" : "No"));
        System.out.println("Volumen actual: " + sonido.getVolume());
        System.out.println("Luces: " + (luces.areOn() ? "Encendidas" : "Apagadas"));
    }
}