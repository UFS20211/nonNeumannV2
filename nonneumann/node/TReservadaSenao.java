/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.node;

import nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TReservadaSenao extends Token
{
    public TReservadaSenao()
    {
        super.setText("senao");
    }

    public TReservadaSenao(int line, int pos)
    {
        super.setText("senao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReservadaSenao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReservadaSenao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TReservadaSenao text.");
    }
}
