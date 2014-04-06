package com.apple.eawt.event;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Listener interface for receiving notification that a continuous gesture (like rotate or scale)
 * has started or stopped.
 *
 * @see MagnificationListener
 * @see RotationListener
 * @see GesturePhaseEvent
 * @see GestureUtilities
 * @since Java for Mac OS X 10.5 Update 7, Java for Mac OS X 10.6 Update 2
 */
public interface GesturePhaseListener extends GestureListener {
	/**
	 * Invoked when the user has started a continuous gesture.
	 *
	 * @param event representing the start of a continuous gesture.
	 */
	public void gestureBegan(final GesturePhaseEvent event);

	/**
	 * Invoked when the user has stopped a continuous gesture.
	 *
	 * @param event representing the end of a continuous gesture.
	 */
	public void gestureEnded(final GesturePhaseEvent event);
}
