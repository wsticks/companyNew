package com.williams.ResponseList;

import com.williams.Response.LeaveResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LeaveResponseList {

    List<LeaveResponse> leaveResponses;
}
