/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.node;

import nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TReservadaNumerica extends Token
{
    public TReservadaNumerica()
    {
        super.setText("numerica");
    }

    public TReservadaNumerica(int line, int pos)
    {
        super.setText("numerica");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReservadaNumerica(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReservadaNumerica(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TReservadaNumerica text.");
    }
}
