package com.conygre.spring.SpringRESTApi.service;

import java.util.Collection;

import com.conygre.spring.SpringRESTApi.data.TradeRepository;
import com.conygre.spring.SpringRESTApi.entities.Trade;
import com.conygre.spring.SpringRESTApi.entities.TradeStatus;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeService {
    @Autowired
    private TradeRepository tradeRepository;

    /* CRUD */

    // C
    public void addTrade(Trade trade) {
        tradeRepository.insert(trade);
    }

    // D
    public void deleteTradeById(ObjectId id) {
        tradeRepository.deleteById(id);
    }

    public void deleteTradeById(String id) {
        deleteTradeById(new ObjectId(id));
    }

    public void deleteTrade(Trade trade) {
        tradeRepository.delete(trade);
    }

    // R
    public Trade getTradeById(ObjectId id) {
        return tradeRepository.findById(id).orElse(null);
    }

    public Trade getTradeById(String id) {
        return getTradeById(new ObjectId(id));
    }

    public Collection<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    public Collection<Trade> getAllTradesByStockTicker(String ticker) {
        Iterable<Trade> tmpList = tradeRepository.customFindByStockTicker(ticker);
        return (Collection<Trade>)tmpList;
    }

    public Collection<Trade> getAllTradesByStatus(TradeStatus status) {
        Iterable<Trade> tmpList = tradeRepository.findByStatus(status);
        return (Collection<Trade>)tmpList;
    }

    // U
    public void updateTrade(Trade other) {
        tradeRepository.save(other);
    }

    /*
    public Trade getTradeByQtyPriceInverseAct(String action, String qtyticker, double price) {

        int filledQty = qtyticker;
        while (filledQty > 0)

        if (action == "BUY") {
            // look for latest sell & that price?
            if (price > latest(Highest)SellPrice) {
                // sry loser u cant
            }
        } else if (action == "SELL") {
            // look for latest BUY & ** that price **?
            // look for latest sell & that price?
            if (price < latest(Lowest)BuyPrice) {
                // sry loser u cant sell bc 
            }
        }
    }
    */
}