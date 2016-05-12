// GradebookApp.java v.20160502

class GradebookApp {
	
	public static void main(String[] args) {
		Student s = new Student("Ramos");
		s.getGrades();

		double highest = s.A_grades();
		System.out.print(highest);

		double lowest = s.F_grades();
		System.out.print(lowest);

		double average = s.avg_grade();
		System.out.print(average);
	}

}