public class Main {
    public static void main(String[] args) {

        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider yohan = new CarRider("Bei Yohan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "082222222222");
        CarRider mauren = new CarRider("La Mauren", 22, "083333333333");

        CarData acc = new CarData();
        acc.addCar("SUV", "N 1111 AB", "Honda");
        acc.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        acc.addCar("TRUCK", "N 3333 AB", "Suzuki");
        acc.addCar("CR-V", "N 4444 MA", "Honda");

        acc.listOfCar();

        RentArchive data = new RentArchive();
        data.Rent(ming, acc.carList.get(1), 9);
        data.Rent(yohan, acc.carList.get(0), 3);
        data.Rent(ling, acc.carList.get(1), 1);
        data.Rent(mauren, acc.carList.get(3), 5);

        System.out.println();
        Car.setStatus("true");
        Car.setStatus("true");
        Car.setStatus("false");
        Car.setStatus("true");

        System.out.println();
        data.info();
    }
}
