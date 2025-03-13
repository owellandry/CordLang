package com.cordlang.config;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.json.JSONObject;

public class Config {
    private String name;
    private String version;
    private String prefix;
    private boolean module;

    public Config(String name, String version, String prefix, boolean module) {
        this.name = name;
        this.version = version;
        this.prefix = prefix;
        this.module = module;
    }

    public String getName() { return name; }
    public String getVersion() { return version; }
    public String getPrefix() { return prefix; }
    public boolean isModule() { return module; }

    public static Config loadFromFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) return null;
            String content = new String(Files.readAllBytes(file.toPath()));
            JSONObject json = new JSONObject(content);
            String name = json.getString("name");
            String version = json.getString("version");
            String prefix = json.getString("prefix");
            boolean module = json.getString("module").equalsIgnoreCase("true");
            return new Config(name, version, prefix, module);
        } catch (IOException e) {
            System.err.println("Error al cargar configuración: " + e.getMessage());
            return null;
        }
    }
}
