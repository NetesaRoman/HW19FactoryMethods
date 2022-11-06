package models;

/*
 *
 * @author Roman Netesa
 *
 */
public class Table {
    String someData;

    private Table(String someData) {
        this.someData = someData;
    }

    public void printTable(){
        System.out.println(someData + "/n" + someData + "/n" +someData + "/n" + someData + "/n");
    }

    public static Table generateTable(String data){
        return new Table(data);
    }
}
