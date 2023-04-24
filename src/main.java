public class main {
    public static void main(String[] args){
        Dog dog = new Dog("jeka", 3, AnimalType.MAMMAL, "shavi dzagli","waf waf");
        Parrot parrot = new Parrot("gvriti", 2, AnimalType.BIRD, "chiti gvriti","qartulad simon");

        dog.bark();
        parrot.speak();
        
    }
}
