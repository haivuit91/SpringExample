package vn.asiantech.java.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin/post/")
@RestController
public class IndexActions {
	@RequestMapping(value="index",method=RequestMethod.POST)
	public Map getPageIndex( @RequestParam(value="name") String name,@RequestParam(value="email") String email){
		Map<String,String> model = new HashMap<>();
		model.put("name", name);
		model.put("email", email);
		return model;
	}
}
