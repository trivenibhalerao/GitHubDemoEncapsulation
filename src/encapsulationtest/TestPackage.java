package encapsulationtest;

import encapsulatiobyclass.*;
import encapsulatiobyclass.Student;

public class TestPackage {
	public static void main(String[] args) {
		int t=10;
		encapsulatiobyclass.Student s = new encapsulatiobyclass.Student();
		s.setName("A");
		System.out.println(s.getName());
	}
}
