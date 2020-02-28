package com.javalearning.multithread.threadjoin_demo;

import java.util.Random;

public class ServiceThree extends IService {


	@Override
	public void start() {
		try {
			int rd = new Random().nextInt(5);
			Thread.sleep(rd*1000);
			System.out.println("Done service 3");
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
	}

}
