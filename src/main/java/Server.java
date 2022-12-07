import jakarta.xml.ws.Endpoint;
import webService.BankService;

public class Server {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost/",new BankService());
        System.out.println("     Server Start   ");
    }
}
