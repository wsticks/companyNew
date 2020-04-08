package com.williams.Controller;

import com.williams.Entity.Department;
import com.williams.Request.DepartmentRequest;
import com.williams.Service.DepartmentService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;


@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("department")
public class DepartmentController {

    private final DepartmentService service = new DepartmentService();

    @POST
    public Department saveDepartment(DepartmentRequest departmentRequest) {
        Department departmentToSave = service.saveDepartment(departmentRequest);
        return departmentToSave;
    }
}
