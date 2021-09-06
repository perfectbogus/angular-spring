package dev.perfectbogus.employeemanager.repositories;

import dev.perfectbogus.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
