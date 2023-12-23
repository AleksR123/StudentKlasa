
public class Student {
	
		int id;
		String ime;
		Student(int i, String n){
			id=i;
			ime=n;
		}
		void display() {System.out.println(id + " " + ime);}

		public static void main(String args[]) {
			Student s1 = new Student(111, "Petar");
			Student s2 = new Student(222, "Marko");
			s1.display();
			s2.display();
		}
}
