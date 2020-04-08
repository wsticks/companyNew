package com.williams.Controller;

import com.williams.Entity.RecruitmentEntity;
import com.williams.Request.RecruitmentRequest;
import com.williams.Response.RecruitmentResponse;
import com.williams.ResponseList.ResponeList;
import com.williams.Service.RecruitmentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Path("employees")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Provider
public class RecruitmentController {

    private final RecruitmentService service = new RecruitmentService();

    @POST
    public RecruitmentEntity saveEmployee(RecruitmentRequest recruitmentRequest){
        RecruitmentEntity recruitmentEntity = service.saveEmployee(recruitmentRequest);
        return recruitmentEntity;
    }

    @GET
    @Path("{id}")
    public RecruitmentResponse getEmployeeInfo (@PathParam("id") Long id){
        RecruitmentResponse recruitmentResponse = service.getEmployeeInfo(id);
        return recruitmentResponse;
    }

    @GET
    public ResponeList getAllEmployeeInfo (){
        ResponeList responeList = service.getAllEmployeeInfo();
        return responeList;
    }

    @PUT
    @Path("{id}")
    public RecruitmentResponse updateEmployee(@PathParam("id") Long id, RecruitmentRequest recruitmentRequest){
        RecruitmentResponse recruitmentResponse = service.updateEmployee(id, recruitmentRequest);
        return recruitmentResponse;
    }
}
