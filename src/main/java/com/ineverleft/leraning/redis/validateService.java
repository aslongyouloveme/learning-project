package com.ineverleft.leraning.redis;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSON;
import com.ineverleft.leraning.model.IntegralTaskJson;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Set;
import java.util.stream.Collectors;

/** @Author: LY @Program: ky-ow-task-service @Description: @Create: 2021-01-25 16:23 */
@Service
public class validateService<T> {
  private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

  public void validateObject(String json, String taskKey) {
    if (taskKey.startsWith("IntegralTask")) {
      IntegralTaskJson integralTaskJson = JSON.parseObject(json, IntegralTaskJson.class);
      validate(integralTaskJson, json, taskKey);
    }
  }

  private void validate(Object o, String json, String taskKey) {
    Set<ConstraintViolation<Object>> constraintViolations = factory.getValidator().validate(o);
    if (CollectionUtil.isNotEmpty(constraintViolations)) {
      String msg = constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining());
      throw new RuntimeException( msg);
    }
  }
}
