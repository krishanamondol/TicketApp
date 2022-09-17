package Multithreading;

public class Main {
    public static void main(String[] args) {
        BuyTicket obj = new BuyTicket();
        BuyTicket railobj = new BuyTicket();
        Thread krishna = new Thread(new MovieBookApp(obj,"Krihshna",2));
        krishna.start();
        Thread Tuli = new Thread(new MovieBookApp(obj,"Swarnali Bala Tuli",7));
        Tuli.start();
        Thread Bappy = new Thread(new MovieBookApp(obj,"Bappy",9));
        Bappy.start();
        Thread Pijus = new Thread(new RailTicketBook(railobj,"Pijus",4));
        Pijus.start();
    }
}
