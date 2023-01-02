package com.bank.business.contract.bank;

public abstract sealed class CardPINValidationResult permits CardPINValid, CardPINInvalid, CardBlocked {
}