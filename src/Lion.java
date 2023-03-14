public class Lion extends Animal {
     @Override
    public void sound ( ) {
        System.out.println ("Bark");
    }
    private String animalName;
    private String animalColour;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalColour() {
        return animalColour;
    }

    public void setAnimalColour(String animalColour) {
        this.animalColour = animalColour;
    }

    public void behaviour()
    {
        System.out.println("dog behaviour");
    }
    public  void  behaviour(String action)
    {
        System.out.println("Dog is "+action);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalColour='" + animalColour + '\'' +
                '}';
    }

}