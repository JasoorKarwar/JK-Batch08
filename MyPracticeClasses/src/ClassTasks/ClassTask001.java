package ClassTasks;

public class ClassTask001 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.println(i + " " + j);
			}
		}

		System.out.println("---------------How can I print clock----------------------------");
		
		for (int h=0; h<24; h++) {
			for(int m=0; m<60; m++) {
				if(h<10) {
					if(m<10) {
				
					System.out.println("0"+h + ":0" +m);
				}else {
					System.out.println("0"+h+":+m");
				}
			}else {
				System.out.println(h + ":" +m);
		}
	}
	}
	}
}

