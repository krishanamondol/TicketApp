package Multithreading;

public class MovieBookApp extends BuyTicket implements Runnable{
    BuyTicket buyTicket;
    String Name; int Amount;
        MovieBookApp(BuyTicket buyTicket, String Name, int Amount){
        this.buyTicket = buyTicket;
        this.Name = Name;
        this.Amount = Amount;
    }
    @Override
    public void run(){
    buyTicket.getticket(Name, Amount);
    }
}
