package cn.liuyiyou.dp.structural.strategy;

/**
 * @author: liuyiyou.cn
 * @date: 2020/3/17
 * @version: V1.0
 */
public enum PayType {

  ALIPAY(1),
  WXPAY(2),
  UNIONPAY(3);

  private int code;

  PayType(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
}
