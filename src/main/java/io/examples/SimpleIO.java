package io.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SimpleIO {

    public void PrintFile(String args[]) throws IOException {
        try(FileChannel fcIn = new FileInputStream(args[0]).getChannel();
            FileChannel fcOut = new FileOutputStream(args[1]).getChannel()
        ){
            ByteBuffer buff = ByteBuffer.allocate((int) fcIn.size());
            System.out.printf("Output: " + buff.remaining());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
