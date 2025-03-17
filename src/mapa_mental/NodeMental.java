package mapa_mental;

import java.util.List;
import java.util.ArrayList;

public class NodeMental implements MapaMental {
    
    private String titulo;
    private List<MapaMental> filhos;

    public NodeMental(String titulo){
        this.titulo = titulo;
        this.filhos = new ArrayList<MapaMental>();
    }

    public void anexarFilho(MapaMental filho) {
        filhos.add(filho);
    }

    public void removerFilho(MapaMental filho) {
        filhos.remove(filho);
    }

    public void imprimir(int nivel) {

    
        for(int n = nivel; n > 0; n--) {
            System.out.print("   ");
        }

        System.out.println("/" + this.getTitulo());

        filhos.stream()
        .forEach(f -> f.imprimir(nivel + 1));        
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    

}
