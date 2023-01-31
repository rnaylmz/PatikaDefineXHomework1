package entity;

public abstract class BaseHouse {
    private double housePrice;
    private int meterSquare;
    private int saloon;
    private int room;


    public BaseHouse( double housePrice, int meterSquare, int saloon, int room) {
        this.housePrice = housePrice;
        this.meterSquare = meterSquare;
        this.saloon = saloon;
        this.room = room;
    }

    public double getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(double housePrice) {
        this.housePrice = housePrice;
    }

    public int getMeterSquare() {
        return meterSquare;
    }

    public void setMeterSquare(int meterSquare) {
        this.meterSquare = meterSquare;
    }

    public int getSaloon() {
        return saloon;
    }

    public void setSaloon(int saloon) {
        this.saloon = saloon;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

}
