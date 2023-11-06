package b;

public class Iniciativa {
    private String nombre;
    private String equipo;
    private String nombreProjectManager;
    Iniciativa(){
    }
    public Iniciativa(String nombre, String equipo, String nombreProjectManager) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.nombreProjectManager = nombreProjectManager;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public String getNombreProjectManager() {
        return nombreProjectManager;
    }
    public void setNombreProjectManager(String nombreProjectManager) {
        this.nombreProjectManager = nombreProjectManager;
    }
}
