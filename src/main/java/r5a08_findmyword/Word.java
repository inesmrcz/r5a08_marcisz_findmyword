package r5a08_findmyword;

public class Word {

    private final String word;

    public Word(String word){
        this.word = word;
    }
    public Score guess(String attempt) {
        Score score = new Score(word, attempt);

        /* Calcule le score pour la lettre d'indice 0
           de la tentative
         */
        score.assess(0, attempt);

        return score;
    }
}
