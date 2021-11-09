package Later;

import java.util.Arrays;
import java.util.Scanner;
public class Lab3{
    
    //тип индексу String
    //В усіх питальних реченнях заданого
    //тексту знайти та надрукувати без
    //повторень слова заданої довжини.

    public static void main(String[] args) {
        String TextOfLab3 = "В Україні цифровізують сільські бібліотеки: 150 комп'ютерів передають Запорізькій області"
                + "Наразі дванадцять областей України вже отримали понад 3 000 комп'ютерів."
                + "Міністерство цифрової трансформації України разом із партнерами передають"
                + "сто п'ятдесят одиниць комп'ютерної техніки сільським бібліотекам Запорізької області?"
                + "в межах проєкту \"Дія. Цифрова освіта\". Про це 28 вересня повідомляє Мінцифри. "
                + "партнерами є Офіс Президента України, Асоціація розвитку туризму, "
                + "Українська бібліотечна асоціація? В Україні є понад п'ятнадцять тисяч публічних бібліотек, більшість "
                + "з яких — це сільські бібліотеки та бібліотеки ОТГ? Лише близько тридцять% з них мають комп'ютери та під’єднані до мережі Інтернет. "
                + "Нагадаємо, у Дніпрі із ретроавтобуса зробили бібліотеку. Цей транспорт за радянських часів використовували "
                + "як пересувну бібліотеку, театр, музей та навіть цирк? ";
        int Length = 0;
        int Start_Sym = 0, i, k = 0;

        //Ведення данних
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        try {
            Length = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("Виникла помилка: " + exception);
        }

        //Масиви
        String[] Words = TextOfLab3.split(" ");
        String[] Sentences = new String[Words.length];
        String[] WordsBase = new String[Words.length];

        for (i = 0; i < TextOfLab3.length(); i++) {
            if (TextOfLab3.charAt(i) == '.' || TextOfLab3.charAt(i) == '!' || TextOfLab3.charAt(i) == '?') {
                if (TextOfLab3.charAt(i) == '?') {
                    Sentences[k] = TextOfLab3.substring(Start_Sym, i + 1);
                    k++;
                }
                Start_Sym = i + 1;
            }
        }

        for (i = 0; i < Words.length; i++) {
            if (Words[i].replaceAll("\\.|:|;|,|!|\\?", "").length() == Length) {
                for (k = 0; k < Sentences.length; k++) {
                    if (Sentences[k] == null) {
                        continue;
                    }
                    if (Sentences[k].contains(Words[i].replaceAll("\\.|:|;|,|!|\\?", ""))
                            && !Arrays.asList(WordsBase).contains(Words[i].replaceAll("\\.|:|;|,|!|\\?",
                            ""))) {
                        WordsBase[i] = Words[i].replaceAll("\\.|:|;|,|!|\\?", "");
                    }
                }
            }
        }

        for (i = 0; i < Words.length; i++) {
            if (WordsBase[i] != null) {
                System.out.println(WordsBase[i]);
            }
        }

    }
}

