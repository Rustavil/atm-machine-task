package com.bank.business.entities;

public record CardNumber(
        String value
) {
    @Override
    public String toString() {
        return "***";
    }
}
