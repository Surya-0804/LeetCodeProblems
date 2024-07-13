class Solution {
    
    class Robot {
        int index;
        int position;
        int health;
        char direction;
        
        Robot(int index, int position, int health, char direction) {
            this.index = index;
            this.position = position;
            this.health = health;
            this.direction = direction;
        }
    }

    class RobotComparator implements Comparator<Robot> {
        public int compare(Robot o1, Robot o2) {
            return Integer.compare(o1.position, o2.position);
        }
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        List<Robot> robots = new ArrayList<>();
        List<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));
        
        for (int i = 0; i < n; i++) {
            robots.add(new Robot(i, positions[i], healths[i], directions.charAt(i)));
        }
        
        Collections.sort(robots, new RobotComparator());
        
        Stack<Robot> stack = new Stack<>();
        
        for (Robot robot : robots) {
            if (robot.direction == 'R') {
                stack.push(robot);
            } else {
                while (!stack.isEmpty() && stack.peek().direction == 'R' && robot.health > 0) {
                    Robot top = stack.pop();
                    if (top.health == robot.health) {
                        robot.health = 0;
                        top.health = 0;
                    } else if (top.health > robot.health) {
                        top.health--;
                        robot.health = 0;
                        stack.push(top);
                    } else {
                        robot.health--;
                    }
                }
                if (robot.health > 0) {
                    stack.push(robot);
                }
            }
        }
        
        for (Robot robot : stack) {
            result.set(robot.index, robot.health);
        }
        
        List<Integer> finalResult = new ArrayList<>();
        for (int health : result) {
            if (health > 0) {
                finalResult.add(health);
            }
        }
        
        return finalResult;
    }
}
