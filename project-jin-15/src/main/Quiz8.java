package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Quiz8 {

	public static void main(String[] args) {
		
		List<String> fileLst = new ArrayList<String>();
		scanDir("C:\\q", fileLst);
		
		for(String fullPath: fileLst) {
			System.out.println(fullPath);
		} 
		
	}
	

	public static void scanDir(String folderPath, List<String> fileLst) {
		
		File[] files = new File(folderPath).listFiles();
		
		for(File f : files) {
			fileLst.add(f.getPath());
			
			if(f.isDirectory()) {
				scanDir(f.getPath(), fileLst);
			} 
		}
		
	}
	
	
}