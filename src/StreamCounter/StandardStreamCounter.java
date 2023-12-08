package StreamCounter;

import java.io.*;

public class StandardStreamCounter implements StreamCounter{
    private int noOfWords = 0, noOfBytes = 0, noOfLines = 0, noOfChars = 0;

    public StandardStreamCounter() throws IOException {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = inputStream.readLine()) != null) {
            noOfWords += line.split("\\s+").length;
            noOfBytes += line.length();
            noOfLines++;
            noOfChars += line.length();
        }
    }

    public int getBytesCount() {
        return this.noOfBytes;
    }
    public int getCharactersCount()
    {
        return this.noOfChars;
    }

    public int getLinesCount()
    {
        return this.noOfLines;
    }

    public int getWordsCount()
    {
        return this.noOfWords;
    }
}
