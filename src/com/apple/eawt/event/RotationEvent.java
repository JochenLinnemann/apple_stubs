package com.apple.eawt.event;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Event encapsulating a relative rotation performed by the user.
 *
 * @see RotationListener
 * @since Java for Mac OS X 10.5 Update 7, Java for Mac OS X 10.6 Update 2
 */
public class RotationEvent extends GestureEvent {
	@SuppressWarnings("unused")
	RotationEvent(final double rotation) {
		//
	}

	/** @return an abstract measure of rotation (clockwise is negative) */
	@SuppressWarnings("static-method")
	public double getRotation() {
		return 0;
	}
}
