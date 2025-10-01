package r5a08_findmyword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTest {

    @Test
    public void should_check_one_incorrect_letter(){

        // Arrange
        Word word = new Word ("E"); // Le mot à deviner fait une lettre

        // Act
        Score score = word.guess("B"); // tentative du joueur

        // Assert
        assertEquals(Letter.INCORRECT, score.letter(0));

    }

    @Test
    public void should_check_one_correct_letter(){
        // Arrange
        Word word = new Word ("I"); // Le mot à deviner fait une lettre

        // Act
        Score score = word.guess("I"); // tentative du joueur

        // Assert
        assertEquals(Letter.CORRECT, score.letter(0));
    }


}
