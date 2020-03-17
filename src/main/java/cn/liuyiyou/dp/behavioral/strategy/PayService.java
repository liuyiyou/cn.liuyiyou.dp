package cn.liuyiyou.dp.behavioral.strategy;

/**
 * 统一支付接口
 *
 * @author: liuyiyou.cn
 * @date: 2020/3/17
 * @version: V1.0
 */
public interface PayService {

  String pay();

  String payTemplate();

  boolean support(int payType);
}
