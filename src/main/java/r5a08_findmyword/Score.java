package r5a08_findmyword;

public class Score {

    private String word;
    private String attempt;

    public Score(String word, String attempt) {
        this.word = word;
        this.attempt = attempt;
    }



    public Letter letter(int index) {
        if (attempt.charAt(index) == word.charAt(index)) {
            return Letter.CORRECT;
        } else {
            return Letter.INCORRECT;
        }

    }
    public void assess(int index, String attempt) {

        Letter result = letter(index);}
}

