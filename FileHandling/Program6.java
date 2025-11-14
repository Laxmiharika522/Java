import java.io.*;
public class Program6 {
   public static void main(String a[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String InputFile = br.readLine();
    String backupFile = br.readLine();
    String reportFile = br.readLine();
    int n = Integer.parseInt(br.readLine());

    try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(InputFile));
        PrintStream ps = new PrintStream(bos)){
        for(int i=0;i<n;i++){
            String line = br.readLine();
            ps.println(line);
        }
    }

    try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(InputFile));
        BufferedOutputStream bous = new BufferedOutputStream(new FileOutputStream(backupFile))){
        byte[] buffer = new byte[1024];
        int bytesread;
        while((bytesread = bis.read(buffer)) != -1){
            bous.write(buffer,0,bytesread);
        }
    }

    int present =0;int absent =0;
    try(BufferedReader bur = new BufferedReader(new FileReader(InputFile))
        BufferedOutputStream bous1 = new BufferedOutputStream(new FileOutputStream(reportFile));
        PrintStream prs = new PrintStream(bous1)){
            prs.printf("Total no.of Students %d",n);
            String line;
            while((line = bur.readLine) != null){
                String[] parts = line.split(",");
                if(parts.length==3){
                    String status = parts[2].trim;
                    
                }
            }
        }
    

   } 
}
