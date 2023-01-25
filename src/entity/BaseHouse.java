package entity;

public abstract class BaseHouse {
    private String housePrice;
    private String meterSquare;
    private int saloon;
    private int room;


    public BaseHouse(String housePrice, String meterSquare, int saloon, int room) {
        this.housePrice = housePrice;
        this.meterSquare = meterSquare;
        this.saloon = saloon;
        this.room = room;
    }

    public String getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(String housePrice) {
        this.housePrice = housePrice;
    }

    public String getMeterSquare() {
        return meterSquare;
    }

    public void setMeterSquare(String meterSquare) {
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
