package wk5_CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		StringBuilder sb = new StringBuilder(Log);
		for (int i=1; i<sb.length(); i+=2)
			sb.insert(i,  ' ');
		System.out.println(sb.toString());
	}

	@Override
	public void Error(String Error) {
		StringBuilder sb = new StringBuilder("Good-bye");
		for (int i=1; i<sb.length(); i+=2)
			sb.insert(i,  ' ');
		System.out.println(Error + sb.toString());
	}
}
