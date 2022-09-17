package Multithreading;

public class BuyTicket {
      static int capasity = 20;
  void getticket(String Name, int Amount){
          synchronized (BuyTicket.class){try {
             Thread.sleep(500);
         }catch (Exception e){
             e.getMessage();
         }
          if (capasity >= Amount){
              capasity -= Amount;
              System.out.println(Name+" You Purches "+Amount+" Ticket"+"\n"+
                                     "Sit left "+capasity);

          }else {
              System.out.println(Name+" Sorry Not Avaliable "+Amount+" Ticket");
        }
      }
    }
}
