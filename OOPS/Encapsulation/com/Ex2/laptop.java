package com.Ex2;

class laptop 
{
	private int memorySize;
	private String processorName;
	
	public laptop(int memorySize,String processorName)
	{
		this.memorySize=memorySize;
		this.processorName=processorName;
	}
	public String getprocessorName()
	{
		return processorName;
	}
	public int getmemorySize()
	{
		return memorySize;
	}
}
