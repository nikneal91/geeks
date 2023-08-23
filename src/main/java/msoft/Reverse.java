package msoft;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Stack;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Reverse {

    public static void main(String[] args) {
        Supplier<String> inData = () -> "i.like.this.program.very.much";
        Supplier<String> outData = () -> "i.ekil.siht.margorp.yrev.hcum";

        Stream<String> inputStream = Arrays.stream(inData.get().split("\\."));
        String result = inputStream.map( StringBuilder::new )
                .map(StringBuilder::reverse)
                .collect(Collectors.joining("."));
        System.out.println(outData.get().equals(result));

        /*
        Stack<Character> st = new Stack<>();
        int count =0;
        while(count< inData.get().length()) {
            char c = inData.get().charAt(count);
            if ( c=='.') {
                String rsult = "";
                while ( !st.isEmpty()) {
                    rsult +=  st.pop().toString();
                }
                    System.out.print(rsult + ".");
            } else {
                st.push(c);
            }
        count++;
        }
        if(!st.isEmpty()) {
            while(!st.isEmpty()) {
                System.out.print(st.pop());
            }
        }
*/

    }
}
