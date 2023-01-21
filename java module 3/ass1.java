import java.io.*;


class ass1 {
	public static void main(String[] args) {
		String filePath = "./file.txt";
		fileStats(filePath);
	}

	static void fileStats(String filePath) {
		int sentences = 0, words = 1, characters = 0;
		char[] terminators = {'.', '?', '!'};
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			for(char[] s = (br.readLine()).toCharArray(); s != null; s = (br.readLine()).toCharArray()) {
				for(char c: s) {
					characters++;
					for(char x: terminators)
						if(x == c)
							sentences++;
					if(c == ' ') words++;
				}
			}
			br.close();
		} catch(Exception e) { System.out.println(filePath); }
			

		System.out.println("Sentences: " + sentences);
		System.out.println("Words: " + words);
		System.out.println("Characters: " + characters);

	}
}