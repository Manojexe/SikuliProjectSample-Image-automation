package com.sikuli;

import org.junit.Assert;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class SikuliCalculator {

	public static void main(String[] args) throws FindFailed {
		
		Screen s = new Screen();
		s.find("C:\\Users\\mselvaraj\\RemoteDesktop.png");
		s.type(Key.WIN, Key.UP);
//		//C:\\Users\\mselvaraj\\images\\img.png
//		try {
//			s.find("C:\\Users\\mselvaraj\\eclipse-workspace\\SikuliX\\ImageFiles\\ima.png");
//			s.click();
//			//Assert.assertEquals("FindFailed", s);
//		} catch (FindFailed e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
