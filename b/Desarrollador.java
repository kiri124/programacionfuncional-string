package b;

import  java.util.List;
public class Desarrollador {private String codigo;
    private String nombres;
    private String apellidos;
    private int salario;
    private int totalLaptopsAsignados;
    // OneToMany
    private List<Iniciativa> iniciativas;
    public Desarrollador() {
    }
    public Desarrollador(String codigo, String nombres, String apellidos, int salario, int totalLaptopsAsignados, List<Iniciativa> iniciativas) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.salario = salario;
        this.totalLaptopsAsignados = totalLaptopsAsignados;
        this.iniciativas = iniciativas;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getTotalLaptopsAsignados() {
        return totalLaptopsAsignados;
    }
    public void setTotalLaptopsAsignados(int totalLaptopsAsignados) {
        this.totalLaptopsAsignados = totalLaptopsAsignados;
    }
    public List<Iniciativa> getIniciativas() {
        return iniciativas;
    }
    public void setIniciativas(List<Iniciativa> iniciativas) {
        this.iniciativas = iniciativas;
    }
    @Override
    public String toString() {
        return "Desarrollador{" +
                "codigo='" + codigo + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", salario=" + salario +
                ", totalLaptopsAsignados=" + totalLaptopsAsignados +
                ", iniciativas=" + iniciativas +
                '}';
    }
}