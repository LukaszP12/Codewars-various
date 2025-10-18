class BouncingBalls_6kyu {

    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        int count = 0;
        // The ball is seen the first time it falls past the window
        count = 1;
        // Now simulate subsequent bounce heights
        double currentHeight = h * bounce;
        // Each time the ball bounces up above the window → seen going up, and then when coming down (if still above)
        while (currentHeight > window){
            // seen going up
            count++;
            // seen coming down
            count++;
            // update height for next bounce
            currentHeight = currentHeight * bounce;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0,0.66,1.5));
    }
}
