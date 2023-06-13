package ProjetoFinalPoo;



public class Entreterimento {
    private String nome;
    private String direcao;
    private String dataDeLancamento;

    private double ranking;
    private int classificacaIndicativa;

    public Entreterimento() {
    }

    public Entreterimento(String nome, String direcao, String dataDeLancamento, int classificacaIndicativa,
            double ranking) {
        this.nome = nome;
        this.direcao = direcao;
        this.dataDeLancamento = dataDeLancamento;
        this.classificacaIndicativa = classificacaIndicativa;
        this.ranking = ranking;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setClassificacaIndicativa(int classificacaIndicativa) {
        this.classificacaIndicativa = classificacaIndicativa;
    }

    public String getDirecao() {
        return direcao;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public double getRanking() {
        return ranking;
    }

    public int getClassificacaIndicativa() {
        return classificacaIndicativa;
    }

    public void qualidadeDeFilme() {
        if (this.ranking <= 3) {
            System.out.println("filme péssimo");
        } else if (this.ranking <= 5) {
            System.out.println("filme mediano");
        } else if (this.ranking > 5) {
            System.out.println("filme recomendado");
        }
    }

}
