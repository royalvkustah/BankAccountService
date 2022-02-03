package ru.gpb.bank.accounts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gpb.bank.accounts.entity.AccountEntity;

@Repository
public interface AccountRepo extends JpaRepository<AccountEntity, Integer> {
    AccountEntity findByClientId (Long clientId);
}
