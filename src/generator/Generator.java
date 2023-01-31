package generator;

import entity.BaseHouse;
import entity.House;
import entity.SummerHouse;
import entity.Villa;

public final class Generator{

    public House[] createAllHouses(){
        House house = new House(2_000_000, 140, 1, 3);
        House house1 = new House(1_400_000,95,1,2);
        House house2 = new House(2_600_000,168,1,3);
        return new House[]{house, house1, house2};
    }

    public Villa[] createAllVillas(){
        Villa villa = new Villa(10_000_000, 230, 4, 5);
        Villa villa1 = new Villa(10_500_000, 225, 3, 6);
        Villa villa2 = new Villa(8_400_000, 190,3 , 5);
        return new Villa[]{villa, villa1, villa2};
    }

    public SummerHouse[] createAllSummerHouses(){
        SummerHouse summerHouse = new SummerHouse(100, 20, 40, 50);
        SummerHouse summerHouse1 = new SummerHouse(100, 20, 40, 50);
        SummerHouse summerHouse2 = new SummerHouse(100, 20, 40, 50);
        return new SummerHouse[]{summerHouse, summerHouse1, summerHouse2};
    }

    public BaseHouse[] getAllHouseTypesList() {
        House house = new House(2_000_000, 140, 1, 3);
        House house1 = new House(1_400_000,95,1,2);
        House house2 = new House(2_600_000,168,1,3);
        Villa villa = new Villa(10_000_000, 230, 4, 5);
        Villa villa1 = new Villa(10_500_000, 225, 3, 6);
        Villa villa2 = new Villa(8_400_000, 190,3 , 5);
    SummerHouse summerHouse = new SummerHouse(100, 20, 40, 50);
    SummerHouse summerHouse1 = new SummerHouse(100, 20, 40, 50);
    SummerHouse summerHouse2 = new SummerHouse(100, 20, 40, 50);
        return new BaseHouse[]{house, house1, house2,villa, villa1, villa2, summerHouse, summerHouse1, summerHouse2};
    }
    }


