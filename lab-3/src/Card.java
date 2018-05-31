public class Card {
    String id;
    String type;
    Integer trips;

    public Card(String id, String type, Integer trips) {
        this.id = id;
        this.type = type;
        this.trips = trips;

   }
    public void chargeRide(){

    }

    public boolean checkTripsAvailable(){
        return true;
    }
}
