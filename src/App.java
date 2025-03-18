import mapa_mental.NodeMental;
import mapa_mental.FolhaMental;
import mapa_mental.MapaMental;

public class App {
    
    public static void main(String[] args) {

        NodeMental mapaEstudos = new NodeMental("Estudos");;
        NodeMental mapaPPR = new NodeMental("Padrões de Projeto");;
        NodeMental mapaSDT = new NodeMental("Sistemas Distribuidos");

        mapaEstudos.anexarFilho(mapaPPR);
        mapaEstudos.anexarFilho(mapaSDT);

        FolhaMental folhaComposite = new FolhaMental("Composite");
        FolhaMental folhaAdapter = new FolhaMental("Adapter");

        mapaPPR.anexarFilho(folhaComposite);
        mapaPPR.anexarFilho(folhaAdapter);

        NodeMental mapaSockets = new NodeMental("Sockets");
        mapaSDT.anexarFilho(mapaSockets);

        MapaMental mapa;

        mapa = mapaEstudos;

        mapa.imprimir(0);
    }
}
