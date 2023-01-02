package com.bank.usecase

import com.bank.business.contract.bank.GetCardBalance
import com.bank.business.contract.bank.ValidateCardPIN
import com.bank.business.contract.cardReader.ReadCardData
import com.bank.business.contract.display.DisplayError
import com.bank.business.contract.display.DisplayMessage
import com.bank.business.contract.display.GetCardPIN

class ShowCardBalance(
    private val getCardBalance: GetCardBalance,
    private val readCardData: ReadCardData,
    private val getCardPIN: GetCardPIN,
    private val validateCardPIN: ValidateCardPIN,
    private val displayMessage: DisplayMessage,
    private val displayError: DisplayError
) {
    operator fun invoke() {
        // todo: implement
        // displayMessage("Card balance: " + balance.amount() + " " + balance.currency())
    }
}