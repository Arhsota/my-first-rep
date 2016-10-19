/**
 *  Andrey Sevastyanov, author 19/10/2016 homework for lesson5, Java 1  19.10.2016.
 *  Parent class - Animal, child classes are Dog, Horse and Cat
 *
 */

class Lesson5 {

    public static void main(String args[]) {
        new Lesson5().work();
    }

    void work() {
        Animal[] arr = new Animal[3];

        Animal dog = new Dog("Hound", "brown", true);
        Animal horse = new Horse("Sivka", "red", true);
        Animal cat = new Cat("Masya", "white", true);

        arr[0] = dog;
        arr[1] = horse;
        arr[2] = cat;
        for (Animal e : arr) {
            System.out.println(e.name + ' ' + e.color + ' '+ e.doing());
        }
    }
 }
    abstract class Animal {
        protected String name;
        protected String color;
        protected boolean action;

        Animal(String name, String color, boolean action) { // конструктор c 3 параметрами
            this.name = name;
            this.color = color;
            this.action = action;
        }
          abstract String doing();
    }

    class Dog extends Animal {
        Dog(String name, String color, boolean action) {
            super(name, color, action);
        }
        @Override
        String doing(){
            return "Jump";
        }
    }

    class Horse extends Animal {
        Horse(String name, String color, boolean action) {
            super(name, color, action);
        }
        @Override
        String doing(){
            return "Swim";
        }
    }

    class Cat extends Animal {
        Cat(String name, String color, boolean action) {
            super(name, color, action);
        }
        @Override
        String doing(){
            return "Mewweo";
        }

    }


