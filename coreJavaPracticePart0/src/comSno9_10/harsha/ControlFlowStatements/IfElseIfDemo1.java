package comSno9_10.harsha.ControlFlowStatements;
public class IfElseIfDemo1{
	public static void main(String args []) {
		int testscore = 69;
		char grade;
		
		if (testscore >= 90) {
			grade = 'A';
		}else if (testscore >= 80) {
			grade = 'B';
		}else if (testscore >= 70) {
			grade = 'C';
		}else if (testscore >= 60) {
			grade = 'D';
		}else {
			grade = 'E';
		}
		System.out.println("Grade = " + grade );
	}
}