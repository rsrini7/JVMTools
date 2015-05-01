package com.srini.jvm.tools;

import com.sun.tools.attach.VirtualMachine;

/**
 * The Class Tools.
 */
public class Tools {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		VirtualMachine.list().forEach(s -> System.out.println(s));
	}
}
