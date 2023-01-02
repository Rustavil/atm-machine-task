package com.bank.business.usecase;

import com.bank.business.contract.cardReader.ReadCardData;
import com.bank.business.contract.display.DisplayError;
import com.bank.business.contract.display.DisplayMessage;
import com.bank.business.contract.display.GetCardPIN;
import com.bank.business.contract.bank.*;

public class ShowCardBalance {

    private GetCardBalance getCardBalance;
    private ReadCardData readCardData;
    private GetCardPIN getCardPIN;
    private ValidateCardPIN validateCardPIN;
    private DisplayMessage displayMessage;
    private DisplayError displayError;

    public ShowCardBalance(GetCardBalance getCardBalance,
                           ReadCardData readCardData,
                           GetCardPIN getCardPIN,
                           ValidateCardPIN validateCardPIN,
                           DisplayMessage displayMessage,
                           DisplayError displayError) {
        this.getCardBalance = getCardBalance;
        this.readCardData = readCardData;
        this.getCardPIN = getCardPIN;
        this.validateCardPIN = validateCardPIN;
        this.displayMessage = displayMessage;
        this.displayError = displayError;
    }

    public void invoke() {
        // todo: implement
        // displayMessage.invoke("Card balance: " + balance.amount() + " " + balance.currency());
    }
}
