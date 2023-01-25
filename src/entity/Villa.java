package entity;

public class Villa extends BaseHouse{
    public Villa(String housePrice, String meterSquare, int saloon, int room) {
        super(housePrice, meterSquare, saloon, room);
    }

    @Override
    public String getHousePrice() {
        return super.getHousePrice();
    }

    @Override
    public void setHousePrice(String housePrice) {
        super.setHousePrice(housePrice);
    }

    @Override
    public String getMeterSquare() {
        return super.getMeterSquare();
    }

    @Override
    public void setMeterSquare(String meterSquare) {
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
