
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cagri
 */
public class Point {

    private ArrayList<Integer> points;

    public Point() {
        this.points = new ArrayList<>();
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }

    public void addPoints(int point) {
        if (point > -1 && point < 101) {
            this.points.add(point);
        }
    }

    public int pointCount() {
        return this.points.size();
    }

    public int passingPointCount() {
        int passingPointCount = 0;
        for (int point : this.points) {
            if (point >= 50) {
                passingPointCount++;
            }
        }
        return passingPointCount;
    }

    public int sum() {
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return sum;
    }

    public int passingSum() {
        int passingSum = 0;
        for (int point : this.points) {
            if (point >= 50) {
                passingSum += point;
            }
        }
        return passingSum;
    }

    public double allAverage() {
        return 1.0 * sum() / pointCount();
    }

    public double passingAverage() {
        return 1.0 * passingSum() / passingPointCount();
    }

    public double passPercentage() {
        return 100.0 * passingPointCount() / pointCount();
    }

    public String printStars(int amount) {
        String stars = "";
        for (int i = 0; i < amount; i++) {
            stars += "*";
        }
        return stars;
    }

    public String gradeDistribution() {
        int[] grades = new int[6];
        for (int point : this.points) {
            if (point < 50) {
                grades[0]++;
            } else if (point >= 50 && point < 60) {
                grades[1]++;
            } else if (point >= 60 && point < 70) {
                grades[2]++;
            } else if (point >= 70 && point < 80) {
                grades[3]++;
            } else if (point >= 80 && point < 90) {
                grades[4]++;
            } else {
                grades[5]++;
            }
        }

        return "Grade distribution: "
                + "\n 5: " + printStars(grades[5])
                + "\n 4: " + printStars(grades[4])
                + "\n 3: " + printStars(grades[3])
                + "\n 2: " + printStars(grades[2])
                + "\n 1: " + printStars(grades[1])
                + "\n 0: " + printStars(grades[0]);
    }
}
