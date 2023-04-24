public class Parrot extends Animal {
    private String species;
    private String language;

    public Parrot(String name, int age, AnimalType type, String species, String language) {
        super(name, age, type);
        this.species = species;
        this.language = language;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void speak() {
        System.out.println("salami me var " + species + " shemidzlia saubari " + language);
    }
}