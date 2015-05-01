package com.srini.jvm.tools;

import com.sun.tools.attach.VirtualMachine;

public class Tools {

	public static void main(String[] args) {
		VirtualMachine.list().forEach(s -> System.out.println(s));
	}
}
