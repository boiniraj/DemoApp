package com.dc.service;

import java.util.List;

import com.dc.dto.EmployeeDto;
import com.dc.entity.EmployeeEntity;

public interface EmpService {
	
	public String registeremp(EmployeeDto emp);
	public List<EmployeeEntity> showAlldata();
	

}
