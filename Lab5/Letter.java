package Lab5;

class Letter {
    private char letter;

    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return Character.toString(letter);
        //повертає рядковий об'єкт (String) і подає зазначене char-значення як один символьний рядок.
    }
}