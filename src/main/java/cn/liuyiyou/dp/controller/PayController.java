package cn.liuyiyou.dp.controller;

import cn.liuyiyou.dp.structural.strategy.PayContext;
import cn.liuyiyou.dp.structural.strategy.PayFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuyiyou.cn
 * @date: 2020/3/17
 * @version: V1.0
 */
@RestController
public class PayController {

  @Autowired
  private PayFactory payFactory;

  @Autowired
  private PayContext payContext;

  @GetMapping("pay")
  public String pay(@RequestParam("type") Integer payType) {
    return payFactory.getPayService(payType).pay();
  }


  @GetMapping("payTemplate")
  public String payTemplate(@RequestParam("type") Integer payType) {
    return payFactory.getPayService(payType).payTemplate();
  }


  @GetMapping("payContext")
  public String payContext(@RequestParam("type") Integer payType) {
    return payContext.pay(payType);
  }
}
