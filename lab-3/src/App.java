public class App {

    public static void main(String[] args) {
        Storage commonStorage = new Storage();

        TicketController myController = new TicketController(commonStorage);


    }
}
