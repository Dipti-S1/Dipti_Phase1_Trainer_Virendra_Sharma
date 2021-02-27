package Lockedme.com;
import java.util.*;
import java.io.File;
import java.io.IOException;


public class Application_Prototype {

	public static void main(String[] args) throws IOException
	{
		
		
//Take user Option from the below mentioned Menu
             
        System.out.println("****************************************************************");
        System.out.println("*********************  LOCKED ME. COM  ********************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("*****************DEVELOPED BY DIPTI SUNAL**********************************************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println(" Operations performed by Application");
        System.out.println(" 1. Retrieving file in Ascending Order");
        System.out.println(" 2. Add a User Specified File");
        System.out.println(" 3. Delete a user specified file");
        System.out.println(" 4. Search a user specified file");
        System.out.println(" 5. Close the current execution");
        System.out.println();
        
        System.out.println("Enter Your Choice:");
        int num = input.nextInt();   
         
           switch(num)
           {    
            case 1: System.out.println("Retrieving file in Ascending Order"); 
										            File fileDir = new File("G:\\JavaTraining\\Folder1");
										    		if(fileDir.isDirectory()){
										    			List<String> listFile = Arrays.asList(fileDir.list());
										    			System.out.println("Listing files unsorted");
										    			
										    			for(String s:listFile){
										    				System.out.println(s);
										    			}
										    			Collections.sort(listFile);
										    			System.out.println("---------------------------------------");
										    			System.out.println("Sorting by filename in ascending order");
										    			for(String s:listFile){
										    				System.out.println(s);
										    			}
										    			/*System.out.println("---------------------------------------");
										    			System.out.println("Sorting by filename in descending order");
										    			Collections.sort(listFile,Collections.reverseOrder());
										    			for(String s:listFile){
										    				System.out.println(s);
										    			}*/
										
										    		}
										    		else{
										    			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
										    		}
										
										    	break;
            case 2:System.out.println("Add a User Specified File");
			                   try {        
							            File file = null;
							            File dir = new File("G:\\JavaTraining\\Folder1");
							            file = File.createTempFile("JavaTemp",".javatemp.txt", dir);
							            System.out.println(file.getPath());
			                   } 
			                   catch(IOException e)
			                   {
			                	   e.printStackTrace();
			                   }
							            
			                  break;
            case 3:System.out.println("Delete a User Specified File");
		            File file1 = new File("G:\\JavaTraining\\Folder1\\2.txt"); //file is passed in the path
		            
		            if(file1.delete()) 
		            { 
		                System.out.println("File deleted successfully"); 
		            } 
		            else
		            { 
		                System.out.println("Failed to delete the file as File Not Found"); 
		            } 
            	   break;
            case 4:System.out.println("Search a User Specified File");
				            class FindFile 
				            {
				                public void findFile(String name,File file)
				                {
				                    File[] list = file.listFiles();
				                    if(list!=null)
				                    for (File fil : list)
				                    {
				                        if (fil.isDirectory())
				                        {
				                            findFile(name,fil);
				                        }
				                        else if (name.equalsIgnoreCase(fil.getName()))
				                        {
				                            System.out.println(fil.getParentFile());
				                        }
				                    }
				                }
				            }
                            break;
            case 5: System.out.println("5.Navigate back to the program");
                     boolean done=true;
                     while(!done)
                     return;
            case 6 :System.out.println("6. Close the current execution"); 
                        System.exit(0);
                                      
        }
     
   }
 }
