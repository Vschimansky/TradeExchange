package com.conygre.spring.SpringRESTApi.api;

import java.util.Collection;

import com.conygre.spring.SpringRESTApi.entities.Trade;
import com.conygre.spring.SpringRESTApi.service.TradeService;
import com.conygre.spring.SpringRESTApi.entities.TradeStatus;


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

    /// GET
    @RequestMapping(method=RequestMethod.GET)
    public Collection<Trade> getAllTrades() {
        return svTrade.getAllTrades();
    }

    @RequestMapping(method=RequestMethod.GET, value = "/{id}")
    public Trade getTradeById(@PathVariable("id") String id) {
        return svTrade.getTradeById(id);
    }

    @RequestMapping(method=RequestMethod.GET, value = "/ticker/{stockTicker}")
    public Collection<Trade> getAllTradesByStockTicker(@PathVariable("stockTicker") String stockTicker){
        return svTrade.getAllTradesByStockTicker(stockTicker);
    }

    @RequestMapping(method=RequestMethod.GET, value = "/status/{status}")
    public Collection<Trade> getAllTradesByStatus(@PathVariable("status") TradeStatus status){
        return svTrade.getAllTradesByStatus(status);
    }

    /// POST
    @RequestMapping(method=RequestMethod.POST)
    public void addTrade(@RequestBody Trade trade) {
        svTrade.addTrade(trade);
    }

    /// PUT
    @RequestMapping(method=RequestMethod.PUT) // , value="/{id}") // mmmm maybe
    public void upsertTrade(@RequestBody Trade trade) {
        /// there should rly be some business rules here (rn we can update quantity / price / etc lol)
        // svTrade.deleteTradeById(id);
        svTrade.updateTrade(trade);
    }

    /// DELETE
    @RequestMapping(method=RequestMethod.DELETE)
    public void deleteTrade(@RequestBody Trade trade) {
        svTrade.deleteTrade(trade);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public void deleteTradeById(@PathVariable("id") String id) {
        svTrade.deleteTradeById(id);
    }
}