package service;

import entity.BaseHouse;
import entity.House;
import entity.SummerHouse;
import entity.Villa;

public  class Service implements IService{

   House house;
   Villa villa;
   SummerHouse summerHouse;

    @Override
    public String sumPrices(String price) {
        return price;
    }

    @Override
    public String averageMeterSquare(String meterSquare) {
        return meterSquare;
    }

    @Override
    public void whichTypeHouseIsIt(int room, int saloon) {

    }
}
