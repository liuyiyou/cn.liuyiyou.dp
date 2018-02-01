package cn.liuyiyou.dp.structural.adapter.demo3;

/**
 * User: liuyiyou
 * Date: 14-8-12
 * Time: 下午5:05
 */
public class AppleAdapter extends Apple {

    private Orange orange;

    public AppleAdapter(Orange orange) {
        this.orange = orange;
    }

    @Override
    public void getAColor(String color) {
        orange.getOColor(color);
    }
}
