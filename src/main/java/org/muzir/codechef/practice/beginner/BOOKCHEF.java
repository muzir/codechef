package org.muzir.codechef.practice.beginner;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class BOOKCHEF {
	private static boolean isCodechefModeOn = false;

	public static void main(String[] args) throws IOException {
		InputStream in = createInputStream();
		BufferedInputStream reader = new BufferedInputStream(in);
		DataInputStream dis = new DataInputStream(reader);
		String[] nm = readLine(dis).split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		List<Integer> specialFriendList = new ArrayList<Integer>();
		List<Post> posts = new ArrayList<Post>();
		if (n != 0) {
			String line = readLine(dis);
			specialFriendList = getListOfString(line);
		}
		for (int i = 0; i < m; i++) {
			String line = readLine(dis);
			posts.add(createPost(line));
		}
		solution(posts, specialFriendList);
		dis.close();
	}

	static void solution(List<Post> posts, List<Integer> specialFriends) {
		TreeSet<Post> specialFriendSet = new TreeSet<Post>(new PopularityComp());
		TreeSet<Post> commonSet = new TreeSet<Post>(new PopularityComp());
		int size = posts.size();
		for (int i = 0; i < size; i++) {
			Post post = posts.get(i);
			if (specialFriends.contains(post.getIdentifier())) {
				specialFriendSet.add(post);
			} else {
				commonSet.add(post);
			}
		}
		printPostContents(specialFriendSet, commonSet);
	}

	static void printPostContents(TreeSet<Post> specialFriendSet, TreeSet<Post> commonSet) {
		List<Post> posts = new ArrayList<Post>();
		posts.addAll(specialFriendSet);
		posts.addAll(commonSet);
		Iterator<Post> iterator = posts.iterator();
		while (iterator.hasNext()) {
			Post post = iterator.next();
			System.out.println(post.getContents());
		}
	}

	static Post createPost(String line) {
		String[] fps = line.split(" ");
		int f = Integer.parseInt(fps[0]);
		int p = Integer.parseInt(fps[1]);
		String s = fps[2];
		Post post = new Post(f, p, s);
		return post;
	}

	static List<Integer> getListOfString(String input) {
		String[] arrayStr = input.split(" ");
		int lenght = arrayStr.length;
		List<Integer> specialFriendList = new ArrayList<Integer>();
		for (int i = 0; i < lenght; i++) {
			specialFriendList.add(Integer.parseInt(arrayStr[i]));
		}
		return specialFriendList;
	}

	private static InputStream createInputStream() throws FileNotFoundException {
		if (isCodechefModeOn) {
			return System.in;
		}
		String path = System.getProperty("user.dir");
		InputStream in = new FileInputStream(path + "/BOOKCHEF.txt");
		return in;

	}

	@SuppressWarnings("deprecation")
	private static String readLine(DataInputStream reader) throws IOException {
		return reader.readLine();
	}

	static class Post {

		public Post(int _identifier, int _popularity, String _contents) {
			identifier = _identifier;
			popularity = _popularity;
			contents = _contents;
		}

		public Integer getIdentifier() {
			return identifier;
		}

		public Integer getPopularity() {
			return popularity;
		}

		public String getContents() {
			return contents;
		}

		private Integer identifier;
		private Integer popularity;
		private String contents;
	}

	static class PopularityComp implements Comparator<Post> {
		@Override
		public int compare(Post p1, Post p2) {
			return p2.getPopularity().compareTo(p1.getPopularity());
		}

	}

}
