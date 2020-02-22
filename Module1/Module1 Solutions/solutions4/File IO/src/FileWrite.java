import java.io.*;
public class FileWrite {

public static void main(String args[]) throws IOException 
{
    String fileContent = "Hello Learner !! Welcome";
    String employee = "Dimple";
     
    //BufferedWriter writer = new BufferedWriter(new FileWriter("E:/output.txt"));
    FileWriter writer = new FileWriter("E:/output.txt");
    writer.write(fileContent);
    writer.write(employee);
    writer.close();
}
}