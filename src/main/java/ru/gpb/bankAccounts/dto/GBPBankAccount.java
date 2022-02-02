package ru.gpb.bankAccounts.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class GBPBankAccount extends AbstractAccount{
    private BigDecimal DepositedFunds;
    private BigDecimal CreditedFunds;
}
