package ProjetoFinalPoo;

public class Serie extends Entreterimento {
    private String quantidadeDeTemporadas;
    private String quantidadeDeEpisodeos;
    public String getQuantidadeDeTemporadas() {
        return quantidadeDeTemporadas;
    }
    public void setQuantidadeDeTemporadas(String quantidadeDeTemporadas) {
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    }
    public String getQuantidadeDeEpisodeos() {
        return quantidadeDeEpisodeos;
    }
    public void setQuantidadeDeEpisodeos(String quantidadeDeEpisodeos) {
        this.quantidadeDeEpisodeos = quantidadeDeEpisodeos;
    }
    public Serie(String direcao, String dataDeLancamento, String ranking, int classificacaIndicativa){
        super(ranking, direcao, dataDeLancamento, classificacaIndicativa, classificacaIndicativa);
    }
}
