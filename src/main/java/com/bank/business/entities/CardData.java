package com.bank.business.entities;

public record CardData(
        CardNumber number,
        String holder
) {
    public boolean isValid() {
        return number != null;
    }
}
