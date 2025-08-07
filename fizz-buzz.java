class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> a = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            boolean b = (i%3==0);
            boolean c= (i%5==0);
            if(b && !c){
                a.add("Fizz");
            }else if(!b && c){
                a.add("Buzz");
            }else if(b && c){
                a.add("FizzBuzz");
            }else{
                a.add(Integer.toString(i));
            }
        }
        return a;
    }
}
