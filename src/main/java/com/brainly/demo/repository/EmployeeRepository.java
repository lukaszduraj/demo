package com.brainly.demo.repository;

import com.brainly.demo.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employees")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findEmployeeByFirstName(@Param("name") String name);
}
