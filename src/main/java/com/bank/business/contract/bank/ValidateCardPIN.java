package com.bank.business.contract.bank;

import com.bank.business.entities.CardNumber;
import com.bank.business.entities.CardPIN;

public interface ValidateCardPIN {
    CardPINValidationResult invoke(CardNumber number, CardPIN pin);
}
