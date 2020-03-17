package cn.liuyiyou.dp.behavioral.strategy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: liuyiyou.cn
 * @date: 2020/3/17
 * @version: V1.0
 */
@Component
public class PayFactory {


  @Autowired
  private List<PayService> payServiceList;

  public PayService getPayService(Integer payType) {
    for (PayService payService : payServiceList) {
      if (payService.support(payType)) {
        return payService;
      }
    }
    throw new UnsupportedOperationException("unsupported request: " + payType);
  }

}
