package cn.liuyiyou.dp.behavioral.strategy;

import cn.liuyiyou.dp.behavioral.template.AbstractPayService;
import org.springframework.stereotype.Service;

/**
 * @author: liuyiyou.cn
 * @date: 2020/3/17
 * @version: V1.0
 */
@Service
public class WxPayService   extends AbstractPayService implements PayService {

  @Override
  public boolean support(int payType) {
    return payType == PayType.WXPAY.getCode();
  }

  @Override
  public String pay() {
    return "微信支付";
  }
}
