package com.williams.Request;

import com.williams.Entity.Department;
import com.williams.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentRequest /* implements Serializable*/{

        private String name;
        private String description;
        private Status status;
        private String uniqueKey;


//        public Department toDepartment(){
//            Department department = new Department();
//            department.setName(name);
//            department.setDescription(description);
//            department.setStatus(status);
//            return department;
//        }

}
