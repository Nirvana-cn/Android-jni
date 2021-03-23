package com.example.jni;

public class Test {
	static {
		System.loadLibrary("hello_jni");
	}
	
	// 步骤2:定义在JNI中实现的方法
	public static native String getFromJNI();
}
