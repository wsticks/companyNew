package com.williams.Service;

import com.williams.DAO.DepartmentDao;
import com.williams.Entity.Department;
import com.williams.Request.DepartmentRequest;

public class DepartmentService {

    private final DepartmentDao dao = new DepartmentDao();

    public Department saveDepartment(DepartmentRequest departmentRequest) {
        Department departmentToSave = dao.saveDepartment(departmentRequest);
        return departmentToSave;
    }
}
