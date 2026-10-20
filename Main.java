public class Main {
    public static void main(String[] args) {
        HubCentral hub = new HubCentral();
        DispositivoInteligente foco = new DispositivoInteligente("foco", true);
        DispositivoInteligente aire = new DispositivoInteligente("aire", true);
        DispositivoInteligente persiana = new DispositivoInteligente("persiana", false);
        hub.agregarDispositivo(foco);
        hub.agregarDispositivo(aire);
        hub.agregarDispositivo(persiana);
        hub.activarModoNoche();
    }
}
