package models;

/*
 *
 * @author Roman Netesa
 *
 */
public class Cashier {

    public Ticket sellTicket(String name, int age, double money){
        if(age >= 18 && money >= 50){
            return new AdultTicket(name);
        }else if(age < 18 && money >= 25){
            return new ChildTicket(name);
        }
        return new Ticket(name) {
            @Override
            public void printTicket() {
                System.out.println("NOT ENOUGH MONEY!");
            }
        };
    }

}
