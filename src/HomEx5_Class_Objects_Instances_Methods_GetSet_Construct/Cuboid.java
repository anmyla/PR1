package HomEx5_Class_Objects_Instances_Methods_GetSet_Construct;

public class Cuboid {
    double length;
    double width;
    double height;

    public static double calculateArea(double length, double width) {
        double area;
        return area = length * width;
    }


    public static double calculateVolume(double length, double width, double height) {
        double volume;
        volume = length * width * height;
        return volume;
    }

    public static double calculateSurface(double length, double width, double height) {
        double surface;
        surface = (2* (length * width) + (height * width) + (height * length));
        return surface;
    }

    public static double scaleTo(int factor, double length, double width, double height) {
        double scaledLength = length * factor;
        double scaledWidth = width * factor;
        double scaledHeight = height * factor;
        double scaledVolume = scaledHeight * scaledWidth * scaledLength;
        double scaledArea = scaledLength * scaledWidth;
        double scaledSurface =  (2* (scaledLength * scaledWidth) + (scaledLength * scaledHeight) + (scaledHeight * scaledWidth));
        return scaledVolume;
    }

}

//  Erstellen Sie eine Klasse Quader mit den Eigenschaften laenge, breite und hoehe. (jeweils
//        double) und fügen Sie nachfolgende Funktionen der Klasse hinzu:
//        • Erstellen Sie eine Methode grundflaeche() welche die Fläche des Rechtecks berechnet. (Länge multipliziert mit Breite)
//        • Erstellen Sie eine Methode skaliere(double faktor), die alle Eigenschaften um einen Faktor (gegeben durch Parameter) vergrößert/verkleinert.
//        • Erstellen Sie eine Methode volumen() um das Volumen des Quaders zu berechnen.
//        • Erstellen Sie eine Methode oberflaeche() um die Oberfläche des Quaders zu berechnen.
//        Testen Sie diese Methoden der Klasse Quader in der main-Methode in der Klasse QuaderApp. (Diese ist nur dafür da, um das Programm auszuführen und die Funktionen von der Klasse Quader zu testen)

