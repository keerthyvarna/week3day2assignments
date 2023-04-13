package week3day2assignments;

public class Students {
	public void getStudentInfo(int id) {
	       System.out.println("id: "+id);	
	}
	public void getStudentInfo(int id, String name) {
		//System.out.println();
		System.out.println("id: "+ id + ", name: "+ name);
	}
	public void getStudentInfo(String email, long phno) {
		System.out.println("email: "+ email+", phno: "+phno);
	}
	

	public static void main(String[] args) {
           Students st = new Students();
           st.getStudentInfo(16406);
           st.getStudentInfo(16406, "keerthana");
           st.getStudentInfo("keerthyvarna006@gmail.com",9944805979l);
	}

}
