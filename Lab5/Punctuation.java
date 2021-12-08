package Lab5;

class Punctuation extends SentenceMember {
    private String symbols;

    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return this.symbols;
    }
}
