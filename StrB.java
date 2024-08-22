package java13;

public class StrB {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Smile, The World smiles with you");

				System.out.println(sb);
				sb.append("123"); //append means adding at the end of the

				System.out.println(sb);

				sb.insert(6, "Always");
				System.out.println(sb);

				sb.delete(6,22);
				System.out.println(sb);

				sb.reverse();
				System.out.println(sb);
	}
}