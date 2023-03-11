package smart.device;

public class SmartDevice {
    //definimos parametros
    boolean pantallaTactil;
    String altavoz;
    boolean GPS;
    int ranuraMicroSD;
    boolean microfono;

    public SmartDevice() {
    }
    //sobrecarga de datos para el constructor
    public SmartDevice(boolean pantallaTactil, String altavoz, boolean GPS, int ranuraMicroSD, boolean microfono) {
        this.pantallaTactil = pantallaTactil;
        this.altavoz = altavoz;
        this.GPS = GPS;
        this.ranuraMicroSD = ranuraMicroSD;
        this.microfono = microfono;
        //this.public class = parámetro public
    }

    public static void main(String[] args) {
        SmartPhone celular = new SmartPhone(true, "stereo", true, 1, true, 3);
        SmartWatch reloj = new SmartWatch(false, "mono", true, 0, true, 65);
        //creo objeto y le asigno valor a los parametros gracias a los toString de más abajo (linea 44 y 66)

        System.out.println(celular);
        System.out.println("-------------------------------");
        System.out.println(reloj);
    }
}

class SmartPhone extends SmartDevice {
    int camaras;
    public SmartPhone() {
    }

    public SmartPhone(boolean pantallaTactil, String altavoz, boolean GPS, int ranuraMicroSD, boolean microfono, int camaras) {
        super(pantallaTactil, altavoz, GPS, ranuraMicroSD, microfono);
        this.camaras = camaras; //constructor generado, es sobrecarga usando super
    }
    @Override
    public String toString() { //facilita la impresion en consola
        return "SmartPhone{" +
                "camaras=" + camaras +
                ", pantallaTactil=" + pantallaTactil +
                ", altavoz='" + altavoz + '\'' +
                ", GPS=" + GPS +
                ", ranuraMicroSD=" + ranuraMicroSD +
                ", microfono=" + microfono +
                '}';
    }
}

class SmartWatch extends SmartDevice {
    int pulsometro;
    public SmartWatch() {
    }

    public SmartWatch(boolean pantallaTactil, String altavoz, boolean GPS, int ranuraMicroSD, boolean microfono, int pulsometro) {
        super(pantallaTactil, altavoz, GPS, ranuraMicroSD, microfono);
        this.pulsometro = pulsometro;
    }
    @Override
    public String toString() {
        return "SmartWatch{" +
                "pantallaTactil=" + pantallaTactil +
                ", altavoz='" + altavoz + '\'' +
                ", GPS=" + GPS +
                ", ranuraMicroSD=" + ranuraMicroSD +
                ", microfono=" + microfono +
                '}';
        //lo mismo que en los constructores de SmartPhone
    }
}