package com.osf.web.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	@Autowired
	// @Qualifier("ds") application-config.xml 에 datasource가 2개라면 지정해줘야함.
	private DataSource ds;
		@RequestMapping("/")
		public String goHome() {
			try {
				log.info("con=>{}",ds.getConnection());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return "index";
		}
		
		@RequestMapping("/test")
		public String goTest(Model model) {
			try {
				log.info("con=>{}",ds.getConnection());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			model.addAttribute("msg","hello~");
			List<String> strList = new ArrayList<String>();
			strList.add("이");
			strList.add("거");
			strList.add("도");
			model.addAttribute("list",strList);
			return "test";
		}
}
