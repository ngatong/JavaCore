package Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void Greets() {
        System.out.println("Meow");
    }

}
