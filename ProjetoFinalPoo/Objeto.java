package ProjetoFinalPoo;

class Objeto {
public static void main(String[] args) {
        Filme a1 = new Filme("Vingadores", "MArk Rufallo", "12/12/12", 3, 18);
        System.out.println("O nome do filme é: "+a1.getNome());
        System.out.println("O seu diretor é: "+a1.getDirecao());
        System.out.println("Sua data de lançamento"+a1.getDataDeLancamento());
        System.out.println("Classificação indicativa: "+a1.getClassificacaIndicativa());
        a1.qualidadeDeFilme();
        
        System.out.println("-----------------------------------------------");
        Documentario doc = new Documentario(null, null, null, 0, 0);
        Serie ser = new Serie(null, null, null, 0);
}
}