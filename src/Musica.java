public class Musica {
    String titulo ;
    String artista ;
    int anolancamento ;
     double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibirFichasTecnicas() {
        System.out.println("Titulo da musica:"titulo);
        System.out.println("Atista:"artista);
        System.out.println("Ano de lançamento:" + anolancamento);

    }
    void avalia (double nota){
        somaDasAvaliacoes +=nota;
        //somaDASavaliacoes +somaDasAvaliacoes +nota;
        //somaDasAvaliacoes=somaDasAvaliacoes+nota;
    }
    double pegaMidia(){
        return somaDasAvaliacoes / numAvaliacoes;
    }

}
