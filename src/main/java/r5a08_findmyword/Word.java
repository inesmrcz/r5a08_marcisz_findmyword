package r5a08_findmyword;

public class Word {

    private final String word;

    public Word(String word){
        this.word = word;
    }
    public Score guess(String attempt) {
        return new Score(this.word, attempt);
    }
}
