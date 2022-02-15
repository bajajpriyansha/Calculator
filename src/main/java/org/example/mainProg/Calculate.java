package org.example.mainProg;
import org.example.api.calcService;

public class Calculate {
    private calcService calci;
    public Calculate(calcService calci)
    {
        this.calci=calci;
    }


    public int check(String operator, int x, int y)
    {

        if(operator=="+")
          return this.calci.add(x,y);
        else if(operator=="-")
          return this.calci.subtract(x,y);
        else if(operator=="*")
          return this.calci.multiply(x,y);
        else
         return this.calci.divide(x,y);

    }
}
