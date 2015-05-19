package vn.asiantech.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.asiantech.java.entity.Account;
import vn.asiantech.java.service.AccountService;

@Controller
@RequestMapping("/admin/")
public class IndexController {
	
	@Autowired
	@Qualifier(AccountService.NAME1)
	private AccountService accoutSv;
	
	@Autowired
	@Qualifier(AccountService.NAME2)
	private AccountService accoutSv2;
	
	
	
	@RequestMapping("index/account")
	public @ResponseBody Account getPageIndex(ModelMap model) {
		Account account = accoutSv.getAccount();
		model.put("account1", account);
		model.put("account2", accoutSv2.getAccount());
		return account;
	}
}
