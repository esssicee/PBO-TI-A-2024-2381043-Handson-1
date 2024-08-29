public class KonversiNumber
public static void main(string[] args) {
    //widening
    byte tipeDataByte = 10;
    short tipeDataShort = tipeDataByte;
    int tipeDataInt = tipeDataShort;
    long tipedataLong = tipeDataInt;
    float tipeDataFloat = tipeDatalong;
    double tipeDataDouble = tipeDataFloat;

    //Narrowing
    int tipeDataint2 = 128;
    byte tipeDataByte2 = (byte) tipeDataint2;
    system.out.println(tipeDataByte2);
}
