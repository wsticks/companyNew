package com.williams.Entity;

import com.williams.constant.LeaveType;
import com.williams.constant.Status;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "leaveinfo")
public class LeaveEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uniqueKey;
    private String numberOfDays;
    private String startDate;
    private String endDate;
    private LeaveType leaveType;
    private String employeeNumber;
    private String pendingLeaveDays;
    private Status status;
    @UpdateTimestamp
    private Timestamp updatedAt;
    @CreationTimestamp
    private Timestamp createdAt;

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

    public String getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(String numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public LeaveType getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getPendingLeaveDays() {
        return pendingLeaveDays;
    }

    public void setPendingLeaveDays(String pendingLeaveDays) {
        this.pendingLeaveDays = pendingLeaveDays;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeaveEntity that = (LeaveEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(uniqueKey, that.uniqueKey) &&
                Objects.equals(numberOfDays, that.numberOfDays) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate) &&
                leaveType == that.leaveType &&
                Objects.equals(employeeNumber, that.employeeNumber) &&
                Objects.equals(pendingLeaveDays, that.pendingLeaveDays) &&
                status == that.status &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uniqueKey, numberOfDays, startDate, endDate, leaveType, employeeNumber, pendingLeaveDays, status, updatedAt, createdAt);
    }
}
