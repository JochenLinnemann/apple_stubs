package com.apple.eawt.event;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.event.InputEvent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Abstract event all gestures inherit from. Note: GestureEvent is not subclass of {@link AWTEvent}
 * and is not dispatched directly from the {@link EventQueue}. This is an intentional design
 * decision to prevent collision with an official java.awt.* gesture event types subclassing
 * {@link InputEvent}. {@link GestureListener}s are only notified from the AWT Event Dispatch
 * thread.
 *
 * @see GestureUtilities
 * @since Java for Mac OS X 10.5 Update 7, Java for Mac OS X 10.6 Update 2
 */
public abstract class GestureEvent {
	GestureEvent() {
		//
	}

	/**
	 * Consuming an event prevents listeners later in the chain or higher in the component hierarchy
	 * from receiving the event.
	 */
	public void consume() {
		//
	}

	/** @return if the event has been consumed */
	@SuppressWarnings("static-method")
	protected boolean isConsumed() {
		return false;
	}
}
