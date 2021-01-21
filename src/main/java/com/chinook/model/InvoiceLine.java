package com.chinook.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InvoiceLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long invoiceLineId;
    private long invoiceId;
    private long trackId;
    private String unitPrice;
    private long quantity;


    public long getInvoiceLineId() {
        return invoiceLineId;
    }

    public void setInvoiceLineId(long invoiceLineId) {
        this.invoiceLineId = invoiceLineId;
    }


    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }


    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }


    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }


    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

}
