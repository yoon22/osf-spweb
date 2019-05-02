package com.osf.web.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.web.dao.DeptDAO;
import com.osf.web.dao.EmpDAO;
import com.osf.web.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDAO edao;
	@Autowired
	private DeptDAO ddao;
	
	
	@Override
	public boolean loginEmp(Map<String, String> emp, HttpSession hs) {
		Map<String,String> dbEmp = edao.selectEmpById(emp);
		if(dbEmp==null || !dbEmp.get("PWD").equals(emp.get("pwd"))) {
			return false;
		}
		//2:최고관리자 1:일반사용자
		if("2".equals(dbEmp.get("LVL"))){
			emp.put("lvl", "1");
			hs.setAttribute("empList", edao.selectEmpList2(emp));
		}
		hs.setAttribute("emp", dbEmp);
		return true;
	}


	@Override
	public List<Map<String, String>> selectDeptList() {
		
		return ddao.selectDeptList();
	}

}
