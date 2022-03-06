package cafe;

public class Cafe {
    public static void main(String[] args){
        String greetGeneral =  "Welcome to Cafe Java, " ;
        String MensajePendiente =  ", your order will be ready shortly" ;
        String MessagingReady =  ", your order is ready" ;
        String MensajeMostrarTotal =  "Your total is $" ;

        // Menu variables (add yours below) 
        double MochaPrice =  3.5 ;
        double dripCofeePrice = 2.0;
        double lattePrice = 4.5;
        double cappucinoPrice = 2.5;

        // Client name variables (add yours below) 
        String client1 =  "Cindhuri";
        String client2 =  "Sam";
        String client3 =  "Jimmy";
        String client4 =  "Noah";

        // Order completions (add yours below) 
        boolean isOrderReady1 =  false ;
        boolean isOrderReady2 =  true ;
        boolean isOrderReady3 =  false ;
        boolean isOrderReady4 =  true ;

        System.out.println(greetGeneral + client1);
        if(isOrderReady4 == true){
            System.out.println(client4 + MessagingReady );
            System.out.println(MensajeMostrarTotal + cappucinoPrice );
        }
        else{
            System.out.println(client4 + MensajePendiente  );
        }
        if(isOrderReady2 !=true){
            System.out.println(client2 + MensajePendiente  );
        }
        else{
            System.out.println(client2 + MessagingReady );
            System.out.println(MensajeMostrarTotal + (lattePrice + lattePrice) );
        }
        System.out.println(MensajeMostrarTotal + (dripCofeePrice - lattePrice));
    }

}
