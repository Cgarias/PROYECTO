package Modelo.Casos;

import Modelo.Principales.Caso;

public class Cibercrimen extends Caso {
    private String Tipo;

    public Cibercrimen(int numero, String descripcion, String codigo, int idDetective, String nombreClave, String Tipo) {
        super(numero, descripcion, codigo, idDetective, nombreClave);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}
