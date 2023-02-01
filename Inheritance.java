package CipherSchoolCourse2;

        class A {
		void parent1() {
			System.out.println("Parent Class1...");
		}
		class B extends A {
			void child1() {
				System.out.println("Child of class A");
			}
		}
		class C extends A{
			void child2() {
				System.out.println("Child of Class B and GrandChild of Class A");
			}
		}
		public class Inheritance {
			public static void main(String[] args) {

			}
		}
	}

