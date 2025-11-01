public class HomeTheaterFacade {
    private final TV tv;
    private final DVDPlayer dvd;
    private final SoundSystem sonido;
    private final Lights luces;

    public HomeTheaterFacade(TV tv, DVDPlayer dvd, SoundSystem sonido, Lights luces) {
        this.tv = tv;
        this.dvd = dvd;
        this.sonido = sonido;
        this.luces = luces;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparando Home Theater para ver película...");
        tv.turnOn();
        sonido.turnOn();
        sonido.setVolume(30);
        dvd.turnOn();
        dvd.play(movie);
        luces.turnOff();
        System.out.println("¡Todo listo! Disfruta de la función.");
    }
}