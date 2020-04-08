package com.williams.Response;

import com.williams.constant.PaymentMethod;
import com.williams.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanResponse {

    private Long id;
    private String uniqueKey;
    private String employee;
    private String purpose;
    private String amount;
    private String repaymentPeriod;
    private PaymentMethod paymentMethod;
    private String payeeName;
    private BigDecimal accountNumber;
    private String bankSortCode;
    private Status status;
    private String createdAt;
    private String updatedAt;
}
