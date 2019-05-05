package Singleton;
/**
*@author ZHGQ
*@project Gof-23pattern 
*@Package Singleton
*@date 2019��3��6��--����3:04:08
*@Description: ���Զ���ʽ����ģʽ
*@Copyright: (c) 2019 USTC. All rights reserved.
*/
public class SingletonDemo1 {
	
	//���ʼ��ʱ���������������û���ӳټ��ص����ƣ���������ʱ����Ȼ�����̰߳�ȫ��
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	private SingletonDemo1() {	
	}
	
	//����û��ͬ��������Ч�ʸߣ�
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}

