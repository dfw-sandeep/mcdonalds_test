package com.poc.model;

import java.math.BigDecimal;

public class BillAmount {
    private BigDecimal total = new BigDecimal(0.0);
    private BigDecimal serviceCharge = new BigDecimal(0.0);
    private boolean isServiceChargeToInclude;
    private BigDecimal totalBill = new BigDecimal(0.0);

    public BigDecimal getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(BigDecimal totalBill) {
        this.totalBill = totalBill;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public boolean isServiceChargeToInclude() {
        return isServiceChargeToInclude;
    }

    public void setServiceChargeToInclude(boolean serviceChargeToInclude) {
        isServiceChargeToInclude = serviceChargeToInclude;
    }
}
