package RestaurnatesComposite;

import java.util.ArrayList;
import java.util.List;

public class GrupoRestaurantes implements RestauranteComponente {
    private List<RestauranteComponente> componentes = new ArrayList<>();

    public void agregarComponente(RestauranteComponente componente) {
        componentes.add(componente);
    }

    public void removerComponente(RestauranteComponente componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarInformacion() {
        for (RestauranteComponente componente : componentes) {
            componente.mostrarInformacion();
        }
    }
}