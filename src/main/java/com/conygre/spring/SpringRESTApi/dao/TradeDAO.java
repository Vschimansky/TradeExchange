package com.conygre.spring.SpringRESTApi.dao;

import java.util.Collection;

import com.conygre.spring.SpringRESTApi.entities.Trade;

public interface TradeDAO {
    public Trade getTradeById(String id);
    public Collection<Trade> getAllTrades();
    public void addTrade(Trade trade);
    public void deleteTrade(Trade trade);
    public void deleteTradeById(String id);
}