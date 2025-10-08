package r5a08_findmyword;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTest {
    @Test
    public void should_check_one_incorrect_letter(){
        // Arrange
        Word word = new Word("E"); // Le mot a déviner fait une lettre

        // Act
        Score score = word.guess("B");
        Letter actual=score.letter(0);
        Letter expected = Letter.INCORRECT;

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void should_check_one_correct_letter(){
        // Arrange
        Word word = new Word("coucou"); // Le mot a déviner fait une lettre

        // Act
        Score score = word.guess("coucou");
        Letter actual=score.letter(0);
        Letter expected = Letter.CORRECT;

        // Assert
        assertThat(actual).isEqualTo(expected);
    }
}
