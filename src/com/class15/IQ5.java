package com.class15;

public class IQ5 {

	public static void main(String[] args) {
		// Write a java program to reverse String?
		// Reverse a string word by word?

		String sentence = "The master is speaking";
		String reverse = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse = reverse + sentence.charAt(i);
		}
		String[] words = reverse.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i] + " ");
		}

		System.out.println("-----------------------------------------");

		String alexis = "Alexis is hot";
		String bot = "";
		for (int a = alexis.length() - 1; a >= 0; a--) {
			bot = bot + alexis.charAt(a);
		}
		String[] danny = bot.split(" ");
		for (int a = danny.length - 1; a >= 0; a--) {
			System.out.print(danny[a]);
		}

		System.out.println("------------------------------------------");

		String mia = "Halloween is for losers";
		String halo = "";
		for (int j = mia.length() - 1; j >= 0; j--) {
			halo = halo + mia.charAt(j);
		}
		String[] hot = halo.split(" ");
		for (int j = hot.length - 1; j >= 0; j--) {
			System.out.println(hot[j]);
		}

	}
}
