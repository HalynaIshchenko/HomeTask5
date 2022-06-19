package HomeTask5.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainLinkedHashSet {
    public static void main(String[] args) {
        Car car1 = new Car("mersedes", 80000);
        Car car2 = new Car("audi", 60000);
        Car car3 = new Car("bmw", 70000);
        Car car4 = new Car("kia", 40000);

        Set<Car> carLinkedHashSetList = new LinkedHashSet<>();
        carLinkedHashSetList.add(car1);
        carLinkedHashSetList.add(car2);
        carLinkedHashSetList.add(car3);
        carLinkedHashSetList.add(car4);

        System.out.println("Not sorted : ");
        for (Car i : carLinkedHashSetList) {
            System.out.println(i);
        }

        ArrayList<Car> array = new ArrayList<>(carLinkedHashSetList);
        Collections.sort(array);
        System.out.println(array);



        ArrayList<Car> listCar = new ArrayList<>(carLinkedHashSetList);
        Collections.sort(listCar);

        System.out.println("Sorted : ");
        for (Car i : listCar) {
            System.out.println(i);
        }
    }
}

