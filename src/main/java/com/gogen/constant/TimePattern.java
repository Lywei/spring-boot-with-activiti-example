package com.gogen.constant;

public enum TimePattern{

        Date("Date","yyyy-MM-dd-HH"),
        DateTime("DateTime","yyyy-MM-dd-HH-mm:ss");

        private String name;
        private String value;

        private TimePattern(String name,String value){
            this.name=name;
            this.value=value;
        }
    }