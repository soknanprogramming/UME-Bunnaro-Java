/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Soknan Poch
 */
public class StudentScore {
    public StudentScore(double scoreJava, double scoreCSharp, double scoreNetwork){
        this.scoreJava = scoreJava;
        this.scoreCSharp = scoreCSharp;
        this.scoreNetwork = scoreNetwork;
    }
    public StudentScore(double scoreJava, double scoreCSharp){
        this(scoreJava, scoreCSharp, 0);
    }
    public StudentScore(double scoreJava){
        this(scoreJava, 0, 0);
    }
    private double scoreJava;
    private double scoreCSharp;
    private double scoreNetwork;
    public void setScoreJava(double scoreJava){
        this.scoreJava = scoreJava;
    }
    public void setScoreCSharp(double scoreCSharp){
        this.scoreCSharp = scoreCSharp;
    }
    public void setScoreNetwork(double scoreNetwork){
        this.scoreNetwork = scoreNetwork;
    }
    public double getTotalScore(){
        return this.scoreJava + this.scoreCSharp + this.scoreNetwork;
    }
    public double getAverage(){
        double total = this.getTotalScore();
        return total /3;
    }
    public String getResult(){
        double average = this.getAverage();
        if(average >= 50){
            return "Pass";
        }else{
            return "Fail";
        }
    }
    public String getGrade(){
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else if (avg >= 50) return "E";
        else return "F";
    }
}
