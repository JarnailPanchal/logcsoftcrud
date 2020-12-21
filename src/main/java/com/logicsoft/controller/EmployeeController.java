package com.logicsoft.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.logicsoft.model.Employees;
import com.logicsoft.service.EmployeeService;


@RestController
public class EmployeeController 
{
@Autowired
EmployeeService employeeService;
@GetMapping("/book")
private List<Employees> getAllEmployee() 
{
return employeeService.getAllEmployee();
}
@GetMapping("/employee/{employeeid}")
private Employees getEmployees(@PathVariable("employeeid") int employeeid) 
{
return employeeService.getEmployeesById(employeeid);
}
@DeleteMapping("/employee/{employeeid}")
private void deleteBook(@PathVariable("employeeid") int employeeid) 
{
	employeeService.delete(employeeid);
}
@PostMapping("/employees")
private int saveEmployee(@RequestBody Employees employees) 
{
	employeeService.saveOrUpdate(employees);
return employees.getEmployeeid();
}
@PutMapping("/employees")
private Employees update(@RequestBody Employees employees) 
{
employeeService.saveOrUpdate(employees);
return employees;
}
}
