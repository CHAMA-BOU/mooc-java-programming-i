/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Archive {
    private String identifier;
    private String name;
    public Archive(String a, String b) {
        this.identifier=a;
        this.name=b;
    }

    @Override
    public String toString() {
        return this.identifier+": "+this.name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if(!(obj instanceof Archive)){
            return false;
        }
        Archive comparedArchive= (Archive) obj;
        if(this.identifier.equals(comparedArchive.identifier)){
            return true;
        }
        return false;
    }
    
    
}
