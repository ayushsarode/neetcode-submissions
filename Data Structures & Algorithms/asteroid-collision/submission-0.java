class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];

        int top = 0;

        for (int asteriod : asteroids) {
            boolean alive = true;

            while(alive && top > 0 && stack[top - 1] > 0 && asteriod <0) {
                int topAsteriod = stack[top - 1];

                if (topAsteriod < -asteriod) {
                    top--;
                } else if(topAsteriod == -asteriod) {
                    top--;
                    alive = false;
                } else {
                    alive = false;
                }
            }

            if(alive) {
                stack[top++] = asteriod;
            }
        }

        int[] result = new int[top];
        
System.arraycopy(stack, 0, result, 0, top); 
return result;
    }
}
// 