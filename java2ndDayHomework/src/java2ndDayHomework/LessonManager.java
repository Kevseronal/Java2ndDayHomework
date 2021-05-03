package java2ndDayHomework;

public class LessonManager {
	
	public void add(Lesson lesson) {
		
		System.out.println("Ders eklendi : " + lesson.instructor);
	}
	
	public void delete(Lesson lesson) {
		
		System.out.println("Ders silindi : " + lesson.instructor);
	}
}
