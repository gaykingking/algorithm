package com.ls.niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
public class HJ16 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        List<String> lines=new LinkedList<>();
        while((line=br.readLine()).length()>0){
            lines.add(line);
        }
        int total=Integer.valueOf(lines.get(0).split(" ")[0]);
        lines.stream().skip(1).collect(Collections.

    }
}