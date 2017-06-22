package com.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
	public static void main (String[] args) {
		Path p = Paths.get("files//abc.txt");
		System.out.println(p.getFileName());
		System.out.println(p.getFileSystem());
		System.out.println(p.getName(0));
	}
}
