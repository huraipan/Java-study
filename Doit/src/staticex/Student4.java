package staticex;

public class Student4 {
	String studentName;
	int studentCardNum;
	int studentID;
	private static int serialNum=1000;;
	
	
	public Student4() {
		studentID = serialNum;		
		studentCardNum=studentID+100;
		serialNum++;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
