import java.io.*;


public class FileParse {

    public static int countWords(String fileName, String searchWord) throws Exception {

        int counter=0;
        File filename=new File((fileName));
        BufferedReader br=new BufferedReader(new FileReader(filename));
        String line;
        while((line=br.readLine())!=null){
            if(line.contains(searchWord)){
                counter++;
            }
        }
        br.close();
        System.out.println("Total number of occurrences: "+counter);
        return counter;
    }

    public static boolean deleteLine(String fileName, int lineNum) throws Exception {

        int counter=0;
        File filename=new File((fileName));
        BufferedReader br=new BufferedReader(new FileReader(filename));
        String line;
        while((line=br.readLine())!=null){
            counter++;
        }
        br.close();

        String[] fileArray=new String[counter];
        File filename1=new File((fileName));
        BufferedReader br1=new BufferedReader(new FileReader(filename1));
        String line1;
        int counter1=0;
        while((line1=br1.readLine())!=null){
            fileArray[counter1]=line1;
            counter1++;
        }
        br1.close();
        if(lineNum>fileArray.length){
            System.out.println("Line not found");
            return false;
        }
        if(lineNum<1){
            System.out.println("Line not found");
            return false;
        }
        for(int i=0;i<fileArray.length;i++){
            if(lineNum==(i+1)){
                fileArray[i]=null;
                System.out.println("Line deleted!");
            }
        }

        File out=new File(fileName);
        FileWriter fw=new FileWriter(out);
        for(int i=0;i<fileArray.length;i++){
            if(fileArray[i]==(null)) {

            }
            else{
                fw.write(fileArray[i] + "\n");
                fw.flush();
            }
        }
        fw.close();
        return true;

    }

    public static int refactor(String fileName, String original, String replace) throws Exception {

        int counter=0;
        File filename=new File((fileName));
        BufferedReader br=new BufferedReader(new FileReader(filename));
        String line;
        while((line=br.readLine())!=null){
            counter++;
        }
        br.close();

        String[] fileArray=new String[counter];
        File filename1=new File((fileName));
        BufferedReader br1=new BufferedReader(new FileReader(filename1));
        String line1;
        int counter1=0;
        while((line1=br1.readLine())!=null){
            fileArray[counter1]=line1;
            counter1++;
        }
        br1.close();

        int repcount=0;
        for(int i=0;i<fileArray.length;i++){
            if (fileArray[i].contains(original)){
                System.out.println(fileArray[i]);
                System.out.println(original);
                fileArray[i]=fileArray[i].replaceAll(original,replace);
                System.out.println(fileArray[i]);
                repcount++;
            }
        }

        File out=new File(fileName);
        FileWriter fw=new FileWriter(out);
        for(int i=0;i<fileArray.length;i++){
            fw.write(fileArray[i]+"\n");
            fw.flush();
        }
        fw.close();

        if(repcount>0){
            System.out.println("Number of words replaced: "+repcount);
        }else System.out.println("No words found");

        return repcount;
    }

    public static void main(String[] args) throws Exception{
        //int count=countWords("sampleRead.txt","dev");
        //System.out.println(count);
       // deleteLine("sampleRead.txt",2);
        refactor("sampleRead.txt","sehaj","kot");

    }
}