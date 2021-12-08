package Lab5;

class Text {
    private Sentence[] sentences;

    public Text(String s) {
        String[] split = s.split("(?<=[?!.]) ");
        this.sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            this.sentences[i] = new Sentence(split[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : this.sentences) {
            result.append(sentence.toString()).append(" ");
        }
        return result.toString();
    }

    // Текст з найбільший паліндром
    public Text largestPalindrome() {
        String text = this.toString();
        return new Text(this.longestPalSubstr(text));
    }

    private String longestPalSubstr(String str) {
        str = str.replaceAll(" ", "");
        int n = str.length();   // отримати довжину вхідного рядка

        // таблиця [i][j] буде хибною, якщо підрядок str [i..j]
        // не паліндром.
        // Інакше таблиця [i][j] буде істинною
        boolean[][] table = new boolean[n][n];

        // Усі підрядки довжиною 1 є паліндромами
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        // перевірити наявність підрядка довжиною 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.toLowerCase().charAt(i)
                    == str.toLowerCase().charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Перевірка довжини більше 2. k — довжина
        // підрядка
        for (int k = 3; k <= n; ++k) {
            // Виправити початковий індекс
            for (int i = 0; i < n - k + 1; ++i) {
                // Отримати кінцевий індекс підрядка з
                // початковий індекс i довжина k
                int j = i + k - 1;

                // перевірка підрядка з ith індексу до
                // jth індекс iff str.charAt(i+1) до
                // str.charAt(j-1) є паліндромом
                if (table[i + 1][j - 1] && str.toLowerCase().charAt(i) ==
                        str.toLowerCase().charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }

        return str.substring(start, start + maxLength + 1);
    }
}
