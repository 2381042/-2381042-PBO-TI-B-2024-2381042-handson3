package handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] kumpulanbuah = {"Apel", "Piang", "Mangga", "Jeruk", "Durian", "Anggur"};
        int counter = 0;
        do {
            System.out.println("Element ke " + (counter + 1) + " Adalah : " + kumpulanbuah[counter]);
            counter++;
        } while (counter < kumpulanbuah.length);


    }
}
