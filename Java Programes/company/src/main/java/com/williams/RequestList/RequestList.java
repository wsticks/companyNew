package com.williams.RequestList;

import com.williams.Request.RecruitmentRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestList {

    List<RecruitmentRequest> requestList;
}
