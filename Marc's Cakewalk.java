

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> values = new ArrayList<>();
        while (st.hasMoreTokens()){
            values.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(values);
        long sum = 0;
        int power = 0;
        for (int i=values.size()-1;i>=0;i--){
            sum+=Math.pow(2,power)*values.get(i);
            power++;
        }
        System.out.println(sum);

    }
}
