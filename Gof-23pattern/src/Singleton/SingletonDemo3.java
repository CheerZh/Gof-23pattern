package Singleton;
/**
*@author ZHGQ
*@project Gof-23pattern 
*@Package Singleton
*@date 2019��3��6��--����3:20:08
*@Description: ��̬�ڲ���ʵ�ֵ���ģʽ������Ч�ʸߣ�����ʵ�����ӳټ���
*@Copyright: (c) 2019 USTC. All rights reserved.
*/
public class SingletonDemo3 {
	//��̬�ڲ���ʵ�ֵ���ģʽ������Ч�ʸߣ�����ʵ�����ӳټ���
	private static class SingletonClassInstance{
		private static final SingletonDemo3 instance =new SingletonDemo3();
	}
	
	private SingletonDemo3() {
		
	}
	
	public static SingletonDemo3 getInstance() {
		return SingletonClassInstance.instance;
	}
}

