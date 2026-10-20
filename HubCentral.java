public class HubCentral {
    private DispositivoInteligente[] dispositivos;
    private int cantidad;
    public HubCentral() {
        dispositivos = new DispositivoInteligente[10];
        cantidad = 0;
    }
    public void agregarDispositivo(DispositivoInteligente dispositivo) {
        dispositivos[cantidad] = dispositivo;
        cantidad++;
    }
    public void activarModoNoche() {
        System.out.println("activando modo noche");
        for (int i = 0; i < cantidad; i++) {
            if (dispositivos[i].isConectado()) {
                dispositivos[i].apagar();
            } else {
                System.out.println(dispositivos[i].getNombre() + " no esta conectado");
            }
        }
        System.out.println("modo noche activado");
    }
    }
