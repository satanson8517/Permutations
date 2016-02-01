package com.avg.satanson;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 01/02/2016
 */
public class Main {

	public static void main(String[] args) {
//		final String str = "many";
//		char[] chrs = str.toCharArray();
//		permutation(chrs, 0, 3);

//		Attributes a = new Attributes();
//		System.out.println(a.x);
		Parent parent = new Child();
		System.out.println(parent.s);
		System.out.println(parent.i);
	}

	private static void copyArray() {
		String[] src = new String[]{"a", "b", "c"};
		for (int i = 0; i < src.length; i++) {
			System.out.println(src[i]);
		}

		String[] dest = new String[src.length];
		System.arraycopy(src, 0, dest, 0, src.length);
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}

	private static void permutation(char[] chrs, int begin, int end) {
		if (begin == end) {
			System.out.println(chrs);
		} else {
			for (int i = begin; i <= end; i++) {
				swap(chrs, i, begin);
				permutation(chrs, begin + 1, end);
				swap(chrs, i, begin);
			}
		}
	}

	private static void swap(char[] chrs, int first, int second) {
		char aux;
		aux = chrs[first];
		chrs[first] = chrs[second];
		chrs[second] = aux;
	}

	private static void swapVars() {
		Attributes l = new Attributes();
		l.a = "aaa";
		l.b = "bbb";
		System.out.println(l.a);
		System.out.println(l.b);
		System.out.println();

		String aux = l.a;
		l.a = l.b;
		l.b = aux;
		System.out.println(l.a);
		System.out.println(l.b);
		System.out.println();

		l.x = 1;
		l.y = 2;
		System.out.println(l.x);
		System.out.println(l.y);
		System.out.println();

		int aux1 = l.x;
		l.x = l.y;
		l.y = aux1;
		System.out.println(l.x);
		System.out.println(l.y);
		System.out.println();
	}
}
