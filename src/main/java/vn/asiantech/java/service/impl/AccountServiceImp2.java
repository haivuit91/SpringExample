package vn.asiantech.java.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import vn.asiantech.java.entity.Account;
import vn.asiantech.java.service.AccountService;

@Service
@Qualifier(AccountService.NAME2)
public class AccountServiceImp2 implements AccountService{

	@Override
	public Account getAccount() {
		Account account = new Account();
		account.setEmail("account2@gmail.com");
		account.setFistName("fistName account2");
		account.setLastName("lastName account2");
		return account;
	}

}
