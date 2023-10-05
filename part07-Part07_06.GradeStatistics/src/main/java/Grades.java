/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Grades {
    private Statistics level1;
    private Statistics level2;
    private Statistics level3;
    private Statistics level4;
    private Statistics level5;
    private Statistics level6;

    public Grades() {
        this.level1=new Statistics(0, 49);
        this.level2=new Statistics(50, 59);
        this.level3=new Statistics(60, 69);
        this.level4=new Statistics(70, 79);
        this.level5=new Statistics(80, 89);
        this.level6=new Statistics(90, 100);
    }
    public void addLevel(int input){
        this.level1.addPoint(input);
        this.level2.addPoint(input);
        this.level3.addPoint(input);
        this.level4.addPoint(input);
        this.level5.addPoint(input);
        this.level6.addPoint(input);
        
    }
    public void stars(int a){
        for(int i=0;i<a;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    public void plotstarsForObjects(Statistics a){
        if(a.emptyList()){
            System.out.println("");
            return;
        }
        this.stars(a.sizeList());
    }
    public void levelStars(){
        System.out.println("Grade distribution:");
        System.out.print("0: ");
        this.plotstarsForObjects(level1);
        System.out.print("1: ");
        this.plotstarsForObjects(level2);
        System.out.print("2: ");
        this.plotstarsForObjects(level3);
        System.out.print("3: ");
        this.plotstarsForObjects(level4);
        System.out.print("4: ");
        this.plotstarsForObjects(level5);
        System.out.print("5: ");
        this.plotstarsForObjects(level6);
    }
    
}
