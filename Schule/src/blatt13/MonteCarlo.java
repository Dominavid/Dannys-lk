package blatt13;

public class MonteCarlo {
    public static void main(String[] args) {
        double seitenlängequadratischeplane = 1;
        double durchmesserrunderbrunnenindermittedieserplane = 1;

        double flächeninhaltquadratischerplane = QuadratApproximation.flaecheQuadrat(seitenlängequadratischeplane);
        double flächeninhaltrunderbrunnenindermittedieserplane = Math.pow(durchmesserrunderbrunnenindermittedieserplane/2,2)*3.141;

        double flächeninhaltquadratischerplanebereinigt = flächeninhaltquadratischerplane-flächeninhaltrunderbrunnenindermittedieserplane;

        double anzahltropfenproquadratmeter = 100.0;


        double mengeanregentropfendieaufdieplanegefallensind = flächeninhaltquadratischerplanebereinigt*anzahltropfenproquadratmeter;
        double mengeanregentropfendieindenbrunnengefallensind = flächeninhaltrunderbrunnenindermittedieserplane*anzahltropfenproquadratmeter;

        System.out.printf("Es sind ca. %.2f Tropfen in den Brunnen gefallen, während ca. %.2f Tropfen auf der Plane landeten, Sir.", mengeanregentropfendieindenbrunnengefallensind, mengeanregentropfendieaufdieplanegefallensind);
        //die simulation basiert darauf, dass der Regen exakt gleichmäßig fällt, was für eine kleine Fläche zwar eine relativ genaue Schätzung ermöglicht, der Wert aber v. A. bei größeren Flächen stärker variieren kann.
    }
}
