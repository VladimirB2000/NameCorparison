package NameCorparison;

import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name1 = reader.readLine();
            String name2 = reader.readLine();
            if (name1.equals(name2))
                System.out.println("Имена идентичны");
            else if (name1.length() == name2.length())
                System.out.println("Длины имен равны");

        }}

