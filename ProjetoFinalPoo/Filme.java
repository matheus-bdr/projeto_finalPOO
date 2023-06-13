package ProjetoFinalPoo;

public class Filme extends Entreterimento{
    private float tempoDeDuracaoMin;

    public void setTempoDeDuracaoMin(float tempoDeDuracaoMin) {
        this.tempoDeDuracaoMin = tempoDeDuracaoMin;
    }

    public Filme(float tempoDeDuracao) {
        this.tempoDeDuracaoMin = tempoDeDuracao;
    }

    public float getTempoDeDuracao() {
        return tempoDeDuracaoMin;
    }
    public void tempoDeDuracao (float tempoDeDuracaoMin){
        if(tempoDeDuracaoMin>0){
             tempoDeDuracaoMin = tempoDeDuracaoMin / 60;
        }else{System.out.println("Filme invalido");}
    }
    public Filme(String nome, String direcao, String dataDeLancamento, double ranking, int classificacaIndicativa){
        super(nome, direcao, dataDeLancamento, classificacaIndicativa, ranking);
    }
}
