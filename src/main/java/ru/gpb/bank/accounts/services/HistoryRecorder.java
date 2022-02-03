package ru.gpb.bank.accounts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gpb.bank.accounts.dto.AbstractAccount;
import ru.gpb.bank.accounts.entity.AccountEntity;
import ru.gpb.bank.accounts.repo.AccountRepo;

@Service
public class HistoryRecorder {
    @Autowired
    private AccountRepo accountRepo;

    public void getAccountInfo(AbstractAccount abstractAccount) {
        AccountEntity byClientId =
                accountRepo.findByClientId(abstractAccount.getClientId());

    }
}
