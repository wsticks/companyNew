package com.williams.RequestList;

import com.williams.Request.LeaveRequest;
import com.williams.Request.LoanRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LeaveRequestList {

    List<LoanRequest> loanRequests;
}
