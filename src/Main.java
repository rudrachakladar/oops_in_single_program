public class Main {
    public static void main(String[] args) {
       Animal animal=new Lion();
       animal.sound();
       Lion l1=new Lion();
       l1.setAnimalName("Dog");
       l1.setAnimalColour("brown");
        System.out.println(l1.toString());
       l1.behaviour();
       l1.behaviour("wagging a tail");

    }
}