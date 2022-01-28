
package sincronizareventos;

import java.util.ArrayList;

public class Sociales extends EventoHistorico{
    
    public Sociales(String localizacion,
            String nombre,
            String descripcion,
            String fecha,
            ArrayList<String> fotografias){
        super(localizacion,
                nombre,
                descripcion,
                fecha,
                fotografias);
    }
}
