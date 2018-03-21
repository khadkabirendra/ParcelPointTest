package com.biren.rarms;

import org.junit.Assert;
import org.junit.Test;

public class RarmsTest {

	@Test
	public void initialCommandTest1() {
		
		Rarms arm=new Rarms();
		
		String result=arm.simulateArm("FD{foo}");
		
		String expection="{A -- >[\"foo\"],B -- >[],C -- >[],D -- >[],E -- >[]}";
		Assert.assertEquals(expection, result);
		
		
	}
	@Test
	public void initialCommandTest2() {
		
		
		
		Rarms arm=new Rarms();
		
		String result=arm.simulateArm("FD{foo}FFD{bar}RFFD{Foo}RFFD{World}");
		
		String expection="{A -- >[\"foo\"],B -- >[\"Foo\",\"World\"],C -- >[],D -- >[\"bar\"],E -- >[]}";
		Assert.assertEquals(expection, result);
		
		
	}
	

}
