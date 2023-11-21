import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());

		// 1부터 시작
		word(1);
		System.out.println();
		// N부터 시작
		word2(N);

	}

	public static void word(int c) {

		if (c > N)
			return;
		System.out.print(c + " ");
		word(c + 1);

	}

	public static void word2(int c) {

		if (c < 1)
			return;
		System.out.print(c + " ");
		word2(c - 1);

	}
}