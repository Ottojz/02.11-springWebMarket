package pro.sky.springWebMarket.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.springWebMarket.repository.Basket;
import pro.sky.springWebMarket.service.MarketService;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService {

    private final Basket basket;

    public MarketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> goods) {
        return basket.add(goods);
    }

    @Override
    public List<Integer> get() {
        return basket.get();
    }
}
