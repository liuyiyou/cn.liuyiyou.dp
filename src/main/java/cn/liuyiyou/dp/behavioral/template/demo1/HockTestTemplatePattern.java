package cn.liuyiyou.dp.behavioral.template.demo1;

/***
 * @author: liuyiyou
 * @date: 2018/1/24
 */
public class HockTestTemplatePattern {

    public static void main(String[] args) {
        System.out.println("For MYSQL....");
        HockConnectionTemplate template = new HockMySqlCSVCon();
        template.run();
        System.out.println("For Oracle...");
        template = new HockOracleTxtCon();
        template.run();
    }
}
