package Singleton;
/**
*@author ZHGQ
*@project Gof-23pattern 
*@Package Singleton
*@date 2019��3��6��--����3:20:08
*@Description: TODO
*@Copyright: (c) 2019 USTC. All rights reserved.
*/
public class SingletonDemo2 {
	
	//���ʼ��ʱ������ʼ�������ӳټ��أ������õ�ʱ���ٹ��죩
	private static SingletonDemo2 instance;
	
	//����ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo2 getInstance() {
		if(instance==null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}

