package Animal;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void Greets() {
        System.out.println("Wooow");
    }

    @Override
    public void Greets(Dog another) {
        System.out.println("Woooooow");
    }
    public void Greets(BigDog another){
        System.out.println("Wooooooooow");
    }
}
