package com.conygre.spring.SpringRESTApi.entities;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/*
    If this component were included in a system that would update attempt to execute Pending trades, then Trade status may have one of a number of values, you may consider creating an Enum for these states (this is optional):
    •CREATED•PENDING•CANCELLED•REJECTED•FILLED•PARTIALLY FILLED•ERROR
*/
@Document
public class Trade {
    @Id
    private ObjectId id;
    private Date creationDate;
    private String stockTicker;
    private int stockQuantity;
    private double requestPrice;
    private String tradeStatus;

    public Trade(Date creationDate, String stockTicker, int stockQuantity, double requestPrice) {
        this(creationDate, stockTicker, stockQuantity, requestPrice, "Created");
    }

    public Trade(Date creationDate, String stockTicker, int stockQuantity, double requestPrice, String tradeStatus) {
        this.creationDate = creationDate;
        this.stockTicker = stockTicker;
        this.stockQuantity = stockQuantity;
        this.requestPrice = requestPrice;
        this.tradeStatus = tradeStatus;
    }

    public Trade() { }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getStockTicker() {
        return stockTicker;
    }

    public void setStockTicker(String stockTicker) {
        this.stockTicker = stockTicker;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getRequestPrice() {
        return requestPrice;
    }

    public void setRequestPrice(double requestPrice) {
        this.requestPrice = requestPrice;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }
}