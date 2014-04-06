package com.apple.eawt.event;

import javax.swing.JComponent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Abstract adapter class for receiving gesture events. This class is provided as a convenience for
 * creating listeners. Subclasses registered with
 * {@link GestureUtilities#addGestureListenerTo(JComponent, GestureListener)} will receive all
 * phase, magnification, rotation, and swipe events.
 *
 * @see GestureUtilities
 * @since Java for Mac OS X 10.5 Update 7, Java for Mac OS X 10.6 Update 2
 */
public abstract class GestureAdapter implements GesturePhaseListener, MagnificationListener, RotationListener, SwipeListener {
	@Override
	public void gestureBegan(final GesturePhaseEvent event) {
		//
	}

	@Override
	public void gestureEnded(final GesturePhaseEvent event) {
		//
	}

	@Override
	public void magnify(final MagnificationEvent event) {
		//
	}

	@Override
	public void rotate(final RotationEvent event) {
		//
	}

	@Override
	public void swipedDown(final SwipeEvent event) {
		//
	}

	@Override
	public void swipedLeft(final SwipeEvent event) {
		//
	}

	@Override
	public void swipedRight(final SwipeEvent event) {
		//
	}

	@Override
	public void swipedUp(final SwipeEvent event) {
		//
	}
}
