
package sincronizareventos;

import java.util.ArrayList;

public class Religiosos extends EventoHistorico{
    public Religiosos(String localizacion,
            String nombre,
            String descripcion,
            String fecha,
            ArrayList<String> fotografias) {
        super(localizacion,
                nombre,
                descripcion,
                fecha,
                fotografias);
    }
}
