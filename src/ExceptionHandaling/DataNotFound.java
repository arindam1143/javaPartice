package ExceptionHandaling;

public class DataNotFound extends RuntimeException {

	public DataNotFound() {
		super("this is super");
		System.out.print("this is form datanot Found error");
	}
}
