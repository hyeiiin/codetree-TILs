import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int n, k;
	public static int[] a = new int[101];
	public static int[] b = new int[101];
	public static int[] blocks = new int[101];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= k; i++) {
			st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= k; i++) {
			for (int j = a[i]; j <= b[i]; j++) {
				blocks[j]++;
			}
		}

		int max = 0;
		for (int i = 1; i <= n; i++) {
			if (blocks[i] > max) {
				max = blocks[i];
			}

		}

		System.out.println(max);

	}

}