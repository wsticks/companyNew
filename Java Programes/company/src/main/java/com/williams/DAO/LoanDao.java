package com.williams.DAO;

import com.williams.Entity.LoanEntity;
import com.williams.Request.LoanRequest;
import com.williams.Response.LoanResponse;
import com.williams.ResponseList.LoanResponseList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.security.auth.login.Configuration;
import javax.ws.rs.ProcessingException;
import java.util.ArrayList;
import java.util.List;

public class LoanDao {

    SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();
    Query query;

    public LoanEntity saveEmployeeLoanInfo(LoanRequest loanRequest) {
        LoanEntity employeeLoanInfo = new LoanEntity();
       employeeLoanInfo.setStatus(loanRequest.getStatus());
       employeeLoanInfo.setAccountNumber(loanRequest.getAccountNumber());
       employeeLoanInfo.setAmount(loanRequest.getAmount());
       employeeLoanInfo.setBankSortCode(loanRequest.getBankSortCode());
       employeeLoanInfo.setPayeeName(loanRequest.getPayeeName());
       employeeLoanInfo.setPaymentMethod(loanRequest.getPaymentMethod());
       employeeLoanInfo.setPurpose(loanRequest.getPurpose());
        employeeLoanInfo.setRepaymentPeriod(loanRequest.getRepaymentPeriod());
        employeeLoanInfo.setUniqueKey(loanRequest.getUniqueKey());
       session.save(employeeLoanInfo);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        return employeeLoanInfo;
    }

    public LoanResponse getEmployeesLoanInfo(Long loanEntity) {
        LoanEntity savedLoanInfo = null;
        session.beginTransaction();
        query = session.createQuery("from LoanEntity loanEntity where loanEntity.id=:id");
        query.setParameter("id", loanEntity);
        savedLoanInfo = (LoanEntity) query.uniqueResult();
        session.getTransaction().commit();
        session.close();
        LoanResponse loanResponse = new LoanResponse();
        loanResponse.setAccountNumber(savedLoanInfo.getAccountNumber());
        loanResponse.setAmount(savedLoanInfo.getAmount());
        loanResponse.setBankSortCode(savedLoanInfo.getBankSortCode());
        //loanResponse.setCreatedAt(savedLoanInfo.getCreatedAt());
        loanResponse.setEmployee(savedLoanInfo.getEmployee());
        loanResponse.setPayeeName(savedLoanInfo.getPayeeName());
        loanResponse.setPaymentMethod(savedLoanInfo.getPaymentMethod());
        loanResponse.setPurpose(savedLoanInfo.getPurpose());
        loanResponse.setRepaymentPeriod(savedLoanInfo.getRepaymentPeriod());
        loanResponse.setStatus(savedLoanInfo.getStatus());
        loanResponse.setUniqueKey(savedLoanInfo.getUniqueKey());
        //loanResponse.setUpdatedAt(savedLoanInfo.getUpdatedAt());
        loanResponse.setId(savedLoanInfo.getId());
        return loanResponse;
    }

    public LoanResponseList toGetAllLoan() {
        List<LoanEntity> savedEmployeeInfo = null;
        session.beginTransaction();
        query = session.createQuery("from LoanEntity loanEntity");
        savedEmployeeInfo = (List<LoanEntity>) query.list();
        session.getTransaction().commit();
        session.close();
        LoanResponseList allLoanResponse = new LoanResponseList();
        List<LoanResponse> loanResponses = new ArrayList<>();
        for (LoanEntity loanEntity : savedEmployeeInfo) {
            LoanResponse loanResponse1 = new LoanResponse();
//            loanResponse1.setUniqueKey(loanEntity.getUniqueKey());
            loanResponse1.setStatus(loanEntity.getStatus());
            loanResponse1.setRepaymentPeriod(loanEntity.getRepaymentPeriod());
            loanResponse1.setPurpose(loanEntity.getPurpose());
            loanResponse1.setPaymentMethod(loanEntity.getPaymentMethod());
            loanResponse1.setPayeeName(loanEntity.getPayeeName());
            loanResponse1.setEmployee(loanEntity.getEmployee());
            //loanResponse1.setCreatedAt(loanEntity.getCreatedAt());
            loanResponse1.setBankSortCode(loanEntity.getBankSortCode());
            loanResponse1.setAmount(loanEntity.getAmount());
            loanResponse1.setAccountNumber(loanEntity.getAccountNumber());
            loanResponse1.setId(loanEntity.getId());
            loanResponses.add(loanResponse1);
        }
        allLoanResponse.setLoanResponses(loanResponses);
        return allLoanResponse;
    }

    public LoanEntity updateLoanInfo(Long idOfEmployeetoUpdate, LoanRequest loanRequest){
        LoanEntity employeeToUpdate = null;
        session.beginTransaction();
        query = session.createQuery("from LoanEntity loanEntity where loanEntity.id=:id");
        query.setParameter("id",idOfEmployeetoUpdate);
        employeeToUpdate = (LoanEntity) query.uniqueResult();
        if(employeeToUpdate == null){
            throw new ProcessingException("Employee does not exist");
        }
        employeeToUpdate.setRepaymentPeriod(employeeToUpdate.getRepaymentPeriod());
        employeeToUpdate.setPurpose(employeeToUpdate.getPurpose());
        employeeToUpdate.setPaymentMethod(employeeToUpdate.getPaymentMethod());
        employeeToUpdate.setPayeeName(employeeToUpdate.getPayeeName());
        employeeToUpdate.setEmployee(employeeToUpdate.getEmployee());
        employeeToUpdate.setBankSortCode(employeeToUpdate.getBankSortCode());
        employeeToUpdate.setAmount(employeeToUpdate.getAmount());
        employeeToUpdate.setStatus(employeeToUpdate.getStatus());
        employeeToUpdate.setAccountNumber(employeeToUpdate.getAccountNumber());
        session.getTransaction().commit();
        return employeeToUpdate;
    }
}
