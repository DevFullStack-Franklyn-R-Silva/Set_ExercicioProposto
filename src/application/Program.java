package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students for course A? ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			a.add(sc.nextInt());
		}

		System.out.print("How many students for course B? ");
		x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			b.add(sc.nextInt());
		}

		System.out.print("How many students for course C? ");
		x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			c.add(sc.nextInt());
		}

		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());

		sc.close();
	}

}
