
package sincronizareventos;

import java.util.ArrayList;

public class SincronizarEventos {
    public static void main(String[] args) {
        
        /*String localizacion,
            String nombre,
            String descripcion,
            String fecha,
            ArrayList<String> fotografias,
            String fechaFinal,
            String paisFinal*/
        
        ArrayList<String> fotos = new ArrayList<>();
        fotos.add("foto1");
        fotos.add("foto2");
        EventosConTrayectoria e1 = new Guerras("Alemania",
                                "Segunda guerra mundial",
                                "catastrofica",
                                "01-07-1939",
                                fotos,
                                "02-07-1945",
                                "Francia"
        );
        /*EventoHistorico e2 = new Culturales("Alemania",
                "Segunda guerra mundial",
                "catastrofica",
                "01-07-1939",
                fotos,
                "02-07-1945",
                "Francia"
        );*/
        
        System.out.println(e1.getTrayectoria());
    }
    
}
