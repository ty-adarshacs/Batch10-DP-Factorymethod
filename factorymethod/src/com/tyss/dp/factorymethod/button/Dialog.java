package com.tyss.dp.factorymethod.button;

public abstract class Dialog {

	public void renderWindow() {
		Button okButton=createButton();
		okButton.rendering();
	}
	
	//subclasses has to override this method to create specific button
	public abstract Button createButton();

}
