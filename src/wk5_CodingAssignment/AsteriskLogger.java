package wk5_CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String Log) {
		System.out.println(Log);	
	}

	@Override
	public void Error(String Error) {
		System.out.println(Error);
		
	}

}
