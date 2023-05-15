
package org.portfolio.dca.Security.Controller;


public class Mensaje {
    private String textoMensaje;
    
    //Constructores

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.textoMensaje = mensaje;
    }
    
    //Getter y Setter

    public String getMensaje() {
        return textoMensaje;
    }

    public void setMensaje(String mensaje) {
        this.textoMensaje = mensaje;
    }
    
    
}
