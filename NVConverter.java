package edu.learn.something;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NVConverter {

	public static void main(String[] args) throws IOException {
		List<NameValuePair> keyVal = new ArrayList<NameValuePair>();	
		InputStream is = new FileInputStream("C:\\Users\\POS1897\\Desktop\\test.txt");	
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
        String line = buf.readLine();
		StringBuilder sb = new StringBuilder();
		        
		while(line != null){
			String data[] = line.split("=");
			if (data.length == 2) {
				NameValuePair n = new NameValuePair();
				n.setName(data[0]);
				n.setValue(data[1]);
				keyVal.add(n);
			}
		   sb.append(line).append("\n");
		   line = buf.readLine();
			}
		System.out.println(keyVal);
	}
}
