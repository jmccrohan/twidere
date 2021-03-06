package org.mariotaku.twidere.view.iface;

public interface IColorLabelView {

	public void drawBackground(final int color);

	public void drawLabel(final int left, final int right, final int background);

	public void drawLeft(final int color);

	public void drawRight(final int color);
}
