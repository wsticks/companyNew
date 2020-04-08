package com.williams.Service;

import com.williams.DAO.LeaveDao;
import com.williams.Entity.LeaveEntity;
import com.williams.Request.LeaveRequest;
import com.williams.Response.LeaveResponse;
import com.williams.ResponseList.LeaveResponseList;

public class LeaveService {

    private final LeaveDao leaveDao = new LeaveDao();

    public LeaveEntity toSaveEmployeeLEave(LeaveRequest leaveRequest){
        LeaveEntity toSaveEmployeeLeaveRecord = leaveDao.toSaveEmployeeLEave(leaveRequest);
        return toSaveEmployeeLeaveRecord;
    }

    public LeaveResponse getLeaveInfo(Long id){
        LeaveResponse leaveResponse = leaveDao.getLeaveInfo(id);
        return  leaveResponse;
    }

    public LeaveResponseList getAllLeaveInfo(){
        LeaveResponseList leaveResponseList = leaveDao.getAllLeaveInfo();
        return leaveResponseList;
    }

    public LeaveResponse employeeLeaveToUpdate(Long id, LeaveRequest leaveRequest) {
        LeaveEntity updateEmployee = leaveDao.employeeLeaveToUpdate(id, leaveRequest);
        LeaveResponse leaveResponse = new LeaveResponse();
        leaveResponse.setId(updateEmployee.getId());
        leaveResponse.setUniqueKey(updateEmployee.getUniqueKey());
       leaveResponse.setEmployeeNumber(updateEmployee.getEmployeeNumber());
       leaveResponse.setEndDate(updateEmployee.getEndDate());
       leaveResponse.setLeaveType(updateEmployee.getLeaveType());
       leaveResponse.setNumberOfDays(updateEmployee.getNumberOfDays());
       leaveResponse.setPendingLeaveDays(updateEmployee.getPendingLeaveDays());
       leaveResponse.setStartDate(updateEmployee.getStartDate());
       leaveResponse.setStatus(updateEmployee.getStatus());
        return leaveResponse;
    }
}
