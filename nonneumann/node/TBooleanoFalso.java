/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.node;

import nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TBooleanoFalso extends Token
{
    public TBooleanoFalso()
    {
        super.setText("falso");
    }

    public TBooleanoFalso(int line, int pos)
    {
        super.setText("falso");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBooleanoFalso(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBooleanoFalso(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBooleanoFalso text.");
    }
}
