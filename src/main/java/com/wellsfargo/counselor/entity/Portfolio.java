package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {


    @Id
    @GeneratedValue()
    private long PortfolioId;

    @Column
    private Client client;

    @Column
    private String createDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, String createDate) {
        this.client = client;
        this.createDate = createDate;
    }

    public long getPortfolioId() {
        return PortfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }



    

}
