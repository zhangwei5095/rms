package com.anwei.rms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anwei.rms.util.constant.BaseUrl;
@Controller
public class UserController {
	@RequestMapping(value = "/user/user-list", method = RequestMethod.GET)
	 public String getRoleView() {
	    return BaseUrl.USER_VIEW;
	 }
}
