

class Solution{
     public int evalRPN(String[] tokens) {
        Stack<Integer> stacks = new Stack<>();

        for (String c : tokens){
            if (c.equals("+")){
                stacks.push(stacks.pop() + stacks.pop());


            }else if (c.equals("-")){
                int a = stacks.pop();
                int b = stacks.pop();
                stacks.push(b - a);


            }else if (c.equals("*")){
                stacks.push(stacks.pop() * stacks.pop());


            }else if (c.equals("/")){
                int a = stacks.pop();
                int b = stacks.pop();
                stacks.push(b / a);


            }else {
                stacks.push(Integer.parseInt(c));//"42" is now converted it to 42 


            }

        }

        return stacks.pop();

    }
}