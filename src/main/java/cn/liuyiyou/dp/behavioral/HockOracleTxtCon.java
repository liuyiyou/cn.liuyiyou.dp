package cn.liuyiyou.dp.behavioral;

/***
 * @author: liuyiyou
 * @date: 2018/1/24
 */
public class HockOracleTxtCon extends HockConnectionTemplate {

    @Override
    public void setDBDriver() {
        System.out.println("Setting Oracle DB drivers...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for Oracle DB...");
    }

    @Override
    public void setData() {
        System.out.println("Setting up data from txt file....");
    }
}


