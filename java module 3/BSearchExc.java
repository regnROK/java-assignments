class BSearchExc extends Exception
{
	public static void main(String args[])
	{
	int a[]={10,20,30,40,50,60,70,80};
	int lb=0,ub=0,item=90,mid=0;

	try 
	{
	while(lb<=ub){
	mid=(lb+ub)/2;
	if(a[mid]==item)
	lb=mid+1;
	else 
	ub=mid-1;

	if(lb>ub)
	throw new ArrayIndexOutOfBoundsException();
	}}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Index out of bounds");
	}
	finally{
	if(lb<=ub)
	System.out.println("Item found at index:"+mid);
	else
	System.out.println("Item not found in the array");
	}
	}

}