
public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		int X = 5;
		int Y = 10;

		// 1. With using third variable
//		int Z;
//		Z = X; // 5
//		X = Y; // 10
//		Y = Z; // 5

		// 2. Without using third variable + operator

//		X = X + Y; //15
//		Y = X - Y; //5
//		X = X - Y; //10

		// 3. Without using third variable * operator
		
		X = X * Y; //50
		Y = X / Y; //5
		X = X / Y; //10
		
	
		System.out.println(X);
		System.out.println(Y);

	}

}
