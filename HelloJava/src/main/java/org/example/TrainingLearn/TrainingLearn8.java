package org.example.TrainingLearn;

/* Создать классы - птица и ее наследники воробей, ворона, голубь.
В классе птица задать стандартную реализацию метода пения, в дочерних классах переопределить родительский метод.
*/
public class TrainingLearn8 {

    public static void main(String[] args) {

        Bird vorobey = new Vorobey("Воробей");
        Bird vorona = new Vorona("Ворона");
        Bird golub = new Golub("Голубь");
            /*
             Bird vorona = new Vorona, а не Vorobey vorobey = new Vorobey,
             так как ссылаемся на родителя абстрактный класс
             */
        vorobey.sing();
        vorona.sing();
        golub.sing();

    }

}

// Абстрактный родительский класс
abstract class Bird {

    String species; // Поле типа стринг

    Bird(String species) {
        this.species = species;
    }
    //Определяем в классе поле типа стринг как то что будет в него передано

    abstract void sing();
    //Задаем абстрактный метод, он не определен
}


//Дочерний от абстрактного класс
class Vorobey extends Bird {
//extends показывает от какого класса образован текущий
    Vorobey(String species) {
        super(species);
    }
    //Унаследованы поля класса, определяются через обращение к полю родительского через супер

    @Override //показываем что метод унаследован
    void sing() {
        System.out.println("Чирик - Чирик!");
    }
    //унаследованный и неопределенный метод должен быть определен (то есть иметь тело которое что-то делает
}

class Vorona extends Bird {

    Vorona(String species) {
        super(species);
    }

    @Override
    void sing() {
        System.out.println("Кар - Кар!");
    }
}

class Golub extends Bird {

    Golub(String species) {
        super(species);
    }

    @Override
    void sing() {
        System.out.println("Гули - Гули!");
    }
}
