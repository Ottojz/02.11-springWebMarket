package pro.sky.springWebMarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.springWebMarket.service.MarketService;
import pro.sky.springWebMarket.service.impl.MarketServiceImpl;

import java.util.List;

@RestController
@RequestMapping("order")
public class MarketController {

    private final MarketServiceImpl marketServiceImpl;

    public MarketController(MarketServiceImpl marketServiceImpl) {
        this.marketServiceImpl = marketServiceImpl;
    }

    @GetMapping("add")
    public List<Integer> add(@RequestParam List<Integer> goods){
        return marketServiceImpl.add(goods);
    }

    @GetMapping("get")
    public List<Integer> get(){
        return marketServiceImpl.get();
    }
}
