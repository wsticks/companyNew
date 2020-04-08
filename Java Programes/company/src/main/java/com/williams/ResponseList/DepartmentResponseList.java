package com.williams.ResponseList;

import com.williams.Response.DepartmentResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentResponseList {

    List<DepartmentResponse> departmentResponseList;
}
