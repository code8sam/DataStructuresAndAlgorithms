package innerclasses;

public class Test {
    public static void main(String[] args) {
//        Car car = new Car("Tata Safari");
//        Car.Engine engine = car.new Engine();
//        engine.start();
//        engine.stop();
//        Computer computer = new Computer("HP", "ABC", "XYZ");
//        computer.getOs().displayInfo();
//
//        Computer.USB usb = new Computer.USB("TYPE-C");
//        usb.displayInfo();

//        ShoppingCart shoppingCart = new ShoppingCart(150);
//        // anonymous inner class :
//        shoppingCart.processPayment(new Payment() {
//            @Override
//            public void pay(double amount) {
//                System.out.println("Paid " + amount + " using Credit Card.");
//            }
//        });

        Hotel hotel = new Hotel("Sunshine Hotel", 10, 5);
        hotel.reserveRoom("Akshit", 5);
        hotel.reserveRoom("Shubham", 5);
    }
}
