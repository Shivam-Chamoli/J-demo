import java.util.*;
import java.io.*;

public class IOCheck {
	public static void main(String[] args) throws IOException {
		File file = new File("./IOCheck.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		int t = Integer.valueOf(br.readLine());
		while(t-->0){
			int[] arr= getArray(br.readLine());
			System.out.println(Arrays.toString(arr));
		}
	}

	public static int[] getArray(String str){
		String[] str1=str.replaceAll("\\{","").replaceAll("\\}","").split(",");
		int[] ret= new int[str1.length];

		for(int i=0; i<ret.length; i++){
			ret[i]=Integer.valueOf(str1[i]);
		}
		return ret;
	}
}
