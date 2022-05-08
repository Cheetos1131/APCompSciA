public class Pets {
    //
    private String petName;
    private String petBreed;
    private int petAge;

    public Pets(String name, String breed, int age) {
        petName = name;
        petBreed = breed;
        petAge = age;
    }

    public Pets() {
        
    }

    public String getName() {
        return petName;
    }

    public String getBreed() {
        return petBreed;
    }

    public int getAge() {
        return petAge;
    }

    public void setName(String newName) {
        petName = newName;
    }

    public void setBreed(String newBreed) {
        petBreed = newBreed;
    }

    public void setAge(int newAge) {
        petAge = newAge;
    }
    
}
