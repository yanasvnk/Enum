public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "B-901", 45, 3, 7, 250, TypeOfBody.SEDAN);

        Lorry lorry = new Lorry("Ленинград", "SD-678", 90, 4, 9, 145, LiftCapacity.N2);

        Bus bus = new Bus("Жигули", "NM-45", 60, 5, 10, 130, Capacity.AVERAGE);


        System.out.println(car);
        System.out.println(lorry);
        System.out.println(bus);
        car.printType();
        lorry.printType();
        bus.printType();


    }
}

