import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {


        FileInputStream inputFile = null;

        try{

            inputFile = new FileInputStream("src/main/resources/resource_file.txt");
            int i;
            while((i =  inputFile.read()) != -1){
                System.out.print((char)i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(inputFile != null) {
                try {
                    inputFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
