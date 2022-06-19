package HomeTask5.Task1;

/*Створити клас (будь який), описати в ньому мінімум два поля, одне з яких String, інше числове (довільно яке). Створити в мейн методі Set.
 Наповнити його об’єктами даного класу.
        Вивести спершу невідсортований список, потім відсортований на консоль(використати Comparable для сортування за цими полями);
        Спробувати зробити завдання з HashSet, LinkedHashSet та TreeSet .

 */
public class Car implements Comparable<Car> {
    private String name;
    private int price;

    Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    ;


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car anotherCar) {
        return (this.price < anotherCar.price) ? -1 : ((this.price == anotherCar.price) ? 0 : 1);
    }


}