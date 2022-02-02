package ru.gpb.bankAccounts.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Operation {
    private AbstractAccount Sender;
    private AbstractAccount Receiver;
    private BigDecimal Amount;
    private String Date;
}
