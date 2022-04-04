package com.rplbo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    //entry point
    public static void main( String[] args )
    {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEE MMM d HH:mm:ss z y");
        String formate = date.format(format);
    }

}
