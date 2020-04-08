package com.williams.Service;

import com.williams.DAO.RecruitmentDao;
import com.williams.Entity.RecruitmentEntity;
import com.williams.Request.RecruitmentRequest;
import com.williams.Response.RecruitmentResponse;
import com.williams.ResponseList.ResponeList;

public class RecruitmentService {

    private final RecruitmentDao dao = new RecruitmentDao();

    public RecruitmentEntity saveEmployee(RecruitmentRequest recruitmentRequest){
        RecruitmentEntity recruitmentEntity = dao.saveEmployee(recruitmentRequest);
        return recruitmentEntity;
    }

    public RecruitmentResponse getEmployeeInfo (Long id){
        RecruitmentResponse recruitmentResponse = dao.getEmployeeInfo(id);
        return recruitmentResponse;
    }

    public ResponeList getAllEmployeeInfo (){
        ResponeList responeList = dao.getAllEmployeeInfo();
        return responeList;
    }

    public RecruitmentResponse updateEmployee(Long id, RecruitmentRequest recruitmentRequest){
        RecruitmentEntity updatedEmployee = dao.updateEmployee(id,recruitmentRequest);
        RecruitmentResponse recruitmentResponse = new RecruitmentResponse();
        recruitmentResponse.setAge(updatedEmployee.getAge());
        recruitmentResponse.setId(updatedEmployee.getId());
        recruitmentResponse.setMaritalStatus(updatedEmployee.getMaritalStatus());
        recruitmentResponse.setEmail(updatedEmployee.getEmail());
        recruitmentResponse.setStatus(updatedEmployee.getStatus());
        recruitmentResponse.setDepartment(updatedEmployee.getDepartment());
        recruitmentResponse.setSex(updatedEmployee.getSex());
        recruitmentResponse.setEmployeeNumber(updatedEmployee.getEmployeeNumber());
        recruitmentResponse.setNameOfSchool(updatedEmployee.getNameOfSchool());
        recruitmentResponse.setMiddleName(updatedEmployee.getMiddleName());
        recruitmentResponse.setLevel(updatedEmployee.getLevel());
        recruitmentResponse.setFirstName(updatedEmployee.getFirstName());
        recruitmentResponse.setAge(updatedEmployee.getAge());
        recruitmentResponse.setSurname(updatedEmployee.getSurname());
        recruitmentResponse.setSalary(updatedEmployee.getSalary());
        return recruitmentResponse;
    }
}
