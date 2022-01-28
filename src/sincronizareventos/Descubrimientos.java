
package sincronizareventos;

import java.util.ArrayList;

public class Descubrimientos extends EventoHistorico{
    public Descubrimientos(String localizacion,
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
