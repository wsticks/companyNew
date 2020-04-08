//package com.williams.Entity;
//
//import com.williams.constant.Status;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.sql.Timestamp;
//import java.util.Objects;
//
//@Entity
//@Table(name = "user")
//public class User {
//
//    @Id
//    @GeneratedValue
//    private Integer id;
//    private String uniqueKey;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String password;
//    private String phone;
//    private String address;
//    private String roleId;
//    private Status status;
//    private Timestamp lastLoginDate;
//    private Timestamp createdAt;
//    private Timestamp updatedAt;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUniqueKey() {
//        return uniqueKey;
//    }
//
//    public void setUniqueKey(String uniqueKey) {
//        this.uniqueKey = uniqueKey;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getRoleId() {
//        return roleId;
//    }
//
//    public void setRoleId(String roleId) {
//        this.roleId = roleId;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
//
//    public Timestamp getLastLoginDate() {
//        return lastLoginDate;
//    }
//
//    public void setLastLoginDate(Timestamp lastLoginDate) {
//        this.lastLoginDate = lastLoginDate;
//    }
//
//    public Timestamp getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Timestamp createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Timestamp getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(Timestamp updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//
//    @Override
//   public boolean equals(Object o){
//        if (this == o){
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()){
//            return false;
//        }
//        User user = (User) o;
//
//        if (id != null ? !id.equals(user.id) : user.id != null) {
//            return false;
//        }
//        if (uniqueKey != null ? !uniqueKey.equals(user.uniqueKey) : user.uniqueKey != null) {
//            return false;
//        }
//        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) {
//            return false;
//        }
//        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) {
//            return false;
//        }
//        if (email != null ? !email.equals(user.email) : user.email != null) {
//            return false;
//        }
//        if (password != null ? !password.equals(user.password) : user.password != null) {
//            return false;
//        }
//        if (phone != null ? !phone.equals(user.phone) : user.phone != null) {
//            return false;
//        }
//        if (address != null ? !address.equals(user.address) : user.address != null) {
//            return false;
//        }
//        if (roleId != null ? !roleId.equals(user.roleId) : user.roleId != null) {
//            return false;
//        }
//        if (status != user.status) {
//            return false;
//        }
//        if (lastLoginDate != null ? !lastLoginDate.equals(user.lastLoginDate)
//                : user.lastLoginDate != null) {
//            return false;
//        }
//        if (createdAt != null ? !createdAt.equals(user.createdAt) : user.createdAt != null) {
//            return false;
//        }
//        return updatedAt != null ? updatedAt.equals(user.updatedAt) : user.updatedAt == null;
//   }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (uniqueKey != null ? uniqueKey.hashCode() : 0);
//        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
//        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (phone != null ? phone.hashCode() : 0);
//        result = 31 * result + (address != null ? address.hashCode() : 0);
//        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
//        result = 31 * result + (status != null ? status.hashCode() : 0);
//        result = 31 * result + (lastLoginDate != null ? lastLoginDate.hashCode() : 0);
//        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
//        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
//        return result;
//    }
//}
