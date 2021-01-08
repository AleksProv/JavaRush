package javacore.level7.lectore_10.restoran;

public class Table {
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder(){
        return new Order(number);
    }
}
