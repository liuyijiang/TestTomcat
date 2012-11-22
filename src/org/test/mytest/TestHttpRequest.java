package org.test.mytest;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TestHttpRequest {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int port = 8080;
		ServerSocket serverSocket = null;
		serverSocket =  new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
		InputStream input = null;
	    OutputStream output = null;
		while(true){
			 Socket socket = null;
			 socket = serverSocket.accept();
		     input = socket.getInputStream();
		     DataInputStream dis = new DataInputStream(input);
		     BufferedInputStream bis = new BufferedInputStream(input);
		    // bis.r
		     //bis.r
		     String str = null;
		     StringBuffer sb = new StringBuffer();
		     int i;
		     byte[] buffer = new byte[2048];
		     i = input.read(buffer);
//		     while((str=dis.readUTF()) != null){
//		    	 sb.append(str);
//		     }
		     for (int j=0; j<i; j++) {
		         sb.append((char) buffer[j]);
		       }
		     System.out.println(sb.toString());
		     
		}
	}

}
