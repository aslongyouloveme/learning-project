package com.ineverleft.leraning.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Description @ClassName IntegralTaskJson @Author ineverleft
 *
 * @date 2021.01.25 15:36
 */
public class IntegralTaskJson {
  @NotBlank(message = "buttonText不能为空")
  private String buttonText;
  @NotBlank(message = "awardType不能为空")
  private String awardType;
  @NotNull(message = "awardAmount不能为空")
  private Long awardAmount;
  @NotBlank(message = "channelUrl不能为空")
  private String channelUrl;
  @NotBlank(message = "description不能为空")
  private String description;
  @NotBlank(message = "getButton不能为空")
  private String getButton;
  @NotBlank(message = "showButton不能为空")
  private String showButton;



  public IntegralTaskJson() {
  }

  public IntegralTaskJson(@NotBlank(message = "buttonText不能为空") String buttonText, @NotBlank(message = "awardType不能为空") String awardType, @NotNull(message = "awardAmount不能为空") Long awardAmount, @NotBlank(message = "channelUrl不能为空") String channelUrl, @NotBlank(message = "description不能为空") String description, @NotBlank(message = "getButton不能为空") String getButton, @NotBlank(message = "showButton不能为空") String showButton) {
    this.buttonText = buttonText;
    this.awardType = awardType;
    this.awardAmount = awardAmount;
    this.channelUrl = channelUrl;
    this.description = description;
    this.getButton = getButton;
    this.showButton = showButton;
  }

  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  public String getGetButton() {
    return getButton;
  }

  public void setGetButton(String getButton) {
    this.getButton = getButton;
  }

  public String getShowButton() {
    return showButton;
  }

  public void setShowButton(String showButton) {
    this.showButton = showButton;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDisplayAward() {
    return buttonText;
  }

  public void setDisplayAward(String displayAward) {
    this.buttonText = displayAward;
  }

  public String getAwardType() {
    return awardType;
  }

  public void setAwardType(String awardType) {
    this.awardType = awardType;
  }

  public Long getAwardAmount() {
    return awardAmount;
  }

  public void setAwardAmount(Long awardAmount) {
    this.awardAmount = awardAmount;
  }

  public String getChannelUrl() {
    return channelUrl;
  }

  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }
}
