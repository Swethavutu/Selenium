package Amazonpage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

  public class closing extends Operation{
	  @AfterTest
	  public void close()
	  {
		  d.close();
	  }
	  
}
