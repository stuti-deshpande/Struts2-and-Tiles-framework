package Student;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

public class mainclass extends ActionSupport implements ModelDriven<studentBean> {
	
	private static final long serialVersionUID = 1L;
	private studentBean stud_bean=new studentBean();
	private studentBean stud_bean1=new studentBean();
	private dataBean datab=new dataBean();
	private String[] id_string;
	private String id;
	
	public void setStud_Bean(studentBean stud_bean) {
		this.stud_bean = stud_bean;
	}

	public studentBean getStud_bean1() {
		return stud_bean1;
	}

	public void setStud_bean1(studentBean stud_bean1) {
		this.stud_bean1 = stud_bean1;
	}

	public studentBean getStud_Bean() {
		return stud_bean;
	}
	//public String getData() {
	//	return data;
	//}

	//public void setData(String data) {
	//	this.data = data;
	//}
	
	public dataBean getDatab() {
		return datab;
	}

	public void setDatab(dataBean datab) {
		this.datab = datab;
	}
	
	public String[] getId_string() {
		return id_string;
	}

	public void setId_string(String[] id_string) {
		this.id_string = id_string;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	
 public String execute() throws Exception{
	 studentDAO stu_dao= new studentDAO();
	 
	 String data_array =stud_bean.getData();
//	 data=setData;
	 
	 dataProcessor dproc=new dataProcessor();
	 double mean;
	 
	 System.out.println("the data is" + data_array);
	 String data1[] = data_array.split(",");
	 int[] dataf=new int[data1.length];
	 for(int i=0;i<data1.length;i++){
		  dataf[i]= Integer.parseInt(data1[i]);
	 }
	 mean=dproc.mean(dataf);
	 double sd;
	 sd=dproc.StandardDeviation(dataf);
	 datab.setMean(mean);
	 datab.setSd(sd);
	 stud_bean.setMean(""+mean);
	 stud_bean.setSd(""+sd);
	 stu_dao.storeData(stud_bean);
		
	 String id_string1="";
	 try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("1");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "sdeshpa2", "grooch");
            System.out.println("2");
            Statement stmt = con.createStatement();
            System.out.println("3");
            ResultSet result = stmt.executeQuery("select STUDENT_ID from surveydetails");
            System.out.println("4");
            while (result.next()) {
                id_string1 = id_string1+result.getString(1)+",";
            } 
            con.close();
        } 
	 catch (Exception e) {
		 System.out.println("Connection failed");
        }
	 
	 id_string = id_string1.split(",");
	 
	 if (mean>90)
	 {
		 return "congrats";
	 }
	 else
	 {
		 return "normal";
	 }
	 
 }
	@Override
	public studentBean getModel() {
		return stud_bean;
	}
	public String getMethod() throws IOException { 
		studentDAO stud_dao1=new studentDAO();
		stud_bean1=stud_dao1.retrieveData(id);
		if (stud_bean1==null)
			return "fail";
		else
			return "stulist";
	}
	}


