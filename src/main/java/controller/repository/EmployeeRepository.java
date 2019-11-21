package controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import controller.model.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long>{

}
