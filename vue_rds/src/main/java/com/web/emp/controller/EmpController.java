package com.web.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.emp.service.EmpService;
import com.web.emp.vo.Emp;

@Controller
public class EmpController {
	@Autowired
	public EmpService service;
	
	// http://localhost:7979/empList
	@GetMapping("/empList")
	public String empList() {
		return "empList.html"; /// empList.html
	}
	// http://localhost:7979/empListData
	@RequestMapping("empListData")
	public ResponseEntity<List<Emp>> 
			empListData(Emp sch){
		return ResponseEntity.ok(
				service.getEmpList(sch));
	}
}
