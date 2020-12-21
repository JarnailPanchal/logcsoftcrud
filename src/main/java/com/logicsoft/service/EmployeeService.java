package com.logicsoft.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logicsoft.model.Employees;
import com.logicsoft.repository.EmployeesRepository;
@Service
public class EmployeeService 
{
@Autowired
EmployeesRepository employeesRepository;
public List<Employees> getAllEmployee() 
{
List<Employees> employees = new ArrayList<>();
employeesRepository.findAll().forEach(employees1 -> employees.add(employees1));
return employees;
}
public Employees getEmployeesById(int id) 
{
return employeesRepository.findById(id).get();
}
public void saveOrUpdate(Employees employees) 
{
	employeesRepository.save(employees);
}
public void delete(int id) 
{
	employeesRepository.deleteById(id);
}
public void update(Employees employees, int employeeid) 
{
	employeesRepository.save(employees);
}
}