public class FixedTripsNumberCard extends  Card {
    String type;
    Integer TripsCount;
    FixedTripsNumberCard(String id, String type, Integer tripsCount) {
        super(id, type, tripsCount);
        this.type = type;
        this.TripsCount = tripsCount;
    };
}

//card types: "weekend", "weekday"