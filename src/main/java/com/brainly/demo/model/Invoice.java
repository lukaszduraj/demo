package com.brainly.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long invoiceId;
  private long customerId;
  private java.sql.Timestamp invoiceDate;
  private String billingAddress;
  private String billingCity;
  private String billingState;
  private String billingCountry;
  private String billingPostalCode;
  private String total;


  public long getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(long invoiceId) {
    this.invoiceId = invoiceId;
  }


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public java.sql.Timestamp getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(java.sql.Timestamp invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  public String getBillingCity() {
    return billingCity;
  }

  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }


  public String getBillingState() {
    return billingState;
  }

  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }


  public String getBillingCountry() {
    return billingCountry;
  }

  public void setBillingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
  }


  public String getBillingPostalCode() {
    return billingPostalCode;
  }

  public void setBillingPostalCode(String billingPostalCode) {
    this.billingPostalCode = billingPostalCode;
  }


  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }

}
