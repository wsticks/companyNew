package com.williams.Response;

import com.mysql.jdbc.TimeUtil;
import com.williams.Entity.Department;
import com.williams.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentResponse {

    private Integer id;
    private String uniqueKey;
    private String name;
    private String description;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;

//    public static DepartmentResponse fromDepartment(Department department){
//        return DepartmentResponse.builder()
//               // .createdAt(Timestamp.valueOf(department.getCreatedAt()))
//                //.updatedAt(Timestamp.valueOf(department.getUpdatedAt()))
//                .status(String.valueOf(department.getStatus()))
//                .uniqueKey(department.getUniqueKey())
//                .description(department.getDescription())
//                .name(department.getName())
//                .build();
//    }
//
//    public static List<DepartmentResponse> fromDepartments(List<Department> departments) {
//        return departments.stream().map(department -> {
//            return fromDepartment(department);
//        }).collect(
//                Collectors.toList());
//    }

}
