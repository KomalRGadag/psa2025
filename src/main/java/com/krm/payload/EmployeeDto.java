package com.krm.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



//@Data     //will give both setter and getter

@Getter
@Setter
public class EmployeeDto {

    private Long id;

    @NotBlank
    @Size(min=3, message = "At least 3 char required")
    private String name;

    @Email
    private String emailId;

    @Size(min= 10, max=10, message = "Should be 10 digits")
    private String mobile;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

//    public void setId(Long id) {
//    }
//
//    public void setName(String name) {
//    }
//
//    public void setEmail(String emailId) {
//    }
//
//    public void setMobile(String mobile) {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return emailId;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//}

