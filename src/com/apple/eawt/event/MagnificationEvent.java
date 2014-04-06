package com.apple.eawt.event;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Event encapsulating a relative magnification scale performed by the user.
 *
 * @see MagnificationListener
 * @since Java for Mac OS X 10.5 Update 7, Java for Mac OS X 10.6 Update 2
 */
public class MagnificationEvent extends GestureEvent {
	@SuppressWarnings("unused")
	MagnificationEvent(final double magnification) {
		//
	}

	/** @return an abstract measure of magnification scale (both positive and negative) */
	@SuppressWarnings("static-method")
	public double getMagnification() {
		return 1;
	}
}
