package com.conygre.spring.SpringRESTApi.service;

import java.util.Collection;
import java.util.Optional;

import com.conygre.spring.SpringRESTApi.data.TradeRepository;
import com.conygre.spring.SpringRESTApi.entities.Trade;

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

    public void deleteTrade(Trade trade) {
        tradeRepository.delete(trade);
    }

    // R
    public Optional<Trade> getTradeById(ObjectId id) {
        return tradeRepository.findById(id);
    }

    public Collection<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    // U
    public void updateTrade(Trade other) {
        tradeRepository.save(other);
    }
}