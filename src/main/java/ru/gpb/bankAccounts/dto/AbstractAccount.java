package ru.gpb.bankAccounts.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public abstract class AbstractAccount {
    private BigInteger accountNumber;
    private Long clientId;
    private Long accountId;
    private BigDecimal balance;
    private List<Operation> history;
    private Long historyId;
    private Boolean isFreezed;
}
