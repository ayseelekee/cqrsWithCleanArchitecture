package com.etiya.cqrsWithCleanArchitecture.application.accountTypes.commands.create;

import com.etiya.cqrsWithCleanArchitecture.domain.AccountType;
import com.etiya.cqrsWithCleanArchitecture.persistence.AccounTypeRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountTypeEventHandler {
    private AccounTypeRepository accounTypeRepository;

    public AccountTypeEventHandler(AccounTypeRepository accounTypeRepository) {
        this.accounTypeRepository = accounTypeRepository;
    }

    @EventHandler
    public void on(AccountTypeCreatedEvent accountTypeCreatedEvent){
        AccountType accountType = new AccountType();
        BeanUtils.copyProperties(accountTypeCreatedEvent, accountType);
        this.accounTypeRepository.save(accountType);
    }
}
