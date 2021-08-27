package Abstract;

public class StudentAbstract {
	String name;
	int age;
	char section;
	char gender;
	int sub1, sub2, sub3, total;
	float percent;

	StudentAbstract(String n, int a, char s, char g, int sb1, int sb2, int sb3) {
		name = n;
		age = a;
		section = s;
		gender = g;
		sub1 = sb1;
		sub2 = sb2;
		sub3 = sb3;
	}

	StudentAbstract(String n, int a, char g, char s, int sb2, int sb3) {
		name = n;
		age = a;
		gender = g;
		section = s;
		sub2 = sb2;
		sub3 = sb3;
	}

	public void cal() {

		total = sub1 + sub2 + sub3;
		percent = (total * 100) / 300;
		System.out.println("Name: " + name + " Age: " + age + " Gender: " + gender + " Section: " + section);
		System.out.println("Total Marks  :" + total);
		System.out.println("Percentage :" + percent);

	}

	public static void main(String args[]) {
		StudentAbstract s1 = new StudentAbstract("sam", 20, 'A', 'F', 43, 46, 40);
		StudentAbstract s2 = new StudentAbstract("sandy", 20, 'C', 'F', 47, 48);
		StudentAbstract s3 = new StudentAbstract("santhosh", 20, 'B', 'M', 42, 45);
		StudentAbstract s4 = new StudentAbstract("sid", 20, 'B', 'M', 40, 45, 49);
		s1.cal();
		s2.cal();
		s3.cal();
		s4.cal();

	}

}
