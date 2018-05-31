public class TicketController {
    Storage storage;
    public TicketController(Storage storage) {
        this.storage = storage;
    }

    public boolean allowAccess(Card card) {

        boolean cardIsValid = this.checkIfCardIsValid(card);
        boolean tripsAreAvailable = card.checkTripsAvailable();
        boolean result =cardIsValid && tripsAreAvailable;
        if (result) {
            card.chargeRide();
        }
        return true;
    };
    private boolean checkIfCardIsValid(Card card) {
        return this.storage.cardsList.containsKey(card.id);
    };
    private void charge(Card card) {
        card.chargeRide();

//        if(card.type == "weekday" || card.type == "weekend") {
//            card.trips = card.trips - 1;
//        }

    };
    private boolean checkIfTripIsAvailable(Card card) {
        return card.checkTripsAvailable();
//        if(card.type == "weekday" || card.type == "weekend") {
//            return card.trips > 0;
//        }
//        return true;
    }
}
