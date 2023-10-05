/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.ArrayList;
public class Statistics {
    private ArrayList<Integer> points;
    int min;
    int max;

    public Statistics(int min, int max) {
        this.points = new ArrayList<>();
        this.min=min;
        this.max=max;
    }
    public void addPoint(int number){
        if(number<= this.max && number>= this.min){
            this.points.add(number);
        }
    }
    public boolean emptyList(){
        return(this.points.isEmpty());
    }
    public int sumPoints(){
        if (this.emptyList()){
            return 0;
        }
        int sum=0;
        for(int i:this.points){
            sum+=i;
        }
        return sum;
    }
    public int sizeList(){
        return this.points.size();
    }
    public void pointsAverage(){
        if(this.points.isEmpty()){
            System.out.println("-");
            return;
        }
        System.out.println(1.0*this.sumPoints()/this.sizeList());
    }
}
