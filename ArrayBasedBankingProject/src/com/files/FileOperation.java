package com.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.model.Account;

public class FileOperation {
	
	
	public static void createFile(Account account ) throws IOException {
		FileWriter fw=new FileWriter("accounts.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(account.getAccountNo()+","+account.getAccholderName()+","+account.getAddress()+","+account.getBalance()+","+account.getEmail()+","+account.getPanno()+","+account.getPhNO());
		bw.newLine();
		bw.close();
		System.out.println("Account info saved.");
	}
	
	public static void getAccountInfo() throws IOException {
		String data;
		FileReader fr=new FileReader("accounts.txt");
		BufferedReader br=new BufferedReader(fr);
		
		while((data=br.readLine())!=null){
			System.out.println(data);
		}
		br.close();
	}
	
	public static void getFileInfo() {
		File f=new File("accounts.txt"); 
		if(f.exists()) {
			System.out.println("File Name="+ f.getName());
			System.out.println("File Path="+ f.getAbsolutePath());
			System.out.println("File Length="+f.length());
			System.out.println("File permission of Write="+f.canWrite());
			System.out.println("File permission of Read="+ f.canRead());
		}else {
			System.out.println("File Does not Exist");
		}
			
	}
	
}
