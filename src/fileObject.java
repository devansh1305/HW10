import java.io.*;

public class fileObject {
    public void fObjOne()  throws Exception{
        // Creates a new File instance by converting the given pathname string "sample.txt".
        // into an abstract pathname. If the pathname argument is null, NullPointerException is thrown.
        File f = new File("sample.txt");

        // Creates a FileInputStream by opening a connection to the actual file f
        // If the named file does not exist, is a directory rather than a regular file, 
        // or for some other reason cannot be opened for reading then a FileNotFoundException is thrown.
        FileInputStream fis = new FileInputStream(f);
    }
}