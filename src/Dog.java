public class Dog extends Animal {
    private String breed;
    private String sound;

    public Dog(String name, int age, AnimalType type, String breed, String sound) {
        super(name, age, type);
        this.breed = breed;
        this.sound  = sound;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void bark() {
        System.out.println("salami me var " + breed +" "+ sound + " " + sound + " " + sound);
    }
}