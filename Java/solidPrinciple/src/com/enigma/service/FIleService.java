package com.enigma.service;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FIleService {
    Path currentRelativePath= Paths.get("src");
    File file = new File(currentRelativePath + "/database/local/data.txt");

}
