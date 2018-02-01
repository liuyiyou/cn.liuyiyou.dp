package cn.liuyiyou.dp.creational.staticfactory.demo1;

/**
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午4:49
 */
public class HumanFacotry {

    public static Human createHuman(String m){
        Human human = null;
        if(m.equals("boy")){
            human = new Boys();
        }else if (m.equals("girl")){
            human = new Girls();
        }

        return human;
    }
}
