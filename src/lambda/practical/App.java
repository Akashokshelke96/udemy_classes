package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );

        Function<Car,String> priceAndColor = (c) ->  " price = " + c.getPrice() + "  color = " + c.getColor();
       String stringCar = priceAndColor.apply(cars.get(0));
        System.out.println(stringCar);
      //  printCarsPriceRange(cars,20000,25000);

      //  printCarsColorBased(cars,"White");

       //this is the anoynmous method we made..which can take any conditions example Price range
//        System.out.println("Cars between 18000 to 25000");
//       printCars(cars, new CarCondition() {
//           @Override
//           public boolean test(Car car) {
//               return car.getPrice() >= 18000 && car.getPrice() <= 25000;
//           }
//       });

       //another anoynmous example color
//        System.out.println("Cars with color White");
//        printCars(cars, new CarCondition() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("White");
//            }
//        });

        //this is the precise lambda expression to handle this whole above methods

        printCars(cars,(car) -> car.getColor().equals("White"));
        printCars(cars,(car) -> car.getPrice() >= 18000 && car.getPrice() <= 25000);


    }
    public static void printCarsPriceRange(List<Car> cars,int low,int high){
        for (Car c:cars) {
            if(c.getPrice()>=low && c.price <= high){
                System.out.println(c);
            }

        }
    }

    public static void printCarsColorBased(List<Car> cars,String colorScheme){
        for (Car cc:cars) {
            if(cc.getColor().equals(colorScheme)){
                System.out.println(cc);
            }

        }
    }
    //instead of both the methods above we directly can use lambda and create this method below..for any condition which user might use to get the data
    public static void printCars(List<Car> cars, Predicate<Car> predicate) {//predicate is the already available interface m=with method TEst in it
        for(Car c:cars){
            if(predicate.test(c)){
                c.printCar();
            }
        }
    }


}
//@FunctionalInterface //after using predicate this is not required
//interface Condition<T> {
//    public boolean test(T t);
//}


