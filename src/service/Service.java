package service;

import entity.BaseHouse;
import entity.House;
import entity.SummerHouse;
import entity.Villa;
import generator.Generator;
public  final class Service {

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

        House[] houseList = generator.createAllHouses();
        Villa[] villaList = generator.createAllVillas();
        SummerHouse[] summerHouseList = generator.createAllSummerHouses();


        for (House house : houseList) {
            if(house.getSaloon() == saloon && house.getRoom() == room){

                System.out.println("This is a house. ");
            }

        }

        for (Villa villa : villaList) {
            if(villa.getSaloon() == saloon && villa.getRoom() == room){
                System.out.println("This is a villa.");
            }

        }
        for (SummerHouse summerHouse : summerHouseList) {
            if(summerHouse.getSaloon() == saloon && summerHouse.getRoom() == room){
                System.out.println("This is a summer house.");
            }

        }
    }

}
