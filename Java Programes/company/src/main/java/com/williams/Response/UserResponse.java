//package com.williams.Response;
//
//import com.williams.Entity.User;
//import com.williams.constant.Status;
//import com.williams.util.TimeUtil;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class UserResponse {
//
//    private String uniqueKey;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String address;
//    private String roleId;
//    private String phone;
//    private Status status;
//    private String lastLoginDate;
//    private String roleName;
//    private String createdAt;
//    private String updatedAt;
//
//    public  static UserResponse fromUser(User user){
//        if (user == null){
//            return null;
//        }
//        return UserResponse.builder()
//                .uniqueKey(user.getUniqueKey())
//                .firstName(user.getFirstName())
//                .lastName(user.getLastName())
//                .email(user.getEmail())
//                .roleId(user.getRoleId())
//                .phone(user.getPhone())
//                .address(user.getAddress())
//                .status(user.getStatus())
//                .lastLoginDate(TimeUtil.getIsoTime(user.getLastLoginDate()))
//                .createdAt(TimeUtil.getIsoTime(user.getCreatedAt()))
//                .updatedAt(TimeUtil.getIsoTime(user.getUpdatedAt()))
//                .build();
//    }
//
//    public static List<UserResponse> fromUsers(List<User> users) {
//        return users.stream().map(user -> {
//            return fromUser(user);
//        }).collect(
//                Collectors.toList());
//    }
//}
