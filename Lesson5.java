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

        Animal dog = new Dog("Dog", "brown", "Run");
        Animal horse = new Horse("Horse", "red", "Run");
        Animal cat = new Cat("Cat", "white", "Run");

        arr[0] = dog;
        arr[1] = horse;
        arr[2] = cat;
        for (Animal e : arr) {
            System.out.println(e.name + ' ' + e.color + ' ' + e.action + " + "+ e.doing()+ " + "+ e.doingLimit());
        }
    }
 }
    abstract class Animal {
        protected String name;
        protected String color;
        protected String action;

        Animal(String name, String color, String action) { // конструктор c 3 параметрами
            this.name = name;
            this.color = color;
            this.action = action;
        }
          abstract String doing();
          abstract String doingLimit();
    }

    class Dog extends Animal {
        Dog(String name, String color, String action) {
            super(name, color, action);
        }
        @Override
        String doing(){
            return "Jump";
        }
        String doingLimit(){
            return "But Jump Only 2 meters!";
        }
    }

    class Horse extends Animal {
        Horse(String name, String color, String action) {
            super(name, color, action);
        }
        @Override
        String doing(){
            return "Swim";
         }
        String doingLimit(){
            return "But Couldn't Jump!";
        }
    }

    class Cat extends Animal {
        Cat(String name, String color, String action) {
            super(name, color, action);
        }
        @Override
        String doing(){
            return "Mewweo";
        }
        String doingLimit(){
            return "But couldn't swim!";
        }

    }


