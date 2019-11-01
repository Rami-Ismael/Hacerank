package com.company;


import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
        // write your code here
        //https://www.hackerrank.com/challenges/bfsshortreach/problem
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while (q-->0){
            int node = in.nextInt();
            int edge = in.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i=0;i<=node;i++)
                adj.add(new ArrayList<Integer>());
            for (int i=0;i<edge;i++) {
                int u= in.nextInt();
                int v = in.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            int start  = in.nextInt();
            int[]distance = new int[node+1];
            BFS(distance,start,adj);
            StringBuilder sb = new StringBuilder();
            for (int i=1;i<=node;i++){
                if(i!=start){
                    if(distance[i]!=0)
                        sb.append(distance[i]);
                    else
                        sb.append("-1");
                    if(i!=node)
                        sb.append(" ");
                }
            }
            System.out.println(sb);
        }
    }

    private static void BFS(int[] distance, int start, ArrayList<ArrayList<Integer>> adj) {

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);
        int farfromStart =6;
        int u=0;
        while (!queue.isEmpty()){
            u = queue.poll();
            for (int i=0;i<adj.get(u).size();i++){
                int v = adj.get(u).get(i);

                if(distance[v]==0){
                    distance[v] = farfromStart+distance[u];
                    queue.add(v);
                }
            }

        }

    }
}
