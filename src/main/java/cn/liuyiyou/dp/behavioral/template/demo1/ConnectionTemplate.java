package cn.liuyiyou.dp.behavioral.template.demo1;

/***
 * @author: liuyiyou
 * @date: 2018/1/24
 */
public abstract class ConnectionTemplate {

    public final void run() {
        setDBDriver();
        setCredentials();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();
    }

    public abstract void setDBDriver();

    public abstract void setCredentials();

    public void connect() {
        System.out.println("Setting connection...");
    }

    public void prepareStatement() {
        System.out.println("Preparing insert statement...");
    }

    public abstract void setData();

    public void insert() {
        System.out.println("Inserting data...");
    }

    public void close() {
        System.out.println("Closing connections...");
    }

    public void destroy() {
        System.out.println("Destroying connection objects...");
    }
}