package ejercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consola {

		public static byte readByte() throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			byte x = Byte.valueOf(in.readLine());
			return x;
		}

		public static short readShort() throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			short x = Short.valueOf(in.readLine());
			return x;
		}

		public static int readInt() throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int x = Integer.valueOf(in.readLine());
			return x;
		}

		public static long readLong() throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			long x = Long.valueOf(in.readLine());
			return x;
		}

		public static float readFloat() throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			float x = Float.valueOf(in.readLine());
			return x;
		}

		public static double readDouble() throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			double x = Double.valueOf(in.readLine());
			return x;
		}

		public static char readChar() throws IOException {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			return (char) (b.read());
		}

		public static String readString() throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str = in.readLine();
			return str;
		}
}

