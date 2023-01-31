package service;

import entity.BaseHouse;
import entity.House;
import entity.SummerHouse;
import entity.Villa;
import generator.Generator;

import java.util.ArrayList;
import java.util.List;


public  class Service {

    Generator generator = new Generator();
    public void sumPrices(BaseHouse[] baseHouses) {
        double sum = 0;
        for (BaseHouse house : baseHouses ) {
            sum += house.getHousePrice();
        }
        System.out.println("Total price: " + sum);
    }

    public void averageMeterSquare(BaseHouse[] baseHouses) {
        int average = 0;
        for (BaseHouse house : baseHouses) {
            average += (house.getMeterSquare())/3;
        }
        System.out.println("Average Meter Square: " + average);
    }

    public void whichTypeHouseIsItForRoomAndSaloon(int room, int saloon) {
        List<BaseHouse> baseHouseList = new ArrayList<>();
        List<House> houseList = new ArrayList<>();
        List<Villa> villaList = new ArrayList<>();
        List<SummerHouse> summerHouseList = new ArrayList<>();
        for (House house : houseList) {
            if(house.getSaloon() <= 1 && house.getRoom() <= 4){
                baseHouseList.add(house);
            }
            System.out.println("This is a house. ");
        }

        for (Villa villa : villaList) {
            if(villa.getSaloon() <= 3 && villa.getRoom() <= 10){
                baseHouseList.add(villa);
            }
            System.out.println("This is a villa.");
        }

        for (SummerHouse summerHouse : summerHouseList) {
            if(summerHouse.getSaloon() <= 2 && summerHouse.getRoom() <= 3){
                baseHouseList.add(summerHouse);
            }
            System.out.println("This is a summer house.");
        }
    }

}
