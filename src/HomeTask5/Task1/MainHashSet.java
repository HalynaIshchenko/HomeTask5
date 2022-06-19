package HomeTask5.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        Car car1 = new Car("mersedes", 80000);
        Car car2 = new Car("audi", 60000);
        Car car3 = new Car("bmw", 70000);
        Car car4 = new Car("kia", 40000);

        Set<Car> carHashSetList = new HashSet<Car>();
        carHashSetList.add(car1);
        carHashSetList.add(car2);
        carHashSetList.add(car3);
        carHashSetList.add(car4);

        System.out.println("Not sorted : ");
        for (Car i : carHashSetList) {
            System.out.println(i);
        }



        ArrayList<Car> listCar = new ArrayList<>(carHashSetList);
        Collections.sort(listCar);

        System.out.println("Sorted : ");
        for (Car i : listCar) {
            System.out.println(i);
        }
    }
}

