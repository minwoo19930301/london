public class Main {

    public static void main(String[] args) {
        int a = 3;

        Dog asdfasdf = new Dog();
        asdfasdf.name = "happy";
        asdfasdf.age = 4;
        Dog doggy2 = new Dog(2, 30, 20);
        asdfasdf.bark();
        System.out.println(asdfasdf.getAge(3));
        asdfasdf.enemy = doggy2;
        asdfasdf.hit(3);
        System.out.println(asdfasdf.enemy.hp);
        Cat cat = new Cat();




    }
}
