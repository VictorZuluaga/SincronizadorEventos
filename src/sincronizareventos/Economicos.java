
package sincronizareventos;

import java.util.ArrayList;

public class Economicos extends EventosConTrayectoria{
    public Economicos(String localizacion,
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
                fotografias,
                fechaFinal,
                paisFinal);
    }
}
