package com.company;

public class Color {
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    private String code;
    private String rgb;

    public Color(String code, String  rgb){
        this.code = code;
        this.rgb = rgb;
    }
}


