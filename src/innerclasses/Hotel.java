package innerclasses;

public class Hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms){
        this.name=name;
        this.totalRooms=totalRooms;
        this.reservedRooms=reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){
        // writing class inside a method
        // local inner class :
        class ReservationValidator{
            boolean validate(){
                if(guestName==null || guestName.isBlank()){
                    System.out.println("Guest name cannot be empty");
                    return false;
                }
                if(numOfRooms<0){
                    System.out.println("Number of rooms should be > 0");
                    return false;
                }
                if(reservedRooms+numOfRooms > totalRooms){
                    System.out.println("Not enough rooms available");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            reservedRooms +=numOfRooms;
            System.out.println("Reservation confirmed for "+guestName+" for "+numOfRooms+" rooms.");
        }else {
            System.out.println("Reservation failed");
        }
    }
}
