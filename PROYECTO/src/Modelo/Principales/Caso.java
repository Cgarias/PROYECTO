package Modelo.Principales;

public class Caso {
    private int numero;
    private String descripcion;
    private String codigo;
    private int idDetective;
    private String nombreClave;

    public Caso(int numero, String descripcion, String codigo, int idDetective, String nombreClave) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.idDetective = idDetective;
        this.nombreClave = nombreClave;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdDetective() {
        return idDetective;
    }

    public void setIdDetective(int idDetective) {
        this.idDetective = idDetective;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }
    
    
    
}
