package com.williams.DAO;

import com.williams.Entity.LeaveEntity;
import com.williams.Request.LeaveRequest;
import com.williams.Response.LeaveResponse;
import com.williams.ResponseList.LeaveResponseList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.ws.rs.ProcessingException;
import java.util.ArrayList;
import java.util.List;

public class LeaveDao {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();
    Query query;

    public LeaveEntity toSaveEmployeeLEave(LeaveRequest leaveRequest){
        LeaveEntity saveLeaveInfo = new LeaveEntity();
        saveLeaveInfo.setEmployeeNumber(leaveRequest.getEmployeeUniqueKey());
        saveLeaveInfo.setEndDate(leaveRequest.getEndDate());
        saveLeaveInfo.setLeaveType(leaveRequest.getLeaveType());
        saveLeaveInfo.setNumberOfDays(leaveRequest.getNumberOfDays());
        saveLeaveInfo.setPendingLeaveDays(leaveRequest.getNumberOfDays());
        saveLeaveInfo.setStartDate(leaveRequest.getStartDate());
        saveLeaveInfo.setStatus(leaveRequest.getStatus());
        saveLeaveInfo.setUniqueKey(leaveRequest.getUniqueKey());
        session.save(saveLeaveInfo);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        return saveLeaveInfo;
    }

    public LeaveResponse getLeaveInfo(Long leaveEntity){
        LeaveEntity saveLeaveInfo = null;
        session.beginTransaction();
        query = session.createQuery("from LeaveEntity leaveEntity where id=:id");
        query.setParameter("id",leaveEntity);
        saveLeaveInfo = (LeaveEntity) query.uniqueResult();
        session.getTransaction().commit();
        session.close();
        LeaveResponse leaveInfo = new LeaveResponse();
        leaveInfo.setId(saveLeaveInfo.getId());
        leaveInfo.setUniqueKey(saveLeaveInfo.getUniqueKey());
        leaveInfo.setCreatedAt(String.valueOf(saveLeaveInfo.getCreatedAt()));
        leaveInfo.setEmployeeNumber(saveLeaveInfo.getEmployeeNumber());
        leaveInfo.setEndDate(saveLeaveInfo.getEndDate());
        leaveInfo.setLeaveType(saveLeaveInfo.getLeaveType());
        leaveInfo.setNumberOfDays(saveLeaveInfo.getNumberOfDays());
        leaveInfo.setPendingLeaveDays(saveLeaveInfo.getPendingLeaveDays());
        leaveInfo.setStartDate(saveLeaveInfo.getStartDate());
        leaveInfo.setStatus(saveLeaveInfo.getStatus());
        leaveInfo.setUpdatedAt(String.valueOf(saveLeaveInfo.getUpdatedAt()));
        leaveInfo.setUniqueKey(saveLeaveInfo.getUniqueKey());
        return leaveInfo;
    }

public LeaveResponseList getAllLeaveInfo(){
        List<LeaveEntity> getAllInfo = null;
        session.beginTransaction();
        query = session.createQuery("from LeaveEntity leaveEntity");
        getAllInfo =(List<LeaveEntity> ) query.list();
        session.getTransaction().commit();
        session.close();
        LeaveResponseList leaveResponseList = new LeaveResponseList();
        List<LeaveResponse> leaveResponses = new ArrayList<>();
        for(LeaveEntity leaveEntity : getAllInfo){
        LeaveResponse leaveResponse = new LeaveResponse();
        leaveResponse.setId(leaveEntity.getId());
        leaveResponse.setUpdatedAt(String.valueOf(leaveEntity.getUpdatedAt()));
        leaveResponse.setStatus(leaveEntity.getStatus());
        leaveResponse.setStartDate(leaveEntity.getStartDate());
        leaveResponse.setPendingLeaveDays(leaveEntity.getPendingLeaveDays());
        leaveResponse.setNumberOfDays(leaveEntity.getNumberOfDays());
        leaveResponse.setLeaveType(leaveEntity.getLeaveType());
        leaveResponse.setEndDate(leaveEntity.getEndDate());
        leaveResponse.setEmployeeNumber(leaveEntity.getEmployeeNumber());
        leaveResponse.setCreatedAt(String.valueOf(leaveEntity.getCreatedAt()));
        leaveResponse.setUniqueKey(leaveEntity.getUniqueKey());

        leaveResponses.add(leaveResponse);
        }
        leaveResponseList.setLeaveResponses(leaveResponses);
        return leaveResponseList;
        }

public LeaveEntity employeeLeaveToUpdate(Long idOfEmployeeToUpdate, LeaveRequest leaveRequest) {
        LeaveEntity employeeToUpdate = null;
        session.beginTransaction();
        query = session.createQuery("from LeaveEntity leaveEntity where id=:id");
        query.setParameter("id", idOfEmployeeToUpdate);
        employeeToUpdate = (LeaveEntity) query.uniqueResult();
        if (employeeToUpdate == null) {
        throw new ProcessingException("Employee does not exist!");
        }
        employeeToUpdate.setUniqueKey(leaveRequest.getUniqueKey());
        employeeToUpdate.setStatus(leaveRequest.getStatus());
        employeeToUpdate.setStartDate(leaveRequest.getStartDate());
        employeeToUpdate.setPendingLeaveDays(leaveRequest.getNumberOfDays());
        employeeToUpdate.setNumberOfDays(leaveRequest.getNumberOfDays());
        employeeToUpdate.setLeaveType(leaveRequest.getLeaveType());
        employeeToUpdate.setEndDate(leaveRequest.getEndDate());
        employeeToUpdate.setEmployeeNumber(leaveRequest.getEmployeeUniqueKey());
        session.getTransaction().commit();
        session.close();
        return employeeToUpdate;
        }
        }
