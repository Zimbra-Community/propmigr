package tk.barrydegraaff;

import java.io.FileOutputStream;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;

public class propMigr {

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("usage: /path/to/original.properties  /path/to/updated.properties");
        }
        try {

            FileInputStream in = new FileInputStream(args[1]);
            Properties props = new Properties();
            props.load(in);
            in.close();

            FileInputStream inold = new FileInputStream(args[0]);
            props.load(inold);
            inold.close();
            inold.close();

            FileOutputStream out = new FileOutputStream(args[1]);
            props.store(out,"Updated by installer via propmigr.");
            out.close();


        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }

    }
}
