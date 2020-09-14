package com.conygre.spring.SpringRESTApi.data;

import java.util.Collection;
import java.util.List;

import com.conygre.spring.SpringRESTApi.entities.Trade;
import com.conygre.spring.SpringRESTApi.entities.TradeStatus;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface TradeRepository extends MongoRepository<Trade, ObjectId>
{
    //Ask about this
    public List<Trade> findByStatus(TradeStatus status);

    @Query("{'trade': ?0}")
    public Collection<Trade> customFindByStockTicker(String StockTicker);
}