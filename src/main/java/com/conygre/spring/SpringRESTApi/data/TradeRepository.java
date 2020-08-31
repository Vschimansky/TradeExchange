package com.conygre.spring.SpringRESTApi.data;

import java.util.Collection;

import com.conygre.spring.SpringRESTApi.entities.Trade;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface TradeRepository extends MongoRepository<Trade, ObjectId>
{
    
    //Ask about this
    public Collection<Trade> findByTradeStatus(String TradeStatus);

    @Query("{'trade': ?0}")
    public Collection<Trade> customFindByStockTicker(String StockTicker);



}