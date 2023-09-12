package com.web.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.emp.dao.EmpDao;
import com.web.emp.vo.Emp;

@Service
public class EmpService {
	@Autowired
	private EmpDao dao;
	public List<Emp> getEmpList(Emp sch){
		String ename = "%";
		String job = "%";
		if(sch.getEname()!=null) ename="%"+sch.getEname()+"%";
		if(sch.getJob()!=null) job = "%"+sch.getJob()+"%";
		
		
		
		return dao.getEmpList(ename,job);
	}

	
}
