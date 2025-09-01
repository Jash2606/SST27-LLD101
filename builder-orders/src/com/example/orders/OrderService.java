package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        PricingRules.isValidEmail(email);
        Order.Builder b = new Order.Builder(id, email);
        if (lines != null) {
            for (OrderLine l : lines) {
                b.addLine(l);
            }
        }
        b.setDiscountPercent(discount);
        b.setExpedited(expedited);
        b.setNotes(notes);
        return b.build();
    }
}
