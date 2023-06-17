package ProjetoFinalPoo;

class Objeto {
public static void main(String[] args) {
        Filme filme = new Filme("Vingadores", "MArk Rufallo", "12/12/12", 3, 18);
        Documentario documentario = new Documentario("Uma vida de animais", "bedas", "2012", 4,17);
        Serie serie = new Serie("Ragnarok", "um diretor", "2017", 8, 0);
    
        System.out.println("O nome do filme é: "+filme.getNome());
        System.out.println("O seu diretor é: "+filme.getDirecao());
        System.out.println("Sua data de lançamento"+filme.getDataDeLancamento());
        System.out.println("Classificação indicativa: "+filme.getClassificacaIndicativa());
        filme.qualidadeDeFilme();
        System.out.println("-----------------------------------------------");

        System.out.println("O nome do socumentário é: "+documentario.getNome());
        System.out.println("O seu diretor é: "+documentario.getDirecao());
        System.out.println("Sua data de lançamento"+documentario.getDataDeLancamento());
        System.out.println("Classificação indicativa: "+documentario.getClassificacaIndicativa());
        documentario.qualidadeDeFilme();
        System.out.println("-----------------------------------------------");

        System.out.println("O nome da serie é: "+serie.getNome());
        System.out.println("O seu diretor é: "+serie.getDirecao());
        System.out.println("Sua data de lançamento"+serie.getDataDeLancamento());
        System.out.println("Classificação indicativa: "+serie.getClassificacaIndicativa());
        serie.qualidadeDeFilme();
        
        System.out.println("-----------------------------------------------");
}
}