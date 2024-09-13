// Clase ManosVP
class ManosVP {
    private int cantidadDedos; // Atributo de cantidad (int) de dedos
    private String tipoManos; // Atributo de tipo de manos que tiene el robot

    public ManosVP(String tipoManos) {
        this.cantidadDedos = 5; // Definir cantidad de dedos como 5
        this.tipoManos = tipoManos;
    }

    public String moverDedos() {
        return "Moviendo los " + cantidadDedos + " dedos de " + tipoManos + ".";
    }
}

// Clase PiernasVP
class PiernasVP {
    private int largoEnCm; // Atributo de largo de piernas en cm
    private String modoMovimiento; // Atributo de modo de movimiento

    public PiernasVP(int largoEnCm, String modoMovimiento) {
        this.largoEnCm = largoEnCm;
        this.modoMovimiento = modoMovimiento;
    }

    public String correr() {
        return "Corriendo " + modoMovimiento + " con piernas de " + largoEnCm + " cm de largo";
    }
}

// Clase TorsoVP
class TorsoVP {
    private int peso; // Atributo de peso del robot
    private String color; // Atributo de color del torso del robot

    public TorsoVP(int peso, String color) {
        this.peso = peso;
        this.color = color;
    }

    public String mostrarInformacion() {
        return "Color del robot es " + color + ", con un peso de " + peso + " kg.";
    }
}

// Clase CabezaVP
class CabezaVP {
    private int cantidadOjos; // Atributo de cantidad de ojos del robot
    private String vozDeHombre; // Atributo de voz del robot

    public CabezaVP(int cantidadOjos, String vozDeHombre) {
        this.cantidadOjos = cantidadOjos;
        this.vozDeHombre = vozDeHombre;
    }

    public String procesarInformacion() {
        return "Mirando al rededor con " + cantidadOjos + " ojos, voz de " + vozDeHombre + " ;)";
    }
}

// Clase Robot
class Robot {
    private ManosVP manos;
    private PiernasVP piernas;
    private TorsoVP torso;
    private CabezaVP cabeza;

    public Robot() {
        this.manos = new ManosVP("metal");
        this.piernas = new PiernasVP(100, "rápido");
        this.torso = new TorsoVP(168, "gris");
        this.cabeza = new CabezaVP(2, "Henry Cavill");
    }

    public String realizarAcciones() {
        return "Manos: " + manos.moverDedos() + "\n" +
               "Piernas: " + piernas.correr() + "\n" +
               "Torso: " + torso.mostrarInformacion() + "\n" +
               "Cabeza: " + cabeza.procesarInformacion();
    }

    public ManosVP getManos() {
        return manos;
    }

    public PiernasVP getPiernas() {
        return piernas;
    }

    public TorsoVP getTorso() {
        return torso;
    }

    public CabezaVP getCabeza() {
        return cabeza;
    }
}

// Clase principal con el método main
public class ROBOTtaller {
    public static void main(String[] args) {
        // Crear una instancia del robot
        Robot robot = new Robot();
        
        // Realizar acciones del robot
        String acciones = robot.realizarAcciones();
        System.out.println(acciones);
    }
}

