/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneumann.node;

import nonneumann.analysis.*;

@SuppressWarnings("nls")
public final class TOperadorVinculacao extends Token
{
    public TOperadorVinculacao()
    {
        super.setText(":=");
    }

    public TOperadorVinculacao(int line, int pos)
    {
        super.setText(":=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOperadorVinculacao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOperadorVinculacao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOperadorVinculacao text.");
    }
}
