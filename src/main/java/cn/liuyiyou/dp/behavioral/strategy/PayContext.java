package cn.liuyiyou.dp.behavioral.strategy;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 不使用工厂模式
 *
 * @author: liuyiyou.cn
 * @date: 2020/3/17
 * @version: V1.0
 */
@Component
public class PayContext implements InitializingBean {

  private static Map<Integer, PayService> strategyMap = new ConcurrentHashMap<>();

  @Autowired
  private PayService alipayService;

  @Autowired
  private PayService wxPayService;

  @Autowired
  private PayService unionPayService;

  public String pay(Integer payType) {
    PayService payService = strategyMap.get(payType);
    return payService.payTemplate();
  }

  @Autowired
  private List<PayService> payServiceList;

  @Override
  public void afterPropertiesSet() {
    strategyMap.put(PayType.ALIPAY.getCode(), alipayService);
    strategyMap.put(PayType.UNIONPAY.getCode(), wxPayService);
    strategyMap.put(PayType.WXPAY.getCode(), unionPayService);

//    for (PayService payService : payServiceList) {
//      final PayType[] values = PayType.values();
//      for (PayType payType : values) {
//        strategyMap.put(payType.getCode(), payService);
//      }

  }
}
