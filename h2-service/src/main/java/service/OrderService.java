package service;

import com.procourier.model.Order;
import com.procourier.model.Product;
import dao.OrderDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class OrderService {
    private EntityManagerFactory emf;

    private OrderService() {
        this.emf = Persistence.createEntityManagerFactory("pro-courierPU");
    }

    private final static class SingletonHolder {
        private final static OrderService instance = new OrderService();
    }

    public static OrderService getInstance() {
        return SingletonHolder.instance;
    }

    public void addOrder(Order order) {
        EntityManager em = emf.createEntityManager();
        OrderDao orderDao = new OrderDao(em);

        //orice modif de INSERT, UPDATE, DELETE se face intr-o tranzactie
        em.getTransaction().begin();
        orderDao.addOrder(order);
        em.getTransaction().commit();
    }

    public Order getOrderById(Long id) {
        EntityManager em = emf.createEntityManager();
        OrderDao orderDao = new OrderDao(em);
        return orderDao.getOrderById(id);
    }

    public List<Order> getOrders(Long id) {
        EntityManager em = emf.createEntityManager();
        OrderDao orderDao = new OrderDao(em);
        return orderDao.getOrders();
    }
}
