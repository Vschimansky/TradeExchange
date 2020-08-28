package com.conygre.spring.SpringRESTApi.data;

import com.conygre.spring.SpringRESTApi.entities.Trade;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TradeRepository extends MongoRepository<Trade, ObjectId>
{
    /// completely b l a n k
}