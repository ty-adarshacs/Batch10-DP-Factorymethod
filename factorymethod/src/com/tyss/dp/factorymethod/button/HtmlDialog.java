package com.tyss.dp.factorymethod.button;

public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new HtmlButton();
	}

}
