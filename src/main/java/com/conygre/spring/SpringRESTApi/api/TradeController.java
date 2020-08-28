package com.conygre.spring.SpringRESTApi.api;

import java.util.Collection;
import java.util.Optional;

import com.conygre.spring.SpringRESTApi.entities.Trade;
import com.conygre.spring.SpringRESTApi.service.TradeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trade")
public class TradeController {
    @Autowired
    private TradeService svTrade;
    
    @RequestMapping(method=RequestMethod.GET, value = "/{id}")
    public Optional<Trade> getTradeById(@PathVariable("id") String id) {
        return svTrade.getTradeById(id);
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public Collection<Trade> getAllTrades() {
        return svTrade.getAllTrades();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addTrade(@RequestBody Trade trade) {
        svTrade.addTrade(trade);
    }

    @RequestMapping(method=RequestMethod.DELETE)
    public void deleteTrade(@RequestBody Trade trade) {
        svTrade.deleteTrade(trade);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public void deleteTradeById(@PathVariable("id") String id) {
        svTrade.deleteTradeById(id);
    }
}