import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Simple Java program for Read CSV file.
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class ReadCsv
{
	public static void main(String[] args) 
	{
	
		ReadCsv obj=new ReadCsv();
		obj.run();	
		
	}
	public void run()
	{
		
		String csvFile="D:/a/country.txt";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		try
		{
			
			br=new BufferedReader(new FileReader(csvFile));
			
			while((line=br.readLine())!=null)
			{
				
				String[] Country=line.split(cvsSplitBy);
				
				System.out.println("Country[code="+Country[4]+",name="+Country[5]+"]");
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(br!=null)
			{
				try
				{
					br.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		System.out.println("Completed....");
		
	}

}
