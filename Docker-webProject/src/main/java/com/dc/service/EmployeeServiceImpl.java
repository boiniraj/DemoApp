package com.dc.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.dto.EmployeeDto;
import com.dc.entity.EmployeeEntity;
import com.dc.repository.Emprepo;
@Service
public class EmployeeServiceImpl implements EmpService {
	@Autowired
	private Emprepo repo;

	@Override
	public String registeremp(EmployeeDto emp) {
		EmployeeEntity entity=new  EmployeeEntity();
		BeanUtils.copyProperties(emp, entity);
		repo.save(entity);
		return "Succusfully registerd emp";
	}

	@Override
	public List<EmployeeEntity> showAlldata() {
		
		return  repo.findAll();
	}

}
