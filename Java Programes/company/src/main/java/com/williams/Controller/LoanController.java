package com.williams.Controller;

import com.williams.Entity.LoanEntity;
import com.williams.Request.LoanRequest;
import com.williams.Response.LoanResponse;
import com.williams.ResponseList.LoanResponseList;
import com.williams.Service.LoanService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Path("loan")
@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LoanController {

    private  final LoanService loanService = new LoanService();

    @POST
    public LoanEntity saveEmployeeLoanInfo(LoanRequest loanRequest){
        LoanEntity employeeLoanInfo = loanService.saveEmployeeLoanInfo(loanRequest);
        return employeeLoanInfo;
    }

    @GET
    @Path("{id}")
    public LoanResponse getLoanInfo(@PathParam("id") Long employeeNumber){
        LoanResponse savedLoanInfo = loanService.getLoanInfo(employeeNumber);
        return savedLoanInfo;
    }

    @GET
    public LoanResponseList toGetAllLoan() {
        LoanResponseList loanResponse = loanService.toGetAllLoan();
        return loanResponse;
    }

    @PUT
    @Path("{id}")
    public LoanResponse updateLoanInfo(@PathParam("id") Long id, LoanRequest loanRequest){
        LoanResponse loanResponse = loanService.updateLoanInfo(id,loanRequest);
        return loanResponse;
    }
}
