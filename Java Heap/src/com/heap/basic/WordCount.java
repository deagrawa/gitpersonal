package com.heap.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordCount {

	public static int MAX_CONDIDATES = 7;
	
	public static void main(String[] args) throws IOException {
		
		Person[] condidates = new Person[MAX_CONDIDATES+1];
		
		Scanner in = new Scanner (new FileReader("src/word_list.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("src/word_out.txt"));
		out.println("Hi");
		//String condidates;
		for (int i =1; i <=7; ++i) {
			condidates[i] = new Person(in.nextLine(), 0);			
		}
		VoteCount vCount = processData(condidates, MAX_CONDIDATES, in, out);
		sortByCount(condidates);
		printResults(condidates, MAX_CONDIDATES, out, vCount);
		out.flush();
		in.close();
		out.close();

	}
	
	private static void sortByCount(Person[] condList) {
		
		Person temp;
		for(int i =1; i <MAX_CONDIDATES; ++i) {
			int min = i;
			for (int j = i+1; j<=MAX_CONDIDATES; ++j) {
				if(condList[j].numVotes < condList[min].numVotes) {
					min = j;
				}
			}
			temp = condList[i];
			condList[i] = condList[min];
			condList[min] = temp;
		}
	}
	
	private static void printResults(Person[] condList, int total_user, PrintWriter out, VoteCount vCount) {
		out.printf("\nNumber of voters: %d\n", vCount.valid + vCount.spoilt);
		out.printf("Number of valid votes: %d\n", vCount.valid);
		out.printf("Number of spoilt votes: %d\n", vCount.spoilt);
		out.printf("\nCandidate Score\n\n");
		
		for (int i =1; i <=total_user; ++i) {
			out.printf("%s %d\n",condList[i].name, condList[i].numVotes);
		}
		
		int max = 1;
		for (int i =1; i <=total_user; ++i) {
			if(max < condList[i].numVotes) {
				max = condList[i].numVotes;
			}
		}
		
		for ( int i =1; i <= total_user; ++i) {
			if(max == condList[i].numVotes) {
				out.printf("%s\n", condList[i].name);
			}
		}
	}
	
	private static VoteCount processData(Person[] condList, int total_user, Scanner in, PrintWriter out) {
		VoteCount vCount = new VoteCount(0, 0);
		int vote = in.nextInt();
		while(vote != 0) {
			if(vote < 1 || vote >total_user) {
				++vCount.spoilt;
				out.printf("Invalid Vote : %d\n" ,vote );
			} else {
				++condList[vote].numVotes;
				++vCount.valid;
			}
			vote = in.nextInt();
		}
		return vCount;
	}

}
class Person {
	String name;
	int numVotes;
	
	Person(String name, int votes) {
		this.name = name;
		this.numVotes = votes;
	}
	
}

class VoteCount {
	int valid;
	int spoilt;
	
	VoteCount(int valid, int spoilt) {
		this.valid = valid;
		this.spoilt = spoilt;
	}
}
