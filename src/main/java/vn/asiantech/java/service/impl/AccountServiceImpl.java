package vn.asiantech.java.service.impl;

import org.springframework.stereotype.Service;

import vn.asiantech.java.entity.Account;
import vn.asiantech.java.service.AccountService;

@Service(AccountService.NAME1)
public class AccountServiceImpl implements AccountService{

	@Override
	public Account getAccount() {
		Account account = new Account();
		account.setEmail("account1@gmail.com");
		account.setFistName("fistName account1");
		account.setLastName("lastName account1");
		return account;
	}

}
