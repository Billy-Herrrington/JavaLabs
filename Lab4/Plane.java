package Lab4;

public class Plane {
    /**
     *
     * @param width - ширина
     * @param colour - колір
     * @param length - довжинна
     * @oaram model - модель літака
     * @param country - країна виробників моделю літака
     *
     * private - закрытый класс
     * Метод Plane всередині конструктора є this - зумовлена змінна
     *
     * Plane [] arr - тип масиву, який може посилатися на змінну
     *
     * У Java створити масив можна за допомогою оператора new за допомогою наступного синтаксису:
     * Plane [] arr = new Plane
     *
     * цикл for дозволяє послідовно пройти весь масив без використання індексу змінної.
     * Наприклад: place[0], place[2] ... place[9]
     *
     * Вивести масив на екран
     * for (Plane plane : arr) {
     *      System.out.print(" " + plane.model + " ");
     * }
     */
    String model;
    private final int length; //довжінна
    private final int width; //ширину
    private final String country; //Країна світу

    public int getWidth() {
        return width;
    }
    public int getLengths() {
        return length;
    }

    public Plane(String model, String colour, int length, int width, String country) {
        this.model = model;
        this.length = length;
        this.width = width;
        this.country = country;
    }
}
