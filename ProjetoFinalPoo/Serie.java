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
    public Serie(String nome, String direcao, String dataDeLancamento, double ranking, int classificacaIndicativa){
        super(nome, direcao, dataDeLancamento, classificacaIndicativa, ranking);
    }
}
