package com.tvm.test.crontroller;

import com.tvm.service.api.Test;

public class TVMIndex {
	public static void sendText() {
	    Test	test = new Test();
		System.out.print(test.builder("hello"));
	}
	public static void main(String args[]){
		TVMIndex index=new TVMIndex();
		index.sendText();
		System.out.println("git is ok");
		
		System.out.println("git is ok");
		System.out.println("git is ok");
	}
}
