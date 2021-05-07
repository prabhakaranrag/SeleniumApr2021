package org.system;

public class Desktop extends Computer {

	private void deskTopSize() {
		System.out.println("Desktop Size is 22 inches");

	}
	public static void main(String[] args) {

	Desktop desk = new Desktop();
	desk.computerModel();
	desk.deskTopSize();

	}

}
