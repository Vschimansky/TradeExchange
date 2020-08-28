package com.conygre.spring.SpringRESTApi.dao;

import java.util.Collection;

import com.conygre.spring.SpringRESTApi.entities.Trade;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TradeDAOMongo implements TradeDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Trade getTradeById(String id) {
        return mongoTemplate.findById(new ObjectId(id), Trade.class);
    }

    @Override
    public Collection<Trade> getAllTrades() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addTrade(Trade trade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteTrade(Trade trade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteTradeById(String id) {
        // TODO Auto-generated method stub

    }
    
}