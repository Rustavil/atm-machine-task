package com.bank.business.contract.bank;

public final class CardPINValid extends CardPINValidationResult {
    public final int failAttemptCount;

    public CardPINValid(int failAttemptCount) {
        this.failAttemptCount = failAttemptCount;
    }
}
