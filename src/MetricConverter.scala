class MetricConverter {

    def kilometersToMiles(kilometers: Float): Float = {
        (kilometers * 0.621371).floatValue()
    }

    def celsiusToFahrenheit(celsius: Int): Int = {
        (celsius * 1.8 + 32.0).intValue()
    }

    def kilogramsToPounds(kilograms: Float): Float = {
        (kilograms * 0.45359237).floatValue()
    }

    def litresToGallons(litres: Float, system: Systems.Value): Float = {
        if (system == Systems.UK) {
            (litres * 0.26417205235).floatValue()
        } else {
            (litres * 0.21996924829).floatValue()
        }
    }
}

object Systems extends Enumeration {
    val US, UK = Value
}

object MetricConverter {
    def main(args: Array[String]): Unit = {
        val converter = new MetricConverter()
        println("km -> mi      : " + "2.5km -> " + converter.kilometersToMiles(2.5f) + "mi")
        println("C  -> F       : " + "30C   -> " + converter.celsiusToFahrenheit(30) + "F")
        println("kg -> lb      : " + "20kg  -> " + converter.kilogramsToPounds(20) + "lb")
        println("l  -> gal (UK): " + "5l    -> " + converter.litresToGallons(5, Systems.UK) + "gal (UK)")
        println("l  -> gal (US): " + "7l    -> " + converter.litresToGallons(7, Systems.US) + "gal (US)")
    }
}