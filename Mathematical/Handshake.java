package HackerRank_Questions.Mathematical;

// Link

// https://www.hackerrank.com/challenges/handshake/problem

public class Handshake {

    public void mainHandshake(){
        System.out.println(handshake(2));
        System.out.println(handshake(3));
        System.out.println(handshake(4));
    }

    public int handshake(int n){
        return ( n*(n-1) )/ 2;
    }

    public int ncr(int n, int r){
        return ( factorial(n) / (factorial(r)*factorial(n-r) ) );
    }

    public int factorial(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}

// Solution
//I (PersonA) am one out of N people, so I need to shake hands with (N-1) people. This reasoning holds true for all of the N people, so the number of hand shakes is N * (N-1). Now that PersonA and PersonB shook hands, PersonB and PersonA (same people, but from PersonB's perspective) don't need to shake anymore. So we initially counted each combination twice. Therefore, the number of hand shakes is nShakes = (N * (N-1)) / 2