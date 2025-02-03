import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class fileOper 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int value;
        String name = "";

        do 
        {
            System.out.println("\nEnter Your Choice");
            System.out.println("1. Create a File");
            System.out.println("2. Write to a File");
            System.out.println("3. Read a File");
            System.out.println("4. Modify the File");
            System.out.println("5. Exit\n");
            value = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            switch (value) 
            {

                case 1: // Create a File
                    System.out.println("Enter the name of the file (with extension):");
                    name = sc.nextLine();
                    try {
                        File fs = new File(name);
                        if (fs.createNewFile()) {
                            System.out.println("File created successfully: " + name);
                        } else {
                            System.out.println("File already exists: " + name);
                        }
                    } catch (IOException e) {
                        System.out.println("An error occurred while creating the file: " + e.getMessage());
                    }
                    break;
            }
           
        }while(value!=5);

    }

}