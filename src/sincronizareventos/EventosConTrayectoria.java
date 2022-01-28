
package sincronizareventos;

import java.util.ArrayList;

public abstract class EventosConTrayectoria extends EventoHistorico{
    private final String fechaInicio;
    private final String fechaFinal;

    private final String paisInicio;
    private final String paisFinal;

    public EventosConTrayectoria(String localizacion,
            String nombre,
            String descripcion,
            String fecha,
            ArrayList<String> fotografias,
            String fechaFinal,
            String paisFinal) {
        super(localizacion,
                 nombre,
                 descripcion,
                 fecha,
                 fotografias);
        this.fechaInicio = fecha;
        this.fechaFinal = fechaFinal;
        this.paisInicio = localizacion;
        this.paisFinal = paisFinal;
    }
    
    
    public String getTrayectoria() {

        return "El conflicto " + this.getNombre()
                + " Se expandió desde el país " + this.paisInicio
                + " hasta el país " + this.paisFinal
                + " desde " + this.fechaInicio + " hasta "
                + this.fechaFinal;
    }
    
}
