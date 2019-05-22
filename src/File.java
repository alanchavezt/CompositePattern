public class File extends FileSystemComponent
{

	File (String name)
	{
		super.name = name;
	}

	public void listall()
	{
		System.out.println(indent.toString() + getName());
	}
	
	public int getCount()
	{
		return 1;
	}
	public int countall()
	{
		return 1;
	}
	
	public FileSystemComponent chdir(String fileName)
	{
		return null;
	}
}