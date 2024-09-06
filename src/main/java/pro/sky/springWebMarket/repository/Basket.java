package pro.sky.springWebMarket.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.springWebMarket.service.MarketService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class Basket implements MarketService {

    private final Set<Integer> goods = new HashSet<>();

    @Override
    public List<Integer> add(List<Integer> goods) {
        this.goods.addAll(goods);
        return new ArrayList<>(this.goods);
    }

    @Override
    public List<Integer> get() {
        return new ArrayList<>(this.goods);
    }
}
