package com.sikuli;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class SikuliAuto {

	public static void main(String[] args) throws FindFailed {


		@SuppressWarnings("unused")
		Pattern pattern=new Pattern("C:\\Users\\mselvaraj\\Downloads\\MicrosoftTeams-image.png");
	//StringSelection usernameText=new StringSelection("username");
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(usernameText, null);
		  Screen s = new Screen(); 
          s.find("C:\\Users\\mselvaraj\\Downloads\\MicrosoftTeams-image.png");
          s.doubleClick();
          s.type(Key.TAB);
		

	}

}
