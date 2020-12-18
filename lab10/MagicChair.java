package com.company;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("HOBA!");
    }

    @Override
    public String toString() {
        return "Magic chair";
    }
}
