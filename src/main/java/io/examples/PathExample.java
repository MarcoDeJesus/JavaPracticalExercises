package io.examples;

import java.nio.file.Path;

public class PathExample {

    //REVISAR EL RESULTADO no es /users/joe/docs
    public void currentFolder(){
        Path someFile = Path.of("/","users", "joe", "docs", "some.txt");
        Path justSomeFile = someFile.getFileName();
        Path docsFolder = someFile.getParent();
        Path currentFolder = docsFolder.relativize(someFile);
        System.out.println(String.valueOf(currentFolder));
    }
}
