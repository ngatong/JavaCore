package Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void Greets() {
        System.out.printf("Woof");
    }
    public void Greets(Dog another){
        System.out.println("Woooof");
    }

}
