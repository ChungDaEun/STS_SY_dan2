package com.web.emp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.web.emp.vo.Emp;
// com.web.emp.dao.EmpDao
@Mapper
public interface EmpDao {
	List<Emp> getEmpList(@Param("ename") String ename, 
						 @Param("job") String job);
}
