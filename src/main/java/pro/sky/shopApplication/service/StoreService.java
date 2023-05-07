package pro.sky.shopApplication.service;

import org.springframework.stereotype.Service;
import pro.sky.shopApplication.model.Cart;

import java.util.List;

@Service
public class StoreService {
    private final Cart cart;

    public StoreService(Cart cart) {
        this.cart = cart;
    }

    public void addAll(List<Integer> values) {
        cart.addAll(values);
    }

    public List<Integer> getAll() {
        return cart.getAll();
    }
}
