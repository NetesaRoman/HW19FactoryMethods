package view;

import models.Cashier;
import models.DataBase;
import models.Table;
import models.Ticket;

/*
 *
 * @author Roman Netesa
 *
 */
public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();

        Ticket ticket1 = cashier.sellTicket("Arnold", 18, 900);
        Ticket ticket2 = cashier.sellTicket("Donald", 15, 900);

        ticket1.printTicket();
        ticket2.printTicket();

        Table table = DataBase.giveAccessToATable();
        table.printTable();
        Table table2 = DataBase.giveAccessToATable();
        table2.printTable();

    }
}