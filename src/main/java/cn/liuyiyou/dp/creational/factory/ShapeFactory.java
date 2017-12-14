/** 
 * Project Name:cn.liuyiyou.dp 
 * File Name:ShapeFactory.java 
 * Package Name:cn.liuyiyou.dp.factory 
 * Date:2017年7月25日下午2:00:18 
 * Copyright (c) 2017, www.daojia.com All Rights Reserved. 
 * 
 */
package cn.liuyiyou.dp.creational.factory;

/**
 * 名称: ShapeFactory <br/>
 * 
 * @author liuyiyou.cn
 * @date 2017年7月25日
 * @version 6.0.0
 */
public class ShapeFactory {

	/**
	 * use getShape method to get object of type shape
	 * @param shapeType
	 * @return
	 * @author liuyiyou.cn
	 */
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
