package models;

/*
 *
 * @author Roman Netesa
 *
 */
public class DataBase {
    static String data = "Some data from early days";
    static Table table = null;


    public static Table giveAccessToATable(){
        if(table == null){
        table = Table.generateTable(data);
        }
        return table;
    }
}
