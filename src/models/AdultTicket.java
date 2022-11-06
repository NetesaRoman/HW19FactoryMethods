package models;

/*
 *
 * @author Roman Netesa
 *
 */
public class AdultTicket extends Ticket {
    public AdultTicket(String name) {
        super(name);
    }

    @Override
    public void printTicket() {
        System.out.println("Adult ticket for " + name);
    }

}
