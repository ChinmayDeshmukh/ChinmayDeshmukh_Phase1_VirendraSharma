package project.jav.lockedme3;
import java.util.Scanner;
import  java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class MainMenu {
public static void main(String[] args) throws IOException{
//welcome screen
	System.out.println("****************************************************************");
	 System.out.println("*********************  LOCKED ME. COM  ********************");
	 System.out.println("****************************************************************");
	 System.out.println();
	System.out.println(   "\n **{Devloped by :- Chinmay Deshmukh} **");
System.out.println("\n");
//take user option from the below mentioned menu 
System.out.println("1> view files from list");
System.out.println("2> select to edit directory");
System.out.println("3> Exit the application\n");

//setting user input through scanner
Scanner input = new  Scanner(System.in);
System.out.println("Enter your choice:\n");
int in = input.nextInt();
switch(in){
case 1: System.out.println("files list :-\n");
File f = new File("C:\\Users\\Chinmay\\Documents\\Lockedme\\");
String[] s = f.list();
Arrays.sort(s);
if(s==null){
	System.out.println("Does not exit");
}else{
	for(int i=0;i<s.length;i++){
		String filename = s[i];
		System.out.println(filename);
	}}
	main(args);
break;

case 2:  System.out.println("::MORE OPTIONS::");
         System.out.println("1> Create file");
         System.out.println("2> Delete file");
         System.out.println("3> Search file");
         System.out.println("Enter your choice:");
         int in1 = input.nextInt();
         
         switch(in1){
         
         case 1:System.out.println("Creating file...........");
         
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter file name:");
         String filename = scanner.nextLine();
     
         try{
        	 File file = new File("C:\\Users\\Chinmay\\Documents\\Lockedme\\"+ filename);
	if (file.createNewFile()){
		System.out.println("New file created.");
	}
	else{
		if(file.exists())
		{
			System.out.println("File already exists");
			System.out.println("file path:"+file.getAbsolutePath());
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
         }
         catch(IOException e){
e.printStackTrace();        	 
         }
         break;
         
         case 2:System.out.println("Deleting file");
         Scanner sc = new Scanner( System.in );
         System.out.println("Enter file name to delete:");
         
         String file1 = sc.nextLine();
         File file = new File("C:\\Users\\Chinmay\\Documents\\Lockedme\\"+ file1);
         	if(file.delete()) {
         		System.out.println("file deleted ");
         	}else{
         		System.out.println("file does not exists");
         	}
         		break;
         		
          case 3: System.out.println("Searching for file");
                  Scanner sc1 =new Scanner(System.in);
                  System.out.println("Please enter name of the file");
         
                 String file2 = sc1.nextLine();
                 File file3 = new File("C:\\Users\\Chinmay\\Documents\\Lockedme\\" +file2);
                 if(file3.exists()){
        	     System.out.println("file exists");
         }else{
        	 System.out.println("File does not exist");
         }
         break;
         }
case 4:System.out.println("Exit");
         Scanner sc = new Scanner(System.in);
 		System.out.println("Are you sure to exit?");
 		System.out.println("\n (Y)-> YES    To close the Application?");
 		System.out.println("\n (N)->  NO    return to main Menu ");
 		String exit = sc.next();	
 		if(exit.equals("y")||exit.equals("\n Y \n")){
 			System.out.println("****************************************************************");
 			System.out.println("\t         THANK YOU FOR USING LOCKED ME ");	
 			System.out.println("****************************************************************");
 		}
 		else if(exit.equals("\n n \n")||exit.equals("\n N \n")){
 			main(args);
 			}
 		else{
 			System.out.println("\n To confirm, press Y or N ");
 			main(args);
         }


     
}
}}