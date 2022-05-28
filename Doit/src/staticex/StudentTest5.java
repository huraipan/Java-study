package staticex;

public class StudentTest5 {

	public static void main(String[] args) {
		Student4 studentLee = new Student4();
		studentLee.setStudentName("ÀÌ¼öÁ¤");
		System.out.println(studentLee.getStudentName()+" "+studentLee.studentID+" "+studentLee.studentCardNum);
		
		
		Student4 studentSon = new Student4();
		studentSon.setStudentName("¼ÕÈï¹Î");
		System.out.println(studentSon.getStudentName()+" "+studentSon.studentID+" "+studentSon.studentCardNum);
		

	}

}
