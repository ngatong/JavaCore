package Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat("Miu");
        cat.Greets();
        Dog dog=new Dog("Tép");
        dog.Greets();
        Dog another=new Dog("a");
        dog.Greets(another);
        BigDog bigDog=new BigDog("Mít");
        bigDog.Greets(another);
        bigDog.Greets();
        BigDog another2=new BigDog("Two");
        bigDog.Greets(another2);

    }
}
