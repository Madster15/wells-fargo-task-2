package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable=false)
    private Portfolio portfolio;

    @Column(nullable=false)
    private String securityName;

    @Column(nullable=false)
    private String securityCategory;

    @Column(nullable=false)
    private String purchaseDate;

    @Column(nullable=false)
    private String purchacePrice;

    @Column(nullable=false)
    private String quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio, String name, String category, String purchdate, String purchPrice, String quantity) {
        this.portfolio = portfolio;
        this.securityName = name;
        this.securityCategory = category;
        this.purchaseDate = purchdate;
        this.purchacePrice = purchPrice;
        this.quantity = quantity;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public String getPurchacePrice() {
        return purchacePrice;
    }

    public void setPurchacePrice(String purchacePrice) {
        this.purchacePrice = purchacePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


}
