package com.epam.customCollection;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan=new Scanner(System.in);
    	CustomList<String> lis=new CustomList<String>();
    	while(true)
    	{
    		System.out.println("Select the options\n1.Print the list\n2.Add elements\n3.Delete element at a particular position\n4.Fetch data at position\n5.Size of the list\n6.break");
			int s=scan.nextInt();
			if(s==6)
			{
				System.out.println("Process successfully stopped");
				break;
			}
			switch(s)
			{
				case 1:
					int len=lis.size();
					System.out.print("The elements of the list are : ");
					for(int i=0;i<len;i++)
					{
						String value=(String)lis.get(i);
						System.out.print(value+" ");
					}
					System.out.println();
					break;
				case 2:
					System.out.print("Enter the element to be added : ");
					String ele=scan.next();
					lis.add(ele);
					break;
				case 3:
					System.out.print("Enter the index of the element to be deleted : ");
					int pos=scan.nextInt();
					int res=lis.remove(pos-1);
					if(res==1)
						System.out.println("Element deleted");
					else
						System.out.println("Element is not deleted");
					break;
				case 4:
					System.out.print("Enter the position of the element to be retrieved : ");
					int a=scan.nextInt();
					a=a-1;
					if(a>=lis.size() || a<0)
						System.out.println("Index out of bounds!!!Enter valid index");
					else
						System.out.println("Element at the index "+a+" is "+lis.get(a));
					break;
				case 5:
					System.out.println("Size of the list is : "+lis.size());
					break;
				default:
					System.out.println("Enter a valid choise");
					break;
			}
    	}
    	scan.close();
    }
}
