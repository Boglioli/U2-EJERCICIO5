public class DispositivoInteligente {
    private String nombre;
    private boolean conectado;

    public DispositivoInteligente(String nombre, boolean conectado) {
        this.nombre = nombre;
        this.conectado = conectado;
    }

    public void encender() {
        if (conectado) {
            System.out.println(nombre + " esta encendido");
        }
    }

    public void apagar() {
        if (conectado) {
            System.out.println(nombre + " esta apagado");
        }
    }

    public void configurar(String parametro) {
        if (conectado) {
            System.out.println(nombre + " configurando: " + parametro);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isConectado() {
        return conectado;
    }
}
