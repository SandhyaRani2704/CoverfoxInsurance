package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import coverFoxUtility.Utility;
import coverfoxBase.Base;

public class CoverfoxListener extends Base implements ITestListener
{   @Override
	public void onTestFailure(ITestResult result)
	{
		try {
			Utility.ScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
