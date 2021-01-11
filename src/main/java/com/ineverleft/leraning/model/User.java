package com.ineverleft.leraning.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Description @ClassName User @Author ineverleft
 *
 * @date 2021.01.08 18:16
 */
@Entity(name = "usertb")
public class User {
  @Id
  private Long id;
  private String uname;
  private Date ucreatetime;
  private Integer age;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public Date getUcreatetime() {
    return ucreatetime;
  }

  public void setUcreatetime(Date ucreatetime) {
    this.ucreatetime = ucreatetime;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
