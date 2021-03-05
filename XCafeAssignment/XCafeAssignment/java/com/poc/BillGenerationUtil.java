package com.poc;

import com.poc.model.BillAmount;
import com.poc.model.Item;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class BillGenerationUtil {

    public static int TIP_PERCENT = 10;


    public BillAmount calculateAmounts(final List<Item> itemsPurchased) {
        BillAmount billAmount = new BillAmount();
        if(null != itemsPurchased && !itemsPurchased.isEmpty()) {
            for(Item item : itemsPurchased) {
                if(null != item && item.getPrice() != null
                        && item.getPrice().doubleValue()>0) {
                    billAmount.setTotal(billAmount.getTotal().add(item.getPrice()));
                    if(null != item.getCategory() &&
                            item.getCategory().equalsIgnoreCase(String.valueOf(Item.CategoryType.FOOD))) {
                        billAmount.setServiceChargeToInclude(true);
                    }
                }
            }

        }

        if(billAmount.isServiceChargeToInclude()) {
            billAmount.setServiceCharge(calculateServiceCharge(billAmount.getTotal(),new BigDecimal(TIP_PERCENT)));
        }
        BigDecimal total = billAmount.getTotal().add(billAmount.getServiceCharge());
        total = total.setScale(2, BigDecimal.ROUND_DOWN);
        billAmount.setTotalBill(total);
        return billAmount;
    }


    private  BigDecimal calculateServiceCharge(BigDecimal total, BigDecimal pct){
        return total.multiply(pct).divide(new BigDecimal(100));
    }
}
