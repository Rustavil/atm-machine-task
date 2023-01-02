package com.bank.business.contract.bank;

public final class CardPINInvalid extends CardPINValidationResult {
    public final int failAttemptCount;

    public CardPINInvalid(int failAttemptCount) {
        this.failAttemptCount = failAttemptCount;
    }
}
