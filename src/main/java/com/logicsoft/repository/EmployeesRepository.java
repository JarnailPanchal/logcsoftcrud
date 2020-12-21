package com.logicsoft.repository;
import org.springframework.data.repository.CrudRepository;

import com.logicsoft.model.Employees;
public interface EmployeesRepository extends CrudRepository<Employees, Integer>
{
}
