package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GlobalConfig {
    private static final String CONFIG_NAME = "data.txt";

    public static FileReader initGlobalConfig() throws FileNotFoundException {
        return new FileReader(CONFIG_NAME);
    }
    public static FileReader initGlobalConfig(String name) throws IOException {
        if (name != null && !name.trim().isEmpty()) {
            return new FileReader(name);
        } else {
            return new FileReader(CONFIG_NAME);
        }
    }
}
