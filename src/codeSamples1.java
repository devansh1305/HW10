import java.io.*;
public class codeSamples1 {
    public static void mAddition(String matrixAfileName, String matrixBfileName) throws Exception{
        int[][] m1= new int[4][4];
        int[][] m2= new int[4][4];

        File f1=new File(matrixAfileName);
        FileReader fr1=new FileReader(f1);
        BufferedReader br1=new BufferedReader(fr1);
        String line1;
        int i1=0;
        //String[][] lineArray=new String[4][4];
        String[] lineArray1=new String[4];
        while((line1=br1.readLine())!=null){
            lineArray1=line1.split(" ");
            //System.out.println(lineArray1[0]+lineArray1[1]+lineArray1[2]+lineArray1[3]);
            m1[i1][0]=Integer.parseInt(lineArray1[0]);
            m1[i1][1]=Integer.parseInt(lineArray1[1]);
            m1[i1][2]=Integer.parseInt(lineArray1[2]);
            m1[i1][3]=Integer.parseInt(lineArray1[3]);
            //System.out.println(m1[i1][0]+m1[i1][1]+m1[i1][2]+m1[i1][3]);
            i1++;
        }
        br1.close();


        File f2=new File(matrixBfileName);
        FileReader fr2=new FileReader(f2);
        BufferedReader br2=new BufferedReader(fr2);
        String line2;
        int i2=0;
        //String[][] lineArray=new String[4][4];
        String[] lineArray2=new String[4];
        while((line2=br2.readLine())!=null){
            lineArray2=line2.split(" ");
            //System.out.println(lineArray2[0]+lineArray2[1]+lineArray2[2]+lineArray2[3]);
            m2[i2][0]=Integer.parseInt(lineArray2[0]);
            m2[i2][1]=Integer.parseInt(lineArray2[1]);
            m2[i2][2]=Integer.parseInt(lineArray2[2]);
            m2[i2][3]=Integer.parseInt(lineArray2[3]);
            //System.out.println(m2[i2][0]+m2[i2][1]+m2[i2][2]+m2[i2][3]);
            i2++;
        }
        br2.close();

        int[][] m3=new int[4][4];
        for(int i=0;i<m3.length;i++){
            for (int j=0;j<m3[i].length;j++){
                m3[i][j]=m1[i][j]+m2[i][j];
                System.out.print(m3[i][j]);
            }
            System.out.println();
        }

        String oline1="";//String oline2="";String oline3="";String oline4="";
        File out=new File("output1.txt");
        FileWriter fw=new FileWriter(out);
        for(int i=0;i<m3.length;i++) {
            for (int j = 0; j < m3[i].length; j++) {
                String temp=Integer.toString(m3[i][j]);
                oline1=oline1+temp+" ";
            }fw.write(oline1);fw.write("\n");oline1="";
        }
        fw.close();
    }

    public static void mMultiply(String matrixfileName, int x) throws Exception{
        int[][] m1= new int[4][4];
        File f1=new File(matrixfileName);
        FileReader fr1=new FileReader(f1);
        BufferedReader br1=new BufferedReader(fr1);
        String line1;
        int i1=0;
        //String[][] lineArray=new String[4][4];
        String[] lineArray1=new String[4];
        while((line1=br1.readLine())!=null){
            lineArray1=line1.split(" ");
            //System.out.println(lineArray1[0]+lineArray1[1]+lineArray1[2]+lineArray1[3]);
            m1[i1][0]=Integer.parseInt(lineArray1[0]);
            m1[i1][1]=Integer.parseInt(lineArray1[1]);
            m1[i1][2]=Integer.parseInt(lineArray1[2]);
            m1[i1][3]=Integer.parseInt(lineArray1[3]);
            //System.out.println(m1[i1][0]+m1[i1][1]+m1[i1][2]+m1[i1][3]);
            i1++;
        }
        br1.close();

        int[][] m3=new int[4][4];
        for(int i=0;i<m3.length;i++){
            for (int j=0;j<m3[i].length;j++){
                m3[i][j]=m1[i][j]*x;
                System.out.print(m3[i][j]);
            }
            System.out.println();
        }

        String oline1="";//String oline2="";String oline3="";String oline4="";
        File out=new File("output2.txt");
        FileWriter fw=new FileWriter(out);
        for(int i=0;i<m3.length;i++) {
            for (int j = 0; j < m3[i].length; j++) {
                String temp=Integer.toString(m3[i][j]);
                oline1=oline1+temp+" ";
            }fw.write(oline1);fw.write("\n");oline1="";
        }
        fw.close();

    }

    public static void main(String[] args) throws Exception {
        String line1="matrix1.txt";
        String line2="matrix2.txt";
        mAddition(line1,line2);
        mMultiply(line1,10);

    }
}
