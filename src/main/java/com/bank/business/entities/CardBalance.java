package com.bank.business.entities;

import java.math.BigDecimal;

public record CardBalance(
        BigDecimal amount,
        Currency currency
) {
}
