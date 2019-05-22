
public class CompositeTestDriver
{
	public static void main(String[] args)
	{
		String fileName = "directory.dat";
	
	    Explorer explorer = new Explorer(DirectoryFactory.createDirectoryTree(fileName));
	    explorer.process();
	}
}
