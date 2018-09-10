package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.time.Instant;

public class Steam1 {
	public static void main(String[] args) throws Exception {
		long l1=System.currentTimeMillis();
		File file=new File("/home/biao/mydb.db");
		FileInputStream inputStream=new FileInputStream(file);
		System.out.println("mydb.db文件的大小:\n"+file.length());
		File file2=new File("/home/biao/copydb.db");
		if(!file2.exists()) file2.createNewFile();
		FileOutputStream outputStream=new FileOutputStream(file2);
		byte[] b=new byte[1024];
		while(inputStream.read(b)!=-1) {
			outputStream.write(b);
		}
		System.out.println("文件复制成功");
		System.out.println("copydb.db文件的大小：\n"+file2.length());
		Thread.sleep(2000);
		long l2=System.currentTimeMillis();
		System.out.println(l2-l1);
	}
}