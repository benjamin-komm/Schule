public class Main {

    public static void main(String[] args) {

        Article book = new Book(1, 32.71f, "Luigi Lo Iacono", "Websockets", 2015);
        Article dvd1 = new DVD(2, 14.95f, "Spiel mir das Lied vom Tod", 135, 8);
        Article dvd2 = new DVD(3, 8.40f, "Casablanca, Classic Collection", 240, 4);

        ShoppingCart shoppingCart = new ShoppingCart();

        System.out.println(book.getPrice());
        System.out.println(dvd1.getPrice());
        System.out.println(dvd2.getPrice());

    }
}
