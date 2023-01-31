package entity;

public class SummerHouse extends BaseHouse{
    public SummerHouse(double housePrice, int meterSquare, int saloon, int room) {
        super(housePrice, meterSquare, saloon, room);
    }

    @Override
    public double getHousePrice() {
        return super.getHousePrice();
    }

    @Override
    public void setHousePrice(double housePrice) {
        super.setHousePrice(housePrice);
    }

    @Override
    public int getMeterSquare() {
        return super.getMeterSquare();
    }

    @Override
    public void setMeterSquare(int meterSquare) {
        super.setMeterSquare(meterSquare);
    }

    @Override
    public int getSaloon() {
        return super.getSaloon();
    }

    @Override
    public void setSaloon(int saloon) {
        super.setSaloon(saloon);
    }

    @Override
    public int getRoom() {
        return super.getRoom();
    }

    @Override
    public void setRoom(int room) {
        super.setRoom(room);
    }
}
