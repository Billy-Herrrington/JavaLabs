package Lab5;
/**
 * клас для слів, що складаються з масиву букв
 */
class Word extends SentenceMember {
    private Letter[] letters;

    public Word(String s) {
        char[] chars = s.toCharArray();
        this.letters = new Letter[s.length()];
        for (int i = 0; i < chars.length; i++) {
            this.letters[i] = new Letter(chars[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Letter letter : this.letters) {
            result.append(letter.toString());
        }
        return result.toString();
    }
}
