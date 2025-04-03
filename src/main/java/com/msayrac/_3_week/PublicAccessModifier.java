package com.msayrac._3_week;

public class PublicAccessModifier {

    public String publicData = "public data";
    private String privateData = "privateData data";
    protected String protectedData = "protectedData data";
    String defaultData = "defaultData data";

    public static void main(String[] args) {


        PublicAccessModifier pm = new PublicAccessModifier();

        System.out.println(pm.publicData);
        System.out.println(pm.defaultData);
        System.out.println(pm.protectedData);
        System.out.println(pm.defaultData);



    }



}
