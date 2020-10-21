package com.login.backend.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class User {
  private Integer user_no;
  private String user_id;
  private String user_role;
  private String user_nm;
  private String user_passwd;
  private String user_email;
  private String user_tel;
  private String reg_dt;
  private String del_dt;
}
