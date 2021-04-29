package com.tyss.dp.factorymethod.button;

public class HtmlButton implements Button {

	@Override
	public void rendering() {
		System.out.println("<button><button/>");
		onclicking();
		
	}

	@Override
	public void onclicking() {
		System.out.println(" onclicjing html button");
		
	}

}
