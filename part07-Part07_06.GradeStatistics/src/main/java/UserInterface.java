/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class UserInterface {
    private Scanner scan;
    private Points points;
    private Grades gride;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.points= new Points();
        this.gride= new Grades();
    }
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            
            int input= Integer.valueOf(this.scan.nextLine());
            if (input==-1){
                break;
            }
            this.points.addPoints(input);
            this.gride.addLevel(input);
        }
        // do this after
        this.doAfterWhile();
    }
    public void doAfterWhile(){
        this.points.printingAverage();
        this.gride.levelStars();
    }
}
