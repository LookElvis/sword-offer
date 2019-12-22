package PublicClass;

import S11_20.S20;

/**
 * Created by Elvis on 2019/12/22.
 */
public class Main {
    public static void main(String[] args) {
        S20 s = new S20();
        s.push(7);
        s.push(8);
        s.pop();
        s.push(4);
        s.push(3);
        s.pop();
        s.push(1);
        s.pop();
        s.push(6);
        s.push(3);
        s.pop();
        s.push(7);
        System.out.println(s.min());
    }
}
