import java.io.*;
public class fileHandling {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("attendence.csv");
			FileWriter fw = new FileWriter("editedfile.txt",true);
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line = br.readLine();  
			String reg[] = new String[100];
			int j=0;
			while(line!= null) {
				String ans[] = line.split(",+", 0);
				String splitreg[] = line.split("," , 2);
				System.out.println(splitreg[0]);
				if(splitreg[0]!=null&&splitreg[0].charAt(0)=='2') {
					reg[j] = splitreg[0];
					j++;
					System.out.println(reg[j]);
				}
				
				String res = ans[0];
				for(int i=1;i<ans.length-2;i++) {
					res=res+","+ans[i];
				}
//				System.out.println(res);
				bw.write(res+"\n");
				line=br.readLine();
			}  
				fr.close();
				bw.close();
			}  
			catch(IOException e) {  
				e.printStackTrace();  
			}
		
		}
	}
