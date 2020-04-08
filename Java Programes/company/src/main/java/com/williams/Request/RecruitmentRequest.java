package com.williams.Request;

import com.williams.constant.MaritalStatus;
import com.williams.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecruitmentRequest {


    private String surname;
    private String firstName;
    private String middleName;
    private String sex;
    private String age;
    private MaritalStatus maritalStatus;
    private String employeeNumber;
    private String nameOfSchool;
    private String level;
    private Status status;
    private String email;
    private String department;
    private String salary;
}
