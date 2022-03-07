/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceAndPolymorphosm;

/**
 *
 * @author patricia
 */
class SinoTibetan extends Language {

    SinoTibetan(String languageName, int speakers) {
        super(languageName, speakers, "Asia", "subject-object-verb");
        if (languageName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}
