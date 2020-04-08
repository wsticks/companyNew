package com.williams.DAO;

import com.williams.Entity.Department;
import com.williams.Request.DepartmentRequest;
import com.williams.Response.DepartmentResponse;
import com.williams.ResponseList.DepartmentResponseList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;


public class DepartmentDao {

    SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    //    SessionFactory sessionFactory = HibernateUtil.getSession().openSession();
    Session session = sessionFactory.openSession();
    Query query;

    public Department saveDepartment(DepartmentRequest departmentRequest){
        Department department = new Department();
        department.setStatus(departmentRequest.getStatus());
        department.setDescription(departmentRequest.getDescription());
        department.setName(departmentRequest.getName());
        department.setUniqueKey(departmentRequest.getUniqueKey());
        session.save(department);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        return department;
    }

    public DepartmentResponse getDepartment(Integer department){
        Department savedDepartment= null;
        session.beginTransaction();
        query = session.createQuery("from Department department where department.id=:id");
        query.setParameter("id", department);
        session.getTransaction().commit();
        session.getTransaction().commit();
        session.close();
        DepartmentResponse departmentResponse = new DepartmentResponse();
        departmentResponse.setCreatedAt(savedDepartment.getCreatedAt());
        departmentResponse.setDescription(savedDepartment.getDescription());
        departmentResponse.setId(savedDepartment.getId());
        departmentResponse.setName(savedDepartment.getName());
        departmentResponse.setStatus(savedDepartment.getStatus());
        departmentResponse.setUniqueKey(savedDepartment.getDescription());
        departmentResponse.setUpdatedAt(savedDepartment.getUpdatedAt());
        return departmentResponse;
    }

    public DepartmentResponseList getAllDepartment(){
        List<Department> saveDepartment = null;
        session.beginTransaction();
        query = session.createQuery("from Department department");
        saveDepartment = (List<Department>)query.list();
        session.getTransaction().commit();
        session.close();
        DepartmentResponseList departmentList = new DepartmentResponseList();
        List<DepartmentResponse> departmentResponses = new ArrayList<>();
        for (Department department: saveDepartment){
            DepartmentResponse departmentResponse = new DepartmentResponse();
            departmentResponse.setUpdatedAt(department.getUpdatedAt());
            departmentResponse.setUniqueKey(department.getUniqueKey());
            departmentResponse.setStatus(department.getStatus());
            departmentResponse.setName(department.getName());
            departmentResponse.setId(department.getId());
            departmentResponse.setDescription(department.getDescription());
            departmentResponses.add(departmentResponse);
        }
        departmentList.setDepartmentResponseList(departmentResponses);
        return departmentList;
    }
}
