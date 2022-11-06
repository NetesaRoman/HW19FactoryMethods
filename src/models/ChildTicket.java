package models;

/*
 *
 * @author Roman Netesa
 *
 */
public class ChildTicket extends Ticket{
    public ChildTicket(String name) {
        super(name);
    }

    @Override
    public void printTicket() {
        System.out.println("Child ticket for " + name);
    }
}
