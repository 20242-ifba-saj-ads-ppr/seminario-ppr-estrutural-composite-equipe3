package mapa_mental;

public class FolhaMental implements MapaMental {
    
    private String titulo;
    private String descricao;

    public FolhaMental(String titulo) {
        this.titulo = titulo;
    }

    public void imprimir(int nivel) {

        for(int n = nivel; n > 0; n--) {
            System.out.print("   ");
        }

        System.out.println("." + this.getTitulo());
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
