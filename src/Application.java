import StreamCounter.FileStreamCounter;
import StreamCounter.StandardStreamCounter;
import StreamCounter.StreamCounter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final List<String> VALID_FLAGS = List.of("-c", "-m", "-w", "-l");
    public static void main(String[] args) throws Exception
    {
        StreamCounter counter;
        File file = null;
        List<String> flags = new ArrayList<>();

        for (String argument : args) {
            if (VALID_FLAGS.contains(argument)) {
                flags.add(argument);
            } else {
                file = new File(argument);
            }
        }

        if (file != null && file.isFile() && file.canRead()) {
            counter = new FileStreamCounter(file);
        } else if (file == null) {
            counter = new StandardStreamCounter();
        } else {
            System.out.println(file + ": No such file");
            return;
        }

        for (String flag : flags) {
            switch (flag) {
                case "-c":
                    System.out.print(counter.getBytesCount() + " ");
                    break;
                case "-m":
                    System.out.print(counter.getCharactersCount() + " ");
                    break;
                case "-w":
                    System.out.print(counter.getWordsCount() + " ");
                    break;
                case "-l":
                    System.out.println(counter.getLinesCount());
                    break;
            }
        }
    }
}