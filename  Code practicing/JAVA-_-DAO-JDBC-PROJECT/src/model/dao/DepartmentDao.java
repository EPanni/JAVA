package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department department);
	void update(Department department);
	void deleteById(Integer id);
	Department findByID(Integer id);
	List <Department> findAll();
}
