package com.kh.spring.member.model.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



@NoArgsConstructor
//@AllArgsConstructor
@Data
//@Builder
public class Member {
	private int userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private String profileImg;
	private String email;
    private String birthday;
    private String gender;
    private String phone;
    private String address;
    private Date enrollDate;
    private Date modifyDate;
    private String status;
    
    
    
    
    
}
