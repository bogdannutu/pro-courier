package dao;

import com.procourier.model.Order;
import javax.persistence.EntityManager;

public class OrderDao {
    private EntityManager em;

    public OrderDao(EntityManager em) {
        this.em = em;
    }

    public void addOrder(Order order) {
        em.persist(order);
    }
}
