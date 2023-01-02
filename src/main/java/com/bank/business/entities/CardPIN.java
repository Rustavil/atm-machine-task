package com.bank.business.entities;

public record CardPIN(
        String code
) {
    @Override
    public String toString() {
        return "***";
    }
}
