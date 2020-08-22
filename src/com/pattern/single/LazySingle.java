package com.pattern.single;

/**
 * @ClassName LazySingle
 * @Description 懒汉式单例模式
 * @author: cdf
 * @Date: 2020-08-22 14:29
 **/
public class LazySingle {

	private LazySingle() {
	}

	private volatile static LazySingle lazySingle;

	public LazySingle getLazySingle() {
		if (lazySingle == null) {
			synchronized (LazySingle.class) {
				if (lazySingle == null) {
					/**
					 *不是原子操作
					 * 1.分配内存
					 * 2.构造方法，初始化
					 * 3.对象指向地址
					 * 指令重排
					 */
					lazySingle = new LazySingle();
				}
			}
		}
		return lazySingle;
	}
}
