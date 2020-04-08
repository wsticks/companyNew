package com.williams.Response;

import com.williams.constant.LeaveType;
import com.williams.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LeaveResponse {

    private Long id;
    private String uniqueKey;
    private String numberOfDays;
    private String startDate;
    private String endDate;
    private LeaveType leaveType;
    private String employeeNumber;
    private String pendingLeaveDays;
    private Status status;
    private String createdAt;
    private String updatedAt;
}
