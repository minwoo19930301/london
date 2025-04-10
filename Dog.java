public class Dog {
    int age;
    String name;
    Dog enemy;
    int hp;
    int strength;


    Dog(){
        this.age = 1;
        this.hp = 30;
        this.strength = 10;
        System.out.println("아 ~~ 태어났다~~~");
    }

    Dog(int age, int hp, int strength){
        this.age = age;
        this.hp = hp;
        this.strength = strength;
    }

    void bark() {
        System.out.println("my name is " + this.name + " ruff ruff !");
    }

    int getAge(int age){
        return this.age + age;
    }

    void hit(int qwe) {
        for (int i = 0; i < qwe; i++) {
            this.enemy.hp = this.enemy.hp - this.strength;
        }
    }

}
