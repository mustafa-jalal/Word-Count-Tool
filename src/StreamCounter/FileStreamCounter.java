package StreamCounter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamCounter implements StreamCounter{
    FileInputStream inputStream;
    byte[] bytes;

    public FileStreamCounter(File file) throws IOException {
        this.inputStream = new FileInputStream(file);
        this.bytes = new byte[this.inputStream.available()];
        inputStream.read(bytes);
        inputStream.close();
    }

    private String getString() {
        return new String(bytes);
    }

    public int getBytesCount() {
        return this.bytes.length;
    }
    public int getCharactersCount()
    {
        return this.getString().length();
    }

    public int getLinesCount()
    {
        return this.getString().split("\n").length;
    }

    public int getWordsCount()
    {
        return this.getString().split("\\s+").length;
    }
}
