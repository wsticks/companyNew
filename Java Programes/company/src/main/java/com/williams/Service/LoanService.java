package com.williams.Service;

import com.williams.DAO.LoanDao;
import com.williams.Entity.LoanEntity;
import com.williams.Request.LoanRequest;
import com.williams.Response.LoanResponse;
import com.williams.ResponseList.LoanResponseList;
import org.glassfish.jersey.process.internal.RequestScoped;

@RequestScoped
public class LoanService {

    private final LoanDao dao = new LoanDao();

    public LoanEntity saveEmployeeLoanInfo(LoanRequest loanRequest){
        LoanEntity employeeLoanInfo = dao.saveEmployeeLoanInfo(loanRequest);
        return employeeLoanInfo;
    }

   public LoanResponse getLoanInfo(Long id){
        LoanResponse savedLoanInfo = dao.getEmployeesLoanInfo(id);
        return savedLoanInfo;
   }

    public LoanResponseList toGetAllLoan() {
        LoanResponseList loanResponse = dao.toGetAllLoan();
        return loanResponse;

    }

    public LoanResponse updateLoanInfo(Long id, LoanRequest loanRequest){
        LoanEntity updatedStaff = dao.updateLoanInfo(id, loanRequest);
        LoanResponse loanResponse = new LoanResponse();
        loanResponse.setAccountNumber(updatedStaff.getAccountNumber());
        loanResponse.setAmount(updatedStaff.getAmount());
        loanResponse.setBankSortCode(updatedStaff.getBankSortCode());
        loanResponse.setEmployee(updatedStaff.getEmployee());
        loanResponse.setPayeeName(updatedStaff.getPayeeName());
        loanResponse.setPaymentMethod(updatedStaff.getPaymentMethod());
        loanResponse.setPurpose(updatedStaff.getPurpose());
        loanResponse.setRepaymentPeriod(updatedStaff.getRepaymentPeriod());
        loanResponse.setStatus(updatedStaff.getStatus());
        return loanResponse;
    }
}
