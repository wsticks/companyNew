package com.williams.ResponseList;

import com.williams.Response.LeaveResponse;
import com.williams.Response.LoanResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanResponseList {

    List<LoanResponse> loanResponses;
}
