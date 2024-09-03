import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) {
        String example = "OutPut String";
        FileOutputStream outputFile = null;

        try{
            outputFile = new FileOutputStream("src/main/resources/resource_text.txt");
            byte[] bytes = example.getBytes();
            outputFile.write(bytes);
//            outputFile.close();
            System.out.println(example);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(outputFile != null){
                try{
                    outputFile.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
