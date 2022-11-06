package models;

/*
 *
 * @author Roman Netesa
 *
 */
public abstract class Ticket {
    String name;

    public Ticket(String name) {
        this.name = name;
    }

    public abstract void printTicket();

}
