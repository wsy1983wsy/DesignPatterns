package com.company.abstractfactory_human;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all.
 */
public abstract class AbstractWhiteHuman implements Human
{

	// ��ɫ���ֵ���ɫ�ǰ�ɫ��
	public void getColor()
	{
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ�ģ�");
	}

	// ��ɫ���ֽ���
	public void talk()
	{
		System.out.println("��ɫ���ֻ�˵����һ�㶼�ǵ��ǵ��ֽڡ�");

	}

}