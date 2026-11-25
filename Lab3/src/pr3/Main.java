package pr3;

public class Main {
	public static void main(String[] args) {
		MyArray<String> arr = new MyArray<>();
		
		arr.add("Kamila");
		arr.add("Karakat");
		arr.add("Amina");
		System.out.println("The size " + arr.size());

		arr.remove("Kamila");
		
		System.out.println("The array contains \"Amina\" : " + arr.contains("Amina"));

		System.out.println("The size "+ arr.size());
		System.out.println("The array is empty: " + arr.isEmpty());
		
		arr.clear();
		System.out.println("The array is empty: " + arr.isEmpty());
	}

}
