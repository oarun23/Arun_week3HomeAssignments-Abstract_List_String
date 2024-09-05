package week3.homeassignments1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		
		System.out.println("Please enable the connection");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("Please disable the connection");
		
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("Please execute the update");
	}

	
	public static void main(String[] args) {
		
		JavaConnection obj = new JavaConnection();
		
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
	}
	
}
