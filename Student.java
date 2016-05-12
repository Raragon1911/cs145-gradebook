// Student.java v.20160502

class Student {
	double [] grades = new double[10];
	String name;

		public Student(String n){
			name = n;

			for(int i = 0; i < grades.length;i++){
				grades[i]=(Math.random()*100 + 1);
			}
		}
		public void getGrades(){
			System.out.print(name+"\n\n");
			for(int i = 0; i <grades.length;i++){
				System.out.println(grades[i]);
			}
		}
		public double A_grades(){
			double max = grades[0];
			for(int i = 0; i <grades.length;i++){
				if(grades[i]>max){
					max = grades[i];
				}
			}return max;
		}
		public double F_grades(){
			double min = grades[0];
			for(int i = 0;i <grades.length;i++){
				if(grades[i]<min){
					min = grades[i];
				}
			}return min;
		}
		public double avg_grade(){
			double sum = 0;
			for(int i = 0;i <grades.length;i++){
				sum = grades[i]+sum;
			}
			double avg = sum / grades.length;
			return avg;
		}

}