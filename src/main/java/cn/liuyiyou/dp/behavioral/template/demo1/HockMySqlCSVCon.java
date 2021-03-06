package cn.liuyiyou.dp.behavioral.template.demo1;

/***
 * @author: liuyiyou
 * @date: 2018/1/24
 */
public class HockMySqlCSVCon extends HockConnectionTemplate {
    @Override
    public void setDBDriver() {
        System.out.println("Setting MySQL DB drivers...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for MySQL DB...");
    }

    @Override
    public void setData() {
        System.out.println("Setting up data from csv file....");
    }

    @Override
    public boolean disableLogging() {
        return false;
    }
}
