package com.procourier.app;

import spark.Request;
import spark.Response;
import spark.Route;

public class OrdersHandler implements Route {

    private OrdersHandler() {

    }

    public static final OrdersHandler INSTANCE = new OrdersHandler();

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return "Hello World";
    }
}
