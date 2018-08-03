package co.com.bancolombia.certification.google.ui;

import net.serenitybdd.core.pages.PageObject;

public enum Webpage {
		
	GOOGLE(new GoogleHomePage());
	
	
	private final PageObject page;
	
	Webpage(PageObject page)
	{
		this.page=page;
	}
	
	public PageObject page()
	{
		return this.page;
	}

}
