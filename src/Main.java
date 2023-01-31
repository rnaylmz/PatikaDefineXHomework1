import entity.BaseHouse;
import entity.House;
import entity.SummerHouse;
import entity.Villa;
import generator.Generator;
import service.Service;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        Generator generator = new Generator();

        System.out.print("Houses total price: ");
        service.sumPrices(generator.createAllHouses());
        System.out.print("Houses average meter square: ");
        service.averageMeterSquare(generator.createAllHouses());

        System.out.print("Villas total price: ");
        service.sumPrices(generator.createAllVillas());
        System.out.print("Villas average meter square: ");
        service.averageMeterSquare(generator.createAllVillas());

        System.out.print("Summer Houses total price: ");
        service.sumPrices(generator.createAllSummerHouses());
        System.out.print("Summer Houses average meter square: ");
        service.averageMeterSquare(generator.createAllSummerHouses());

        System.out.print("All Houses types total price: ");
        service.sumPrices(generator.getAllHouseTypesList());
        System.out.print("All Houses types average meter square: ");
        service.averageMeterSquare(generator.getAllHouseTypesList());


        service.whichTypeHouseIsItForRoomAndSaloon(2,4 );
    }
}