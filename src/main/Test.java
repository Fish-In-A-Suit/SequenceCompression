package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    private String sequence;
    //public ArrayList<HashMap<String, ArrayList<Integer>>> indexes;
    private HashMap<String, ArrayList<Integer>> indexesByLetter;

    public Test(String string) {
        sequence = string;
        indexesByLetter = new HashMap<>();
        analyse(string);
    }

    public int getNumCharacters(String s) {
        return indexesByLetter.get(s).size();
    }

    public ArrayList<Integer> getIndexes(String s) {
        return indexesByLetter.get(s);
    }

    private void analyse(String string) {
        //analizira vse črke
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b= new ArrayList<>();
        ArrayList<Integer> c= new ArrayList<>();
        ArrayList<Integer> d= new ArrayList<>();
        ArrayList<Integer> e= new ArrayList<>();
        ArrayList<Integer> f= new ArrayList<>();
        ArrayList<Integer> g= new ArrayList<>();
        ArrayList<Integer> h= new ArrayList<>();
        ArrayList<Integer> i= new ArrayList<>();
        ArrayList<Integer> j= new ArrayList<>();
        ArrayList<Integer> k= new ArrayList<>();
        ArrayList<Integer> l= new ArrayList<>();
        ArrayList<Integer> m= new ArrayList<>();
        ArrayList<Integer> n= new ArrayList<>();
        ArrayList<Integer> o= new ArrayList<>();
        ArrayList<Integer> p= new ArrayList<>();
        ArrayList<Integer> q= new ArrayList<>();
        ArrayList<Integer> r= new ArrayList<>();
        ArrayList<Integer> s= new ArrayList<>();
        ArrayList<Integer> t= new ArrayList<>();
        ArrayList<Integer> u= new ArrayList<>();
        ArrayList<Integer> v= new ArrayList<>();
        ArrayList<Integer> w= new ArrayList<>();
        ArrayList<Integer> x= new ArrayList<>();
        ArrayList<Integer> y= new ArrayList<>();
        ArrayList<Integer> z= new ArrayList<>();

        for(int iteration = 0; iteration<string.length(); iteration++) {
            String letter = Character.toString(string.charAt(iteration));
            switch(letter) {
                case "a":
                    a.add(iteration);
                    break;
                case "b":
                    b.add(iteration);
                    break;
                case "c":
                    c.add(iteration);
                    break;
                case "d":
                    d.add(iteration);
                    break;
                case "e":
                    e.add(iteration);
                    break;
                case "f":
                    f.add(iteration);
                    break;
                case "g":
                    g.add(iteration);
                    break;
                case "h":
                    h.add(iteration);
                    break;
                case "i":
                    i.add(iteration);
                    break;
                case "j":
                    j.add(iteration);
                    break;
                case "k":
                    k.add(iteration);
                    break;
                case "l":
                    l.add(iteration);
                    break;
                case "m":
                    m.add(iteration);
                    break;
                case "n":
                    n.add(iteration);
                    break;
                case "o":
                    o.add(iteration);
                    break;
                case "p":
                    p.add(iteration);
                    break;
                case "q":
                    q.add(iteration);
                    break;
                case "r":
                    r.add(iteration);
                    break;
                case "s":
                    s.add(iteration);
                    break;
                case "t":
                    t.add(iteration);
                    break;
                case "u":
                    u.add(iteration);
                    break;
                case "v":
                    v.add(iteration);
                    break;
                case "w":
                    w.add(iteration);
                    break;
                case "x":
                    x.add(iteration);
                    break;
                case "y":
                    y.add(iteration);
                    break;
                case "z":
                    z.add(iteration);
                    break;


            }
        }

        /*
        HashMap<String, ArrayList<Integer>> a_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> b_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> c_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> d_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> e_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> f_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> g_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> h_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> i_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> j_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> k_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> l_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> m_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> n_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> o_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> p_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> q_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> r_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> s_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> t_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> u_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> v_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> w_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> x_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> y_= new HashMap<>();
        HashMap<String, ArrayList<Integer>> z_= new HashMap<>();

        a_.put("a", a);
        b_.put("b", b);
        c_.put("c", c);
        d_.put("d", d);
        e_.put("e", e);
        f_.put("f", f);
        g_.put("g", g);
        h_.put("h", h);
        i_.put("i", i);
        j_.put("j", j);
        k_.put("k", k);
        l_.put("l", l);
        m_.put("m", m);
        n_.put("n", n);
        o_.put("o", o);
        p_.put("p", p);
        q_.put("q", q);
        r_.put("r", r);
        s_.put("s", s);
        t_.put("t", t);
        u_.put("u", u);
        v_.put("v", v);
        w_.put("w", w);
        x_.put("x", x);
        y_.put("y", y);
        z_.put("z", z);
        */

        indexesByLetter.put("a", a);
        indexesByLetter.put("b", b);
        indexesByLetter.put("c", c);
        indexesByLetter.put("d", d);
        indexesByLetter.put("e", e);
        indexesByLetter.put("f", f);
        indexesByLetter.put("g", g);
        indexesByLetter.put("h", h);
        indexesByLetter.put("i", i);
        indexesByLetter.put("j", j);
        indexesByLetter.put("k", k);
        indexesByLetter.put("l", l);
        indexesByLetter.put("m", m);
        indexesByLetter.put("n", n);
        indexesByLetter.put("o", o);
        indexesByLetter.put("p", p);
        indexesByLetter.put("q", q);
        indexesByLetter.put("r", r);
        indexesByLetter.put("s", s);
        indexesByLetter.put("t", t);
        indexesByLetter.put("u", u);
        indexesByLetter.put("v", v);
        indexesByLetter.put("w", w);
        indexesByLetter.put("x", x);
        indexesByLetter.put("y", y);
        indexesByLetter.put("z", z);

        /*
        indexes.add(a_);
        indexes.add(b_);
        indexes.add(c_);
        indexes.add(d_);
        indexes.add(e_);
        indexes.add(f_);
        indexes.add(g_);
        indexes.add(h_);
        indexes.add(i_);
        indexes.add(j_);
        indexes.add(k_);
        indexes.add(l_);
        indexes.add(m_);
        indexes.add(n_);
        indexes.add(o_);
        indexes.add(p_);
        indexes.add(q_);
        indexes.add(r_);
        indexes.add(s_);
        indexes.add(t_);
        indexes.add(u_);
        indexes.add(v_);
        indexes.add(w_);
        indexes.add(x_);
        indexes.add(y_);
        indexes.add(z_);
        */

    }
}
