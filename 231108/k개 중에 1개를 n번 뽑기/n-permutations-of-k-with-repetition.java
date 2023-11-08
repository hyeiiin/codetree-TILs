import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static ArrayList<Integer> answer = new ArrayList<>();

	static int n;
	static int k;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		choose(1);
	}

	private static void choose(int i) {
		if (i == n + 1) {
			print();
			return;
		}

		for (int i1 = 1; i1 <= k; i1++) {

			answer.add(i1);
			choose(i + 1);
			answer.remove(answer.size() - 1);
		}

	}

	private static void print() {
		for (int i = 0; i < answer.size(); i++)
			System.out.print(answer.get(i) + " ");
		System.out.println();

	}

}