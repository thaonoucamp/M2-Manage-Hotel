public class Customer extends Person{
    private int dayToRent;
    private String typeRoom;
    private double priceRoom;

    public Customer() {
    }

    public Customer(int dayToRent, String typeRoom, double priceRoom) {
        this.dayToRent = dayToRent;
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
    }

    public Customer(String name, String birtDay, String identity, int dayToRent, String typeRoom, double priceRoom) {
        super(name, birtDay, identity);
        this.dayToRent = dayToRent;
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
    }

    public int getDayToRent() {
        return dayToRent;
    }

    public void setDayToRent(int dayToRent) {
        this.dayToRent = dayToRent;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }
}
