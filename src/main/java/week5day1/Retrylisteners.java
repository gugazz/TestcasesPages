package week5day1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;
	public class Retrylisteners implements IAnnotationTransformer,IRetryAnalyzer
	{
		int retry=1;
		@Override
		public void transform(ITestAnnotation Annotation, Class Listenerclass , Constructor Listenerconstructor, Method Listenermethod) {
			
			// TODO Auto-generated method stub
			Annotation.setRetryAnalyzer(this.getClass());
			if(!Listenermethod.getName().equalsIgnoreCase("createLead"))
			{
				Annotation.setEnabled(false);
			}
				}

		@Override
		public boolean retry(ITestResult iresult) {
			// TODO Auto-generated method stub
			if(!iresult.isSuccess()&&retry<2)
					{
				retry++;
				
					
			return true;
		}
			return false;

		
		}

		
		
	}

		// TODO Auto-generated method stub

	


