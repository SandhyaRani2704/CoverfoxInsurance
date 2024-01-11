package dataProviderUse;

import org.testng.annotations.DataProvider;

public class FBDataProvider 
{
	@DataProvider(name="FBRegression")
	
	public static String[][] fbDataSet()
	{
		String data[][]= {{"Sandhyarani","Kshirsagar","8208833940"},{"Prachi","Kshirsagar","9845375629"},{"Omraje","Kshirsagar","9856453829"}};
	    return data;
	}
	
	@DataProvider(name="Sanity")
	
	public static String[][] fbDataSet1()
	{
		String data1[][]= {{"Sandhya","Gaikwad","8207845285"},{"ABC","DEF","9865482309"},{"GHI","JKL","8876564987"}};
	    return data1;
	}
  
}
