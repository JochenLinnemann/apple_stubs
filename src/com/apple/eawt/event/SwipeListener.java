package com.apple.eawt.event;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Listener interface for receiving swipe events. A single swipe event may be both vertical and
 * horizontal simultaneously, invoking both a vertical and horizontal method.
 *
 * @see SwipeEvent
 * @see GestureUtilities
 * @since Java for Mac OS X 10.5 Update 7, Java for Mac OS X 10.6 Update 2
 */
public interface SwipeListener extends GestureListener {
	/**
	 * Invoked when an upwards swipe gesture is performed by the user.
	 *
	 * @param event representing the occurrence of a swipe.
	 */
	public void swipedUp(final SwipeEvent event);

	/**
	 * Invoked when a downward swipe gesture is performed by the user.
	 *
	 * @param event representing the occurrence of a swipe.
	 */
	public void swipedDown(final SwipeEvent event);

	/**
	 * Invoked when a leftward swipe gesture is performed by the user.
	 *
	 * @param event representing the occurrence of a swipe.
	 */
	public void swipedLeft(final SwipeEvent event);

	/**
	 * Invoked when a rightward swipe gesture is performed by the user.
	 *
	 * @param event representing the occurrence of a swipe.
	 */
	public void swipedRight(final SwipeEvent event);
}
