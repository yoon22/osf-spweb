package com.osf.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.web.service.EmpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EMPController {
	
	@Autowired
	private EmpService es;
	
	@RequestMapping(value="/emp/login",method=RequestMethod.POST)
	public @ResponseBody Map<String,String> doLogin(@RequestParam Map<String,String> params,
			 HttpSession hs) {		
		Map<String,String> rMap = new HashMap<String,String>();
		rMap.put("result", "false");
		if(es.loginEmp(params, hs)) {
			rMap.put("result", "true");
		}
			return rMap;
	}
	
	@RequestMapping(value="/emp/insert",method=RequestMethod.GET)
	public String goInsert(Model m) {
		m.addAttribute("deptList", es.selectDeptList());
		return "/uri/emp/insert";
	}
	
	@RequestMapping("/emp/json")
	public @ResponseBody List<String> doJson(){
		List<String> list = new ArrayList<String>();
		list.add("abc");
		return list;
	}
	
	
}
