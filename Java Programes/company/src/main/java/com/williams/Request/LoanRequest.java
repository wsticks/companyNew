package com.williams.Request;

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
public class LoanRequest {

    private Long id;
    private String employeeUniquekey;
    private String purpose;
    private String amount;
    private String repaymentPeriod;
    private PaymentMethod paymentMethod;
    private String payeeName;
    private BigDecimal accountNumber;
    private String bankSortCode;
    private Status status;
    private String uniqueKey;
}
