package com.williams.Entity;

import com.williams.constant.MaritalStatus;
import com.williams.constant.Status;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name ="employees" )
public class RecruitmentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String surname;
    private String firstName;
    private String middleName;
    private String sex;
    private String age;
    private MaritalStatus maritalStatus;
    private String employeeNumber;
    private String nameOfSchool;
    private String level;
    private Status status;
    private String uniqueKey;
    private String email;
    private String department;
    private String entitleNumberOfDays;
    private String salary;
    @CreationTimestamp
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEntitleNumberOfDays() {
        return entitleNumberOfDays;
    }

    public void setEntitleNumberOfDays(String entitleNumberOfDays) {
        this.entitleNumberOfDays = entitleNumberOfDays;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "RecruitmentEntity{" +
                "Id=" + Id +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", nameOfSchool='" + nameOfSchool + '\'' +
                ", level='" + level + '\'' +
                ", status=" + status +
                ", uniqueKey='" + uniqueKey + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", entitleNumberOfDays='" + entitleNumberOfDays + '\'' +
                ", salary='" + salary + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecruitmentEntity that = (RecruitmentEntity) o;
        return Objects.equals(Id, that.Id) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(middleName, that.middleName) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(age, that.age) &&
                maritalStatus == that.maritalStatus &&
                Objects.equals(employeeNumber, that.employeeNumber) &&
                Objects.equals(nameOfSchool, that.nameOfSchool) &&
                Objects.equals(level, that.level) &&
                status == that.status &&
                Objects.equals(uniqueKey, that.uniqueKey) &&
                Objects.equals(email, that.email) &&
                Objects.equals(department, that.department) &&
                Objects.equals(entitleNumberOfDays, that.entitleNumberOfDays) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Id, surname, firstName, middleName, sex, age, maritalStatus, employeeNumber, nameOfSchool, level, status, uniqueKey, email, department, entitleNumberOfDays, salary, createdAt, updatedAt);
    }
}
