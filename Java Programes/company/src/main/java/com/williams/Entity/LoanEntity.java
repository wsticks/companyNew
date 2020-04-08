package com.williams.Entity;

import com.williams.constant.PaymentMethod;
import com.williams.constant.Status;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "laon")
public class  LoanEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
//    @CreationTimestamp
//    private Timestamp createdAt;
//    @UpdateTimestamp
//    private Timestamp updatedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRepaymentPeriod() {
        return repaymentPeriod;
    }

    public void setRepaymentPeriod(String repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public BigDecimal getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BigDecimal accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankSortCode() {
        return bankSortCode;
    }

    public void setBankSortCode(String bankSortCode) {
        this.bankSortCode = bankSortCode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanEntity that = (LoanEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(uniqueKey, that.uniqueKey) &&
                Objects.equals(employee, that.employee) &&
                Objects.equals(purpose, that.purpose) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(repaymentPeriod, that.repaymentPeriod) &&
                paymentMethod == that.paymentMethod &&
                Objects.equals(payeeName, that.payeeName) &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(bankSortCode, that.bankSortCode) &&
                status == that.status;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uniqueKey, employee, purpose, amount, repaymentPeriod, paymentMethod, payeeName, accountNumber, bankSortCode, status);
    }
}
