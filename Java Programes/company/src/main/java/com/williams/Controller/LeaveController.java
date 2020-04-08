package com.williams.Controller;


import com.williams.Entity.LeaveEntity;
import com.williams.Request.LeaveRequest;
import com.williams.Response.LeaveResponse;
import com.williams.ResponseList.LeaveResponseList;
import com.williams.ResponseList.LoanResponseList;
import com.williams.Service.LeaveService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Path("leave")
@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LeaveController {

    private  final LeaveService leaveService = new LeaveService();

    @POST
    public LeaveEntity toSaveEmployeeLEave(LeaveRequest leaveRequest){
        LeaveEntity toSaveEmployeeLeaveRecord = leaveService.toSaveEmployeeLEave(leaveRequest);
        return toSaveEmployeeLeaveRecord;
    }

    @Path("{id}")
    @GET
    public LeaveResponse getLeaveInfo(@PathParam("id") Long id){
        LeaveResponse leaveResponse = leaveService.getLeaveInfo(id);
        return  leaveResponse;
    }

    @GET
    public LeaveResponseList getAllLeaveInfo(){
        LeaveResponseList leaveResponseList = leaveService.getAllLeaveInfo();
        return leaveResponseList;
    }

    @PUT
    @Path("{id}")
    public LeaveResponse employeeLeaveToUpdate(@PathParam("id") Long id, LeaveRequest leaveRequest) {
        LeaveResponse employeeLeaveUpdate = leaveService.employeeLeaveToUpdate(id, leaveRequest);
        return employeeLeaveUpdate;
    }

}
