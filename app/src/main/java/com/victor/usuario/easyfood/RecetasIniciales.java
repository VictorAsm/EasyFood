package com.victor.usuario.easyfood;

import android.content.ContentValues;

public class RecetasIniciales {

    public ContentValues AgregarReceta1() {
        String nombre, ingredientes, pasos;
        nombre = "Tarta de Espinaca, Ricota y Jamón";
        ingredientes = "•\t300 grs de harina\n" +
                "•\t150 grs de manteca\n" +
                "•\t1 pizca de sal\n" +
                "•\tAgua, c/n\n" +
                "Para el relleno\n" +
                "•\t4 atados de espinaca\n" +
                "•\t1 cebolla\n" +
                "•\t50 grs de manteca\n" +
                "•\t2 cdas de harina\n" +
                "•\t1 taza de leche\n" +
                "•\t250 grs de jamón cocido\n" +
                "•\t500 grs de ricota\n" +
                "•\t3 huevos\n" +
                "•\t200 grs de queso rallado\n" +
                "•\tSal y pimienta, a gusto\n";

        pasos = "1.\tHacer la masa uniendo el arenado de harina y manteca con agua fría, forrar una tartera de 28 cm y reservar en heladera.\n" +
                "2.\tBlanquear las espinacas en agua con sal, escurrirlas, picarlas y reservar. Aparte, rehogar una cebolla grande en la manteca, incorporar la harina revolviendo siempre y de a poco la leche caliente sin dejar de mezclar.\n" +
                "3.\tCuando espese y fuera del fuego agregar el resto de los ingredientes, mezclar bien y salpimentar.\n" +
                "4.\tVerter sobre la masa y llevar a horno precalentado a 180° por 30 minutos o hasta que el relleno y masa estén dorados.\n";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }

    public ContentValues AgregarReceta2() {
        String nombre, ingredientes, pasos;
        nombre = "Tarta Tatin de cebolla aromatizada con miel";
        ingredientes = "Para la masa\n" +
                "•\t300 g de harina\n" +
                "•\t1/4 cdita. de sal\n" +
                "•\t150 g de manteca\n" +
                "•\tAgua fría, c/n\n" +
                "Para el relleno\n" +
                "•\t2 cebollas\n" +
                "•\t30 g de manteca\n" +
                "•\t3 cdas. de miel\n" +
                "•\t50 g de pasas de uva rubias\n" +
                "•\tSal y pimienta, a gusto\n";

        pasos = "1.\tPara la masa, hacer un arenado con los secos y la manteca bien fría; unir con unas cucharadas de agua, tomar el bollo y dejar descansar media hora.\n" +
                "2.\tPara el relleno, en una sartén fundir la manteca y rehogar en ésta, a fuego bajo y por 10 minutos, las cebollas cortadas en láminas.\n" +
                "3.\tAgregar la miel, las pasas, salpimentar y seguir cocinando por 10 minutos más, revolviendo de tanto en tanto.\n" +
                "4.\tPara el armado final, en tarteras individuales, o una de 26 cm de diámetro apenas enmantecada, volcar las cebollas y distribuir bien; estirar la masa y tapar las cebollas; y llevar a horno moderado por media hora o hasta que la masa se note cocida y dorada.\n" +
                "5.\tServir caliente o tibia.\n";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }

    public ContentValues AgregarReceta3() {
        String nombre, ingredientes, pasos;
        nombre = "Sandwich de Roast Beef";
        ingredientes = "•\t200 gr. de solomillo de ternera\n" +
                "•\tsal, pimienta\n" +
                "•\t1 chorrito de manzanilla\n" +
                "•\t1 manojo de rúcula\n" +
                "•\tpan de molde tremensini\n" +
                "Para la salsa de mostaza y miel\n" +
                "•\t4 cucharadas de mayonesa\n" +
                "•\t2 cucharadas de miel\n" +
                "•\t½ cucharada de mostaza en grano.\n";

        pasos = "1.\tSalpimenta el solomillo y márcalo por ambas caras en una plancha o sartén antiadherente muy caliente y con unas gotas de aceite de oliva. Una vez el solomillo esté bien dorado, retíralo y añade un chorrito de manzanilla en la sartén para recuperar los jugos de la carne.\n" +
                "2.\tLa salsa de mostaza: Junta la mayonesa, la miel y la mostaza en un bol. Ahora bate con las varillas hasta conseguir una salsa fina y homogénea.\n" +
                "3.\tCon la ayuda de un rodillo, estira el pan de molde hasta que quede bien fino. Ahora úntalo con la salsa de mostaza y miel. Coloca unas hojas de rúcula y, a continuación, el solomillo cortado muy fino y rociado con sus jugos y la manzanilla.\n" +
                "4.\tPon a punto de sal, enrolla el pan y córtalo en dos porciones. Pinchamos con una brocheta y acompañamos con un poco más de salsa de mostaza y miel y unas patata fritas.\n";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }

    public ContentValues AgregarReceta4() {
        String nombre, ingredientes, pasos;
        nombre = "Sandwich de guacamole con bacalao ahumado";
        ingredientes = "•\t2 rebanadas de pan de molde\n" +
                "•\t50 gr. de bacalao ahumado en lonchas\n" +
                "•\t1 aguacate maduro\n" +
                "•\t1 tomate maduro\n" +
                "•\t½ cebolleta\n" +
                "•\tunas ramitas de cilantro fresco\n" +
                "•\tel zumo de media lima\n" +
                "•\taceite de oliva\n" +
                "•\tpimienta negra recién molida y sal\n";

        pasos = "1.\tPara el guacamole, dispón en un bol el tomate, el aguacate, el cilantro y la cebolleta, todo ello cortado en daditos. Ahora salpimentar y aliña con el zumo de lima y el aceite de oliva.\n" +
                "2.\tUnta una de las rebanadas de pan con una cantidad generosa de guacamole. Coloca sobre éste unas lonchas de bacalao ahumado y tapa con la otra rebanada de pan.\n" +
                "3.\tCorta el sándwich en forma de cruz y ensarta los cuatro triángulos resultantes en una brocheta de madera\n";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }

    public ContentValues AgregarReceta5() {
        String nombre, ingredientes, pasos;
        nombre = "Ensalada de Quínoa con Frijoles y Menta";
        ingredientes = "•\t1 taza de quínoa cocida\n" +
                "•\t1 taza de frijol pinto cocido\n" +
                "•\t1 taza de kale cortado en trozos pequeños\n" +
                "•\t1 pieza de naranja cortada en supremas\n" +
                "•\t1 taza de arándano deshidratado\n" +
                "•\t1/2 taza de nuez tostada y troceada\n" +
                "•\t1 pieza de pepino cortado en laminas\n" +
                "•\t1/2 taza de menta solo las hojas\n" +
                "•\t1/2 taza de aceite de oliva\n" +
                "•\t1 pizca de sal\n" +
                "•\t1 pizca de pimienta\n" +
                "•\t1/4 de taza de jugo de limón";

        pasos = "•\tEn un bowl mezcla la quínoa con el frijol pinto, el kale, las supremas de naranja, la nuez, los rollitos de pepino, las hojas de menta, el aceite de oliva, sazona a tu gusto con la sal la pimienta y el jugo de limón.\n" +
                "•\tSirve y disfruta.";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }

    public ContentValues AgregarReceta6() {
        String nombre, ingredientes, pasos;
        nombre = "Trufas de nutella";
        ingredientes = "•\1 lata de leche condensada\n" +
                "•\t1/2 taza de nutella\n" +
                "•\t Granas de chocolate";

        pasos = "•\tDisponer la leche condensada y la nutella en una cacerola.\n" +
                "•\tMezclar hasta que la masa logre la consistencia deseada.\n" +
                "•\tRetirar del fuego y dejar enfriar.\n" +
                "•\tElaborar las bolitas y pasarlas por las granas de chocolate.";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }

    public ContentValues AgregarReceta7() {
        String nombre, ingredientes, pasos;
        nombre = "Torta de nuez con Flores de Manzana";
        ingredientes = "Para la Masa:\n" +
                "•\t250 gr. de harina\n" +
                "•\t5 gr. de sal\n" +
                "•\t125 g de manteca\n" +
                "•\t1 huevo\n" +
                "•\t50 gr. de azúcar impalpable\n" +
                "Para el Relleno:\n" +
                "•\t100 gr. de nueces picadas\n" +
                "•\t100 gr. de azúcar impalpable\n" +
                "•\t100 gr. de manteca\n" +
                "•\t1 huevo\n" +
                "•\t2 cdas. de harina\n" +
                "•\t6 manzanas (3 rojas y 3 verdes)\n" +
                "•\t2 limones\n" +
                "•\t100 gr. de azúcar impalpable\n" +
                "•\tAgua caliente";

        pasos = "1.\tPara la masa:\n" +
                "2.\tEn una procesadora colocar la harina con la manteca el azúcar y el huevo\n" +
                "3.\tProcesar hasta formar una masa homogénea. Procesar nueces y colocarlas en un bowl\n" +
                "4.\tMezclar con el azúcar impalpable y la manteca hasta que se forme una pasta.\n" +
                "5.\tIncorporar los huevos y la harina tamizada. Reservar en la heladera\n" +
                "6.\tCortar las manzanas a la mitad y horizontalmente bien finitas\n" +
                "7.\tIr colocandolas en un bowl con agua caliente limón y azúcar impalpable hasta que se ablanden\n" +
                "8.\tColocar la tartera con la masa al horno unos minutos y colocar la crema de nuez.\n" +
                "9.\tArmar las rosas y colocarlas en el molde.\n" +
                "10.\tHornear por 40 minutos a 180 grados\n" +
                "11.\tTerminar decorando con azúcar impalpable.";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }

    public ContentValues AgregarReceta8() {
        String nombre, ingredientes, pasos;
        nombre = "Locro";
        ingredientes = "•\t500 grs de cebolla picada \n" +
                "•\t250 grs de morrón rojo picado \n" +
                "•\t125 grs de cebolla de verdeo cortado en rodajas finas \n" +
                "•\t8 Choclos amarillos desgranados \n" +
                "•\t500 grs Zapallo anco cortado en dados chicos \n" +
                "•\t400 grs de maíz blanco (previamente remojados de la noche anterior) \n" +
                "•\t200 grs de panceta salada cortada en cubos \n" +
                "•\t100 grs de tripa gorda cortada en cubos \n" +
                "•\t200 grs de falda cortada en cubos \n" +
                "•\t200 grs de bondiola de cerdo cortada en cubos \n" +
                "•\t100 grs de chorizo de cerdo cortado en cubos \n" +
                "•\t20gr de pimentón dulce \n" +
                "•\t15gr de comino \n" +
                "•\t20gr de ají triturado picante \n" +
                "•\t20 grs Aceite de maíz \n" +
                "•\t750cm3 de fondo de verdura\n" +
                "•\tSal y pimienta";

        pasos = "1.\tEn una cacerola grande, colocar a fuego medio la panceta salada cortada, dejar que desprenda su grasa y agregar el resto de las carnes cortadas en cubos.\n" +
                "2.\tDorar y cocinar aproximadamente por unos 15 minutos.\n" +
                "3.\tSalpimentar levemente y agregar el maíz blanco, la cebolla y el morrón.\n" +
                "4.\tRehogar bien y luego agregar el resto de los vegetales.\n" +
                "5.\tVolver a salpimentar y echar el caldo de verduras (caliente).\n" +
                "6.\tCondimentar con el comino y el pimentón.";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }

    public ContentValues AgregarReceta9() {
        String nombre, ingredientes, pasos;
        nombre = "Salteado de carne estilo mongol";
        ingredientes = "•\t400gr de corazón de cuadril \n" +
                "•\tsalsa de soja 50cm2 + c/n \n" +
                "•\t1 pizca de bicarbonato de sodio \n" +
                "•\t1 pizca de almidón de maíz \n" +
                "•\t1 huevo \n" +
                "•\t1 cdta de ajo picado \n" +
                "•\t1 cda de azúcar \n" +
                "•\t50gr de cebolla de verdeo";

        pasos = "1.\tMarinar el cuadril durante 6 horas en salsa de soja, bicarbonato de sodio, almidón de maíz y huevo.\n" +
                "2.\tFreír la carne marinada a 175 grados centígrados durante 2 minutos.\n" +
                "3.\tRetirar y conservar.\n" +
                "4.\tEn un wok agregar el ajo picado, los 50 cm2 salsa de soja y el azúcar.\n" +
                "5.\tAgregar la carne y cocinar hasta caramelizar.\n" +
                "6.\tApagar el wok, agregar la parte verde de la cebolla de verdeo en tubos de 5 cm, saltear y servir. Salpimentar a gusto.";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }

    public ContentValues AgregarReceta10() {
        String nombre, ingredientes, pasos;
        nombre = "Pinchos de lomito y panceta";
        ingredientes = "•\t1 kg de lomo de ternera limpio \n" +
                "•\t1 cucharada de ají molido \n" +
                "•\t4 papas medianas parejas \n" +
                "•\t200 g de panceta ahumada en láminas finas \n" +
                "•\t1 diente de ajo \n" +
                "•\t1 cebolla de verdeo \n" +
                "•\taceite de oliva \n" +
                "•\ttomillo fresco \n" +
                "•\tsal gruesa y pimienta negra";

        pasos = "1.\tPicar el ajo y la cebolla de verdeo y mezclar en un bol con aceite de oliva, tomillo, sal y pimienta.\n" +
                "2.\tCortar el lomo por la mitad en forma longitudinal y luego en tiras de 2 cm de ancho por 12 de largo. Salpimentar y envolver con láminas de panceta ahumada.\n" +
                "3.\tDorar en la parrilla a fuego bien alto por todos sus lados. Cortar cada cilindro en tres y pinchar con palillos de madera.\n" +
                "4.\tDurante la cocción, pintar con el aceite de verdeo.\n" +
                "5.\tLavar las papas y cocinarlas con piel en agua caliente hasta que queden algo tiernas. Retirarlas, cortarlas en rodajas de 1 cm y grillarlas de ambos lados.\n" +
                "6.\tEspolvorearlas con ají molido, sal gruesa, pimienta molida y unas gotas del aliño anterior.\n" +
                "7.\tServir cada pincho sobre una rodaja de papa grillada.";

        ContentValues partes = new ContentValues();
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(BaseDeDatos.DatosTabla.COLUMNA_PASOS, pasos);
        return partes;
    }
}
