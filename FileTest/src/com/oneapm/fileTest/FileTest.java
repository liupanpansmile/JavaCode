package com.oneapm.fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class FileTest {

	public static void FileClassTest()
	{
		File file = new File("d:\\a.data") ;
		boolean isCreatedFile = false ;
		try {
			isCreatedFile = file.createNewFile() ;
			
//			System.out.println(file.getTotalSpace()/(1.0*(1024*1024*1024))); // 返回此抽象路径名指定的分区大小。
//			System.out.println("FileName: "+ file.getName());
//			System.out.println("Absolute Path:" + file.getAbsolutePath());
			
			System.out.println("Can Execute ? " + file.canExecute());
			System.out.println("Can Read ? " + file.canRead());
			System.out.println("Can Write? " + file.canWrite());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getAbsolutePath());
			
			String []list = file.list() ;
			if(list == null)
			{
				System.out.println("null ");
				return ;
			}
			for(String str:list)
			{
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("是否成功创建文件 : " + isCreatedFile);
	}
	
	
	public static void FileInputStreamTest() throws IOException
	{
		FileInputStream fileInputStream = null ;
		//int count = 0 ;
		byte []b = new byte[10] ;
		try {
			fileInputStream = new FileInputStream("d:\\a.data") ;
			while(fileInputStream.read(b) != -1)
			{
				String str = new String(b) ;
				System.out.print(str);
				Arrays.fill(b,(byte) 0);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			fileInputStream.close();
		}
	}
	
	public static void CopyFile(String src,String dest) throws IOException
	{
		FileInputStream input = null ;
		FileOutputStream output = null ;
		byte []buffer = new byte[4096] ;
		int numberRead ;
		
		try {
			input = new FileInputStream(src) ;
			output = new FileOutputStream(dest) ;
			while( (numberRead = input.read(buffer) ) != -1)
			{
				output.write(buffer, 0, numberRead);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			input.close();
			output.close() ;
		}
		
	}
	
	
	public static void ObjectInputStreamTest() throws ClassNotFoundException
	{
		ObjectInputStream objInputStream = null ;
		ObjectOutputStream objOutputStream = null ;
		
		try {
		
			objOutputStream = new ObjectOutputStream(new FileOutputStream("d:\\student.bat")) ;
			
			objOutputStream.writeObject(new Student("zhangsan",21));
			objOutputStream.writeObject(new Student("lisi",22));
			
			objInputStream = new ObjectInputStream(new FileInputStream("d:\\student.bat")) ;
			
			for(int i = 0;i < 2 ;++i)
			{
				Student student = (Student) objInputStream.readObject() ;
				System.out.println(student.toString());
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				objInputStream.close();
				objOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void ConcentateFile(String ...filename)
	{
		String str = null ;
		BufferedWriter bufferdWriter= null ;
		try {
			bufferdWriter = new BufferedWriter(new FileWriter("d:\\result.txt" )) ;
			
			for(String name:filename)
			{
				BufferedReader bufferReader = new BufferedReader(new FileReader(name) ) ;
				while( (str = bufferReader.readLine()) != null)
				{
					bufferdWriter.write(str);
					bufferdWriter.newLine();
				}
				bufferReader.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				bufferdWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		String src = "D:\\src.jpg" ;
//		String dest = "D:\\dest.jpg" ;
//		CopyFile(src, dest);
		
		//ObjectInputStreamTest() ;
		String filename1 = "D:\\1.txt" ;
		String filename2 = "D:\\2.txt" ;
		String filename3 = "D:\\3.txt" ;
		ConcentateFile(filename1,filename2,filename3);
	}

}
