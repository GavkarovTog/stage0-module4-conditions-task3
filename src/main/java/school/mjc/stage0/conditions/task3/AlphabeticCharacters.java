package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (! Character.isAlphabetic(character)) {
            System.out.println("wrong alphabet!");
        }

        if (character == 'a' || character == 'o' || character == 'u' || character == 'e' || character == 'i' && character == 'y') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
