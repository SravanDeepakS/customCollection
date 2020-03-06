package com.epam.customCollection;

import java.util.Arrays;

public class CustomList<T>
{
	public Object obj[]=new Object[10];
	public int len=0;
	public int size=10;
	public CustomList()
	{
		for(int i=0;i<10;i++)
			obj[len++]=String.valueOf(i+1);
	}
	
	public void add(T data)
	{
		if(len>=size)
		{
			memoryAllocate();
		}
		obj[len++]=String.valueOf(data);
	}
	private void memoryAllocate() 
	{
	       int newSize = (obj.length*3)/2+1;
	       size=newSize;
	       obj = Arrays.copyOf(obj, newSize);
	}
	
	public Object get(int index) 
	{
		if(index>=0 && index<len)
			return obj[index];
		return null;
	}
	
	public int remove(int index)
	{
		if(index>=0 && index<len)
		{
			int del = len - ( index + 1 ) ;
		    System.arraycopy(obj, index + 1,obj,index,del) ;
		    len=len-1;
		    return 1;
		}		
		return 0;
	}
	
	public int size() 
	{
		return len;
	}

}
