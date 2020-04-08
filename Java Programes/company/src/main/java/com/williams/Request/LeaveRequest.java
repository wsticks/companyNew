package com.williams.Request;

import com.williams.constant.LeaveType;
import com.williams.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LeaveRequest {

    private String numberOfDays;
    private String startDate;
    private String endDate;
    private LeaveType leaveType;
    private Status status;
    private String employeeUniqueKey;
    private String uniqueKey;
}
