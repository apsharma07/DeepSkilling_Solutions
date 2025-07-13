package com.cognizant.spring_learn.dao;
import com.cognizant.spring_learn.model.Department;
import org.springframework.stereotype.Repository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Repository
public class DepartmentDao {

    public static List<Department> DEPARTMENT_LIST;

    public DepartmentDao() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("department.xml");
        DEPARTMENT_LIST = (List<Department>) context.getBean("departmentList");
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
