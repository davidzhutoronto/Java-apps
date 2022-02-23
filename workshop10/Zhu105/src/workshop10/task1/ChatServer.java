package workshop10.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public static void main(String[] args) {

        final Scanner sc=new Scanner(System.in);

        try {
        	ServerSocket serverSocket = new ServerSocket(3000);
        	final Socket clientSocket;
        	clientSocket = serverSocket.accept();
            
        	PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
        	BufferedReader in = new BufferedReader (new InputStreamReader(clientSocket.getInputStream()));

            Thread sender= new Thread(new Runnable() {
                String msg; 
                @Override   
                public void run() {
                    while(true){
                        msg = sc.nextLine(); 
                        out.println(msg);   
                        out.flush();   
                    }
                }
            });
            sender.start();

            Thread receiver = new Thread(new Runnable() {
                String message ;
                @Override
                public void run() {
                    try {
                        message = in.readLine();
                        
                        while(message != null){
                            System.out.println("Client : "+ message);
                            message = in.readLine();
                        }

                        System.out.println("Client");

                        out.close();
                        clientSocket.close();
                        serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		}
	}