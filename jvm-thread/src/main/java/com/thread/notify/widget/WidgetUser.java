package com.thread.notify.widget;

/**
 * @author gaoquan on 2017/9/25
 */
public class WidgetUser extends Thread {
	private WidgetMaker maker;

	public WidgetUser(String name, WidgetMaker maker) {
		super(name);
		this.maker = maker;
	}

	public void run() {
		Widget w = maker.waitForWidget();
		System.out.println(getName() + "got a widget");
	}


	public static void main(String[] args) {
		WidgetMaker maker = new WidgetMaker();
		maker.start();
		new WidgetUser("Lenny", maker).start();
		new WidgetUser("Moe", maker).start();
		new WidgetUser("Curly", maker).start();

	}

}