// Practice program: simple file write/read using java.io

import java.io.*;

public class FileIODemo
{
    public static void main(String[] args)
    {
        String filename = "sample_output.txt";
        try (PrintWriter out = new PrintWriter(new FileWriter(filename)))
        {
            out.println("Hello from FileIODemo");
            out.println("Line 2");
        }
        catch (IOException e)
        {
            System.out.println("Write error: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
