package com.company.multiconcretefactory;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all.
 */
public class BlackHumanFactory extends AbstractHumanFactory
{

	public Human createHuman()
	{
		return new BlackHuman();
	}
}
