package cn.liuyiyou.dp.behavioral.template;

import cn.liuyiyou.dp.behavioral.strategy.PayService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: liuyiyou.cn
 * @date: 2020/3/17
 * @version: V1.0
 */
@Slf4j
public abstract class AbstractPayService implements PayService {

  public String payTemplate() {
    addLogs();
    String result = pay();
    log.info(result);
    addPayNotify();
    return result;
  }

  protected void addPayNotify() {
    log.info("增加支付回调");
  }

  protected void addLogs() {
    log.info("增加日志");
  }


}
