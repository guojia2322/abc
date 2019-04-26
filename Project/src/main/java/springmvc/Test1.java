package springmvc;
/**
 * 
 * @author guojia
 *
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		File file = new File ("D:\\userinfo.txt");
		FileWriter fw= new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		int id= 1234567;
		for(int i =1;i<10;i++){
			 bw.write("INSERT INTO `alone_auth_user` (`ID`, `NAME`, `PASSWORD`, `COMMENTS`, `TYPE`, `CTIME`, `UTIME`, `CUSER`, `MUSER`, `STATE`, `LOGINNAME`, `LOGINTIME`, `IMGID`) VALUES ги'"+id+"a0a1de3016a0a24734b0001', 'zhang0"+i+"', '3EB4FB05D6AAD0D2FFFE48C87BEE9939', NULL, '1', '20190411100522', '20190411100522', 'zhang0"+i+"', 'zhang0"+i+"', '1', 'zhang0"+i+"', '20190411100522', '402809816a0a1de3016a0a2402200000');\r\n");
	         id++;
		}
		bw.close();

	}

}
