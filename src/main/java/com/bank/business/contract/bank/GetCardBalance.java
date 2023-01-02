package com.bank.business.contract.bank;

import com.bank.business.entities.CardBalance;
import com.bank.business.entities.CardNumber;

public interface GetCardBalance {
    CardBalance invoke(CardNumber cardNumber);
}
