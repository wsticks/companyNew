package com.williams.Response;

import com.williams.DAO.RecruitmentDao;
import com.williams.constant.MaritalStatus;
import com.williams.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecruitmentResponse {

    private Long id;
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
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String uniqueKey;
    private String email;
    private String department;
    private String entitleNumberOfDays;
    private String salary;
}
