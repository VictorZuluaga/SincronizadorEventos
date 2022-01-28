
package sincronizareventos;

import java.util.ArrayList;

public class Guerras extends EventosConTrayectoria{
    public Guerras(String localizacion,
            String nombre,
            String descripcion,
            String fecha,
            ArrayList<String> fotografias,
            String fechaFinal,
            String paisFinal){
        super(localizacion,
                nombre,
                descripcion,
                fecha,
                fotografias,
                fechaFinal,
                paisFinal);
    }
}
