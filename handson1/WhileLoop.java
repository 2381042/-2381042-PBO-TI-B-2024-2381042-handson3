package handson1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] kumpulanbuah = {"Apel", "Piang", "Mangga", "Jeruk", "Durian", "Anggur"};
        int counter = 0;
        while (counter < kumpulanbuah.length) {
            System.out.println("Elemen ke " + (counter + 1) + " Adalah " + kumpulanbuah[counter]);
            counter++;

        }
    }
}
