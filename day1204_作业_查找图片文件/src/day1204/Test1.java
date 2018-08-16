package day1204;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("目录：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("不是目录");
			return;
		}
		List<File> files = findPic(dir);
		for (File f : files) {
			System.out.println(f.getAbsolutePath());
		}
	}

	private static List<File> findPic(File dir) {
		List<File> list = new ArrayList<>();
		findPic(dir, list);
		return list;
	}

	private static void findPic(
			File dir, List<File> list) {
		File[] files = dir.listFiles();
		if(files == null) {
			return;
		}

		for (File f : files) {
			if(f.isFile()) {
				if(f.getName().toLowerCase().matches(".+\\.(jpg|gif|png|bmp)")) {
					list.add(f);
				}
			} else {
				findPic(f, list);
			}
		}
	}
}