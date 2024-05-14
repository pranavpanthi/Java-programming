public class Mammal extends Animal {
    public static void main(String[] args) {
        
        Animal animal = new Mammal();
        animal.makeNoise("moooow");

        Animal reptile = new Reptile();
        reptile.makeNoise("seeeesh");
        
    }
}
