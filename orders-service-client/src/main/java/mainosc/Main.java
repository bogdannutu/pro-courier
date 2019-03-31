package mainosc;

import http.GetOrderByIdClient;
import com.procourier.model.Order;

public class Main {
    public static void main(String[] args) {

        GetOrderByIdClient client = new GetOrderByIdClient();

        Order order = client.getOrder(1L);
        System.out.println(order);
    }
}
