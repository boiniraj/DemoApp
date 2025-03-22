package com.dc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc.entity.EmployeeEntity;

public interface Emprepo extends JpaRepository<EmployeeEntity, Integer> {

}
