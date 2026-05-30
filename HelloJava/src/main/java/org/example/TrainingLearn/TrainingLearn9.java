package org.example.TrainingLearn;

/*
Создайте класс Zoo, содержащий в себе: список животных, метод add, принимающий любой класс,
который наследует Animal, метод getSize, возвращающий количество животных, метод getReport,
возвращающий номер каждого животного и его строковое представление в новой строке.
 */
import java.util.ArrayList;
import java.util.List;
public class TrainingLearn9 {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // добавляем разных животных
        zoo.add(new Lion());
        zoo.add(new Tiger());
        zoo.add(new Bober());
        zoo.add(new Lion());

        System.out.println("Жители зоопарка: " + zoo.getSize()); // 4
        System.out.println(zoo.getReport());
    }
}

class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void add(Animal animal) {
        animal.setNumber(animals.size() + 1);
        animals.add(animal);
    }

    public int getSize() {
        return animals.size();
    }

    public String getReport() {
        StringBuilder report = new StringBuilder();
        for (Animal a : animals) {
            System.out.println(a.getNumber() + ": " + a.getString());
        }
        return report.toString();
    }
}

abstract class Animal {
    private int AnimalNumber;

    public void setNumber(int AnimalNumber) {
        this.AnimalNumber = AnimalNumber;
    }

    public int getNumber() {
        return AnimalNumber;
    }

    public abstract String getString();
}

class Lion extends Animal {
    @Override
    public String getString() {
        return "Лев";
    }
}

class Tiger extends Animal {
    @Override
    public String getString() {
        return "Тигр";
    }
}

class Bober extends Animal {
    @Override
    public String getString() {
        return "Бобёр";
    }
}


