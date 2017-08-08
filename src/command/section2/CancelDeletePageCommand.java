package com.company.section2;

public class CancelDeletePageCommand extends Command
{

	@Override
	public void execute()
	{
		// TODO Auto-generated method stub
		super.pg.rollBack();
	}

}
