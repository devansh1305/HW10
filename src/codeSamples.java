import java.io.*;

public class codeSamples {
    public static void printer(File f) throws Exception{
        //f=new File("matrix1.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String line;
        int counter=0;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) throws Exception{
        File f=new File("matrix1.txt");
        printer(f);
        File f1=new File("output.txt");
        FileWriter fw=new FileWriter(f1);
        fw.write("Hello World!\n");
        fw.write("CS180 is awesome!");
        fw.close();
        printer(f1);

    }
}
