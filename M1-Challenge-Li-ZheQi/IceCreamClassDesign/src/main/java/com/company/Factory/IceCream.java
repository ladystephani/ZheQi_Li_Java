package com.company.Factory;

public class IceCream {
    //consider the factory characteristics, just like consider a Lion characteristic
//    int productionAmountOfFlavor(int a) {
//        return a;
//    }

    private String size;
    public String sentMessage;
    public String packedMessage;

//    public IceCream() {
//        packed = false;
//    }

    public String creation(String flavor){
        if (flavor == "vanilla") {
            size = "12oz";
        } else {
            size = "8oz";
        }

        return "An ice cream has been created on the stream line for flavor: " + flavor + " in size " + size;
    }

    public String sendToPack() {
        sentMessage = "Ice cream has been sent to the packing department";
//        packed=true;
        return sentMessage;
    }

    public String packed() {
        packedMessage ="Ice cream has been packed";
        return packedMessage;
    }
}
