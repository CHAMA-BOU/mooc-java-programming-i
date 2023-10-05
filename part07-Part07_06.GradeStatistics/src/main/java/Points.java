/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Points {
    private Statistics allPoints;
    private Statistics passingPoints;

    public Points() {   
        this.allPoints=new Statistics(0, 100);
        this.passingPoints=new Statistics(50, 100);
    }
    public void addPoints(int input){
        this.allPoints.addPoint(input);
        this.passingPoints.addPoint(input);
    }
    public void allPointsAverage(){
        this.allPoints.pointsAverage();
    }
    public void passingPointsAverage(){
        this.passingPoints.pointsAverage();
    }
    public double passingPercentage(){
        if (this.passingPoints.emptyList()){
            return 0.0;
        }
        return 100*(1.0*passingPoints.sizeList()/allPoints.sizeList());
    }
    public void printingAverage(){
        System.out.print("Point average (all): ");
        allPointsAverage();
        System.out.print("Point average (passing): ");
        passingPointsAverage();
        System.out.print("Pass percentage: ");
        System.out.println(this.passingPercentage());
    }
    
}
