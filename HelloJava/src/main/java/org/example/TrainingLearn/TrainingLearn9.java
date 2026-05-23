package org.example.TrainingLearn;

/*
Создайте класс Zoo, содержащий в себе: список животных, метод add, принимающий любой класс,
который наследует Animal, метод getSize, возвращающий количество животных, метод getReport,
возвращающий номер каждого животного и его строковое представление в новой строке.
 */
public class TrainingLearn9 {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        System.out.println(zoo.getSize());
        zoo.getReport();


    }

}

/*
У меня возникла проблема, похоже я еще не проходил коллекции и типы коллекций.
Что-нибудь найду и если успею, завтра утром попробую дописать задачу.
 */

class Zoo {

    enum Animals {
        Lion,
        Tiger,
        Bober,
        Straus
    }


    static int getSize() {
        return Animals.values().length;
    }


    void getReport() {
        Animals[] animals = Animals.values();
        for (Animals animal : animals) {
            System.out.println(animal + ": " + animal.ordinal());
        }
    }
}


