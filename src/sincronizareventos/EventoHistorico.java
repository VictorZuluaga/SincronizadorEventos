
package sincronizareventos;

import java.util.ArrayList;

public abstract class EventoHistorico {
    
    protected final String localizacion;
    private final String nombre;
    private final String descripcion;
    private final String fecha;
    private final ArrayList<String> fotografias;
    
    public EventoHistorico(String localizacion,
                            String nombre,
                            String descripcion,
                            String fecha,
                            ArrayList<String> fotografias){
        
        this.localizacion = localizacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.fotografias = fotografias;
    }
    
    public String getLocalizacion(){
        return this.localizacion;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public String getFecha() {
        return this.fecha;
    }
    
    public ArrayList<String> getFotografias(){
        return this.fotografias;
    }
}
