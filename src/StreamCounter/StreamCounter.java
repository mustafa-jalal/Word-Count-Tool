package StreamCounter;

import java.io.IOException;

public interface StreamCounter {
    public int getBytesCount();
    public int getCharactersCount();

    public int getLinesCount();

    public int getWordsCount();
}
