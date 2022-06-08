package Modelo.Casos;

import Modelo.Principales.Caso;

public class Narcotico extends Caso{
    private String tipo;

    public Narcotico(int numero, String descripcion, String codigo, int idDetective, String nombreClave, String tipo) {
        super(numero, descripcion, codigo, idDetective, nombreClave);
        this.tipo = tipo;
    }
    
    
    
}
