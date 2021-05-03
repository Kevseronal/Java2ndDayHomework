package java2ndDayHomework;

public class Main {

	public static void main(String[] args) {
		
		Lesson lesson1 = new Lesson("Math", "Burak", "Selma", 20);
		
		Lesson lesson2 = new Lesson("Science", "Erdem", "Zeynep" , 18 );

		Lesson lesson3 = new Lesson("English", "Canan", "Beyza", 24);
		
		Lesson[] lessons = {lesson1, lesson2, lesson3};
		
		for(Lesson lesson : lessons) {
			System.out.println(lesson.lessonName);
			System.out.println(lesson.instructor);
			System.out.println(lesson.studentName);
			System.out.println(lesson.lessonHour);
		}
		
		System.out.println("----------------------------------");
		
		LessonManager lessonManager = new LessonManager();
		lessonManager.add(lesson1);
		lessonManager.delete(lesson2);
		lessonManager.add(lesson3);
	}

}
