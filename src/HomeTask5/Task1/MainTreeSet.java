package HomeTask5.Task1;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Car car1 = new Car("mersedes",80000);
        Car car2= new Car("audi", 60000);
        Car car3 = new Car("bmw", 70000);
        Car car4 = new Car("kia", 40000);

        Set<Car> car = new TreeSet<Car>();
        car.add(car1);
        car.add(car2);
        car.add(car3);
        car.add(car4);


        for (Car i : car)
            System.out.println(i);


        }
        // TreeSet завжди посортований;
    }

