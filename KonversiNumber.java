public class KonversiNumber{
    public static void main(String[] args) {
        //widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipedataLong = tipeDataInt;
        float tipeDataFloat = tipedataLong;
        double tipeDataDouble = tipeDataFloat;

        //Narrowing
        int tipeDataint2 = 128;
        byte tipeDataByte2 = (byte) tipeDataint2;
        System.out.println("ghost spell");
    }

}
