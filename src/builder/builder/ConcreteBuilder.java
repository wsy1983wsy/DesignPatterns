package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all.
 */
public class ConcreteBuilder extends Builder
{
	private Product product = new Product();

	// ���ò�Ʒ���
	public void setPart()
	{
		/*
		 * ��Ʒ���ڵ��߼�����
		 */
	}

	// �齨һ����Ʒ
	public Product buildProduct()
	{
		return product;
	}

}
