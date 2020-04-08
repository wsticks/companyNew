package com.williams.DAO;

import com.williams.Entity.RecruitmentEntity;
import com.williams.Request.RecruitmentRequest;
import com.williams.Response.RecruitmentResponse;
import com.williams.ResponseList.ResponeList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.ws.rs.ProcessingException;
import java.util.ArrayList;
import java.util.List;

public class RecruitmentDao {

    SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    //    SessionFactory sessionFactory = HibernateUtil.getSession().openSession();
    Session session = sessionFactory.openSession();
    Query query;

    public RecruitmentEntity saveEmployee(RecruitmentRequest recruitmentRequest){
        RecruitmentEntity recruitmentEntity = new RecruitmentEntity();
        recruitmentEntity.setEmployeeNumber(recruitmentRequest.getEmployeeNumber());
        recruitmentEntity.setEmail(recruitmentRequest.getEmail());
        recruitmentEntity.setSalary(recruitmentRequest.getSalary());
        recruitmentEntity.setDepartment(recruitmentRequest.getDepartment());
        recruitmentEntity.setMaritalStatus(recruitmentRequest.getMaritalStatus());
        recruitmentEntity.setAge(recruitmentRequest.getAge());
        recruitmentEntity.setFirstName(recruitmentRequest.getFirstName());
        recruitmentEntity.setLevel(recruitmentRequest.getLevel());
        recruitmentEntity.setMiddleName(recruitmentRequest.getMiddleName());
        recruitmentEntity.setNameOfSchool(recruitmentRequest.getNameOfSchool());
        recruitmentEntity.setSex(recruitmentRequest.getSex());
        recruitmentEntity.setSurname(recruitmentRequest.getSurname());
        recruitmentEntity.setStatus(recruitmentRequest.getStatus());
        session.save(recruitmentEntity);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        return recruitmentEntity;
    }

    public RecruitmentResponse getEmployeeInfo (Long entity){
        RecruitmentEntity recruitmentEntity = null;
        session.beginTransaction();
        query = session.createQuery("from RecruitmentEntity recruitmentEntity where recruitmentEntity.id=:id");
        query.setParameter("id", entity);
        recruitmentEntity  = (RecruitmentEntity) query.uniqueResult();
        session.getTransaction().commit();
        session.close();
        RecruitmentResponse recruitmentResponse = new RecruitmentResponse();
       recruitmentResponse.setSalary(recruitmentEntity.getSalary());
       recruitmentResponse.setUniqueKey(recruitmentEntity.getUniqueKey());
       recruitmentResponse.setId(recruitmentEntity.getId());
       recruitmentResponse.setMaritalStatus(recruitmentEntity.getMaritalStatus());
       recruitmentResponse.setEntitleNumberOfDays(recruitmentEntity.getEntitleNumberOfDays());
       recruitmentResponse.setEmail(recruitmentEntity.getEmail());
       recruitmentResponse.setStatus(recruitmentEntity.getStatus());
       recruitmentResponse.setDepartment(recruitmentEntity.getDepartment());
       recruitmentResponse.setSex(recruitmentEntity.getSex());
       recruitmentResponse.setEmployeeNumber(recruitmentEntity.getEmployeeNumber());
       recruitmentResponse.setUpdatedAt(recruitmentEntity.getUpdatedAt());
       recruitmentResponse.setNameOfSchool(recruitmentEntity.getNameOfSchool());
       recruitmentResponse.setMiddleName(recruitmentEntity.getMiddleName());
       recruitmentResponse.setLevel(recruitmentEntity.getLevel());
       recruitmentResponse.setFirstName(recruitmentEntity.getFirstName());
       recruitmentResponse.setCreatedAt(recruitmentEntity.getCreatedAt());
       recruitmentResponse.setAge(recruitmentEntity.getAge());
       recruitmentResponse.setSurname(recruitmentEntity.getSurname());
        return recruitmentResponse;
    }

    public ResponeList getAllEmployeeInfo (){
        List<RecruitmentEntity> recruitmentEntities = null;
        session.beginTransaction();
       query = session.createQuery("from RecruitmentEntity recruitmentEntity");
        recruitmentEntities = (List<RecruitmentEntity>)query.list();
        session.getTransaction().commit();
        session.close();
        ResponeList responeList = new ResponeList();
        List<RecruitmentResponse> recruitmentResponses = new ArrayList<>();
        for(RecruitmentEntity recruitmentEntity: recruitmentEntities) {
            RecruitmentResponse recruitmentResponse = new RecruitmentResponse();
           recruitmentResponse.setSurname(recruitmentEntity.getSurname());
           recruitmentResponse.setAge(recruitmentEntity.getAge());
           recruitmentResponse.setCreatedAt(recruitmentEntity.getCreatedAt());
           recruitmentResponse.setFirstName(recruitmentEntity.getFirstName());
           recruitmentResponse.setLevel(recruitmentEntity.getLevel());
           recruitmentResponse.setMiddleName(recruitmentEntity.getMiddleName());
           recruitmentResponse.setNameOfSchool(recruitmentEntity.getNameOfSchool());
           recruitmentResponse.setUpdatedAt(recruitmentEntity.getUpdatedAt());
           recruitmentResponse.setEmployeeNumber(recruitmentEntity.getEmployeeNumber());
           recruitmentResponse.setSex(recruitmentEntity.getSex());
           recruitmentResponse.setDepartment(recruitmentEntity.getDepartment());
           recruitmentResponse.setStatus(recruitmentEntity.getStatus());
           recruitmentResponse.setEmail(recruitmentEntity.getEmail());
           recruitmentResponse.setMaritalStatus(recruitmentEntity.getMaritalStatus());
           recruitmentResponse.setId(recruitmentEntity.getId());
           recruitmentResponse.setUniqueKey(recruitmentEntity.getUniqueKey());
            recruitmentResponses.add(recruitmentResponse);
        }
        responeList.setRecruitmentResponses(recruitmentResponses);
           return  responeList;
        }

        public RecruitmentEntity updateEmployee(Long idOfEmployeeToUp,RecruitmentRequest recruitmentRequest){
            RecruitmentEntity employeeToUpdate = null;
            session.beginTransaction();
            query = session.createQuery("from RecruitmentEntity recruitmentEntity where recruitmentEntity.id=:id");
            query.setParameter("id",idOfEmployeeToUp);
            employeeToUpdate = (RecruitmentEntity) query.uniqueResult();
            if(employeeToUpdate == null){
                throw new ProcessingException("Employee Not Found, Sorry!");
            }
            employeeToUpdate.setSurname(recruitmentRequest.getSurname());
            employeeToUpdate.setStatus(recruitmentRequest.getStatus());
            employeeToUpdate.setSex(recruitmentRequest.getSex());
            employeeToUpdate.setNameOfSchool(recruitmentRequest.getNameOfSchool());
            employeeToUpdate.setMiddleName(recruitmentRequest.getMiddleName());
            employeeToUpdate.setLevel(recruitmentRequest.getLevel());
            employeeToUpdate.setFirstName(recruitmentRequest.getFirstName());
            employeeToUpdate.setAge(recruitmentRequest.getAge());
            employeeToUpdate.setMaritalStatus(recruitmentRequest.getMaritalStatus());
            employeeToUpdate.setDepartment(recruitmentRequest.getDepartment());
            employeeToUpdate.setSalary(recruitmentRequest.getSalary());
            employeeToUpdate.setEmail(recruitmentRequest.getEmail());
            employeeToUpdate.setEmployeeNumber(recruitmentRequest.getEmployeeNumber());
            session.getTransaction().commit();
            session.close();
            return employeeToUpdate;
        }
    }

